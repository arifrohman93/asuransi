@Entity
@Table(name = "m_transactions")
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String certificateNumber;
    private String kodeProduk;
    private String namaTertanggung;
    private String nomerKTP;
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
    private LocalDate created_date;
    private String modified_by;
    private LocalDate modified_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getNamaTertanggung() {
        return namaTertanggung;
    }

    public void setNamaTertanggung(String namaTertanggung) {
        this.namaTertanggung = namaTertanggung;
    }

    public String getNomerKTP() {
        return nomerKTP;
    }

    public void setNomerKTP(String nomerKTP) {
        this.nomerKTP = nomerKTP;
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

    public LocalDate getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }

    public LocalDate getModified_date() {
        return modified_date;
    }

    public void setModified_date(LocalDate modified_date) {
        this.modified_date = modified_date;
    }
}
