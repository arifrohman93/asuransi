@Service
@RequiredArgsConstructor
public class TransaksiService {

    private final TransaksiRepository transaksiRepository;

    public TransaksiResponse createTransaksi(TransaksiRequest request) {
        String nomorSertifikat = generateNomorSertifikat(request.getKodeProduk());

        BigDecimal nilaiPremi = hitungPremi(request);

        Transaksi transaksi = new Transaksi();
        transaksi.setKodeProduk(request.getKodeProduk());
        transaksi.setNamaTertanggung(request.getNamaTertanggung());
        transaksi.setNomorKTP(request.getNomorKTP());
        transaksi.setNomorTelepon(request.getNomorTelepon());
        transaksi.setJenisPaket(request.getJenisPaket());
        transaksi.setNilaiPremi(nilaiPremi);
        transaksi.setNomorSertifikat(nomorSertifikat);

        transaksiRepository.save(transaksi);

        return new TransaksiResponse(transaksi.getId(), transaksi.getNomorSertifikat(), transaksi.getNilaiPremi());
    }

    private String generateNomorSertifikat(String kodeProduk) {
        String nomorUrut = String.format("%05d", transaksiRepository.count() + 1);
        String bulan = RomanConverter.toRoman(LocalDate.now().getMonthValue());
        String tahun = String.valueOf(LocalDate.now().getYear());
        return nomorUrut + "/" + kodeProduk + "/" + bulan + "/" + tahun;
    }

    private BigDecimal hitungPremi(TransaksiRequest request) {
        BigDecimal basePremi = BigDecimal.ZERO;
        switch (request.getKodeProduk()) {
            case "9001":
                basePremi = getBasePremiRumahku(request.getJenisPaket());
                break;
            case "9002":
                basePremi = getBasePremiBahari(request.getJenisPaket());
                break;
        }

        long days = ChronoUnit.DAYS.between(request.getJangkaWaktuAwal(), request.getJangkaWaktuAkhir());
        return basePremi.multiply(BigDecimal.valueOf(days)).divide(BigDecimal.valueOf(365), 2, RoundingMode.HALF_UP);
    }

    private BigDecimal getBasePremiRumahku(String jenisPaket) {
        switch (jenisPaket) {
            case "Silver": return new BigDecimal("40000");
            case "Gold": return new BigDecimal("50000");
            case "Platinum": return new BigDecimal("60000");
            default: throw new IllegalArgumentException("Jenis Paket tidak valid");
        }
    }

    private BigDecimal getBasePremiBahari(String jenisPaket) {
        switch (jenisPaket) {
            case "Silver": return new BigDecimal("70000");
            case "Gold": return new BigDecimal("80000");
            case "Platinum": return new BigDecimal("90000");
            default: throw new IllegalArgumentException("Jenis Paket tidak valid");
        }
    }
}
