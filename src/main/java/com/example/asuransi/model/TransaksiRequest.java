@Data
public class TransaksiRequest {
    private Long id;
    private String kodeProduk;
    private String namaTertanggung;
    private String nomorKTP;
    private String email;
    private String nomerTelp;
    private LocalDate jangkaWaktuAwal;
    private LocalDate jangkaWaktuAkhir;
    private String informasiKepemilikan;
    private String alamat;
    private String namaAhliWaris;
    private LocalDate tanggalLahirAhliWaris;
    private String nomerTelpAhliWaris;
    private String hubungan;
    private String jenisPaket;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public String getNamaTertanggung() {
        return namaTertanggung;
    }

    public void setNamaTertanggung(String namaTertanggung) {
        this.namaTertanggung = namaTertanggung;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public void setNomorKTP(String nomorKTP) {
        this.nomorKTP = nomorKTP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomerTelp() {
        return nomerTelp;
    }

    public void setNomerTelp(String nomerTelp) {
        this.nomerTelp = nomerTelp;
    }

    public LocalDate getJangkaWaktuAwal() {
        return jangkaWaktuAwal;
    }

    public void setJangkaWaktuAwal(LocalDate jangkaWaktuAwal) {
        this.jangkaWaktuAwal = jangkaWaktuAwal;
    }

    public LocalDate getJangkaWaktuAkhir() {
        return jangkaWaktuAkhir;
    }

    public void setJangkaWaktuAkhir(LocalDate jangkaWaktuAkhir) {
        this.jangkaWaktuAkhir = jangkaWaktuAkhir;
    }

    public String getInformasiKepemilikan() {
        return informasiKepemilikan;
    }

    public void setInformasiKepemilikan(String informasiKepemilikan) {
        this.informasiKepemilikan = informasiKepemilikan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaAhliWaris() {
        return namaAhliWaris;
    }

    public void setNamaAhliWaris(String namaAhliWaris) {
        this.namaAhliWaris = namaAhliWaris;
    }

    public LocalDate getTanggalLahirAhliWaris() {
        return tanggalLahirAhliWaris;
    }

    public void setTanggalLahirAhliWaris(LocalDate tanggalLahirAhliWaris) {
        this.tanggalLahirAhliWaris = tanggalLahirAhliWaris;
    }

    public String getNomerTelpAhliWaris() {
        return nomerTelpAhliWaris;
    }

    public void setNomerTelpAhliWaris(String nomerTelpAhliWaris) {
        this.nomerTelpAhliWaris = nomerTelpAhliWaris;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void setHubungan(String hubungan) {
        this.hubungan = hubungan;
    }

    public String getJenisPaket() {
        return jenisPaket;
    }

    public void setJenisPaket(String jenisPaket) {
        this.jenisPaket = jenisPaket;
    }
}
