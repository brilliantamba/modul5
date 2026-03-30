public class OperasiMatematika {

    // static method
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    // non-static method
    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        return (double) a / b;
    }

    // method menyederhanakan pecahan
    public String sederhana(int pembilang, int penyebut) {
        int gcd = fpb(pembilang, penyebut);
        pembilang /= gcd;
        penyebut /= gcd;
        return pembilang + "/" + penyebut;
    }

    // method fpb
    private int fpb(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}