public class Main {
    public static void main(String[] args) {

        // Manusia
        Manusia a = new Manusia("Abi", true, "111", true);
        System.out.println(a + "\n");
 
        // Mahasiswa
        MahasiswaFILKOM b = new MahasiswaFILKOM(
                "Sheva", false, "222", false,
                "165150300111100", 4.0
        );
        System.out.println(b + "\n");

        // Pekerja
        Pekerja c = new Pekerja(
                1000, 2016, 3, 2, 4,
                "Raja", "333", true, true
        );
        System.out.println(c + "\n");

        // Manager
        Manager d = new Manager(
                "HRD", 7500, 2010, 1, 1, 3,
                "MarkNCT", "111", true, true
        );
        System.out.println(d);
    }
}