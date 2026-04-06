public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int year, int month, int day, int jumlahAnak,
                   String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, year, month, day, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public double getTunjanganManager() {
        return 0.1 * super.getGaji();
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getTunjanganManager();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Departemen     : " + departemen;
    }
}