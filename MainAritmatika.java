import java.util.Scanner;

public class MainAritmatika {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("masukkan nilai 1 : ");
        int nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil2 = in.nextInt();

        Aritmatika.hitungPengurangan(nil1, nil2);

        System.out.print("masukkan nilai 1 : ");
        nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nil2 = in.nextInt();

        Aritmatika.hitungPerkalian(nil1, nil2);

        System.out.print("masukkan nilai 1 : ");
        int value1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int value2 = in.nextInt();

        Aritmatika a = new Aritmatika();
        a.hitungPenjumlahan(value1, value2);

        // pemanggilan method pembagian
        double hasil = a.hitungPembagian("10", "2");
        System.out.println("hasil pembagian adalah : " + hasil);
    }
}