// - private + public
// bikin yg pake parameter sama yg ga make

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia() {}

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    // setter
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    // getter
    public String getNik(){
        return nik;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) return 25;
            else return 20;
        }
        return 15;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return String.format(
            "Nama           : %s\n" +
            "NIK            : %s\n" +
            "Jenis Kelamin  : %s\n" +
            "Pendapatan     : $%.2f",
            nama,
            nik,
            jenisKelamin ? "Laki-laki" : "Perempuan",
            getPendapatan()
        );
    }
}