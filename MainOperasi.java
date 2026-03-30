public class MainOperasi {
    public static void main(String[] args) {

        // static method
        System.out.println("Penjumlahan: " + OperasiMatematika.tambah(10, 5));
        System.out.println("Pengurangan: " + OperasiMatematika.kurang(10, 5));

        // non-static method
        OperasiMatematika obj = new OperasiMatematika();

        System.out.println("Perkalian: " + obj.kali(10, 5));
        System.out.println("Pembagian: " + obj.bagi(10, 5));
        System.out.println("Sederhana 8/12: " + obj.sederhana(8, 12));
    }
}