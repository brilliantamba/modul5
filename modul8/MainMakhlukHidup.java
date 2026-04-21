import java.util.Scanner;

public class MainMakhlukHidup {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Objek pertama (constructor berparameter)
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        Manusia user1 = new Manusia(nama, umur);

        System.out.println("\n=== Objek Pertama ===");
        user1.tampilkanNama();
        user1.tampilkanUmur();

        // Objek kedua (method berbeda: setter)
        Manusia user2 = new Manusia();

        user2.setNama("Kai");
        user2.setUmur(19);

        System.out.println("\n=== Objek Kedua ===");
        user2.tampilkanNama();
        user2.tampilkanUmur();

        input.close();

    }

}

        //Manusia m1 = new Manusia();
        //Hewan h1 = new Hewan();
        
        //Manusia bri = new Manusia("Bri", 19);
        
        //bri.tampilkanNama();
        //bri.tampilkanUmur();
        //bri.makan();
        //bri.berjalan();
        //bri.bersuara();

        //System.out.println("=== Manusia ===");
        //m1.makan();
        //m1.berjalan();
        //m1.bersuara();
        //m1.tampilkanNama();
        //m1.tampilkanUmur();

        //System.out.println();

        //System.out.println("=== Hewan ===");
        //h1.makan();
        //h1.berjalan();
        //h1.bersuara();
        //h1.tampilkanNama();
        //h1.tampilkanUmur();

    //}

//}