public class MainJaket {
    public static void main(String[] args) {

        Jaket j = new Jaket();

        int jumlahA = 120;
        int jumlahB = 90;
        int jumlahC = 110;

        // harga normal
        int normalA = jumlahA * j.hargaA;
        int normalB = jumlahB * j.hargaB;
        int normalC = jumlahC * j.hargaC;

        int totalNormal = normalA + normalB + normalC;

        // harga setelah diskon
        int hargaA = j.hitungHargaA(jumlahA);
        int hargaB = j.hitungHargaB(jumlahB);
        int hargaC = j.hitungHargaC(jumlahC);

        int totalAkhir = hargaA + hargaB + hargaC;

        int totalDiskon = totalNormal - totalAkhir;

        System.out.println("======================================");
        System.out.println("           CV. LABKOMDAS              ");
        System.out.println("         STRUK PEMBELIAN JAKET        ");
        System.out.println("======================================");

        System.out.println("Jaket A  x " + jumlahA + " = Rp " + normalA);
        if (jumlahA > 100) {
            System.out.println("  *Diskon A: Rp " + (normalA - hargaA));
        }

        System.out.println("Jaket B  x " + jumlahB + " = Rp " + normalB);
        if (jumlahB > 100) {
            System.out.println("  *Diskon B: Rp " + (normalB - hargaB));
        }

        System.out.println("Jaket C  x " + jumlahC + " = Rp " + normalC);
        if (jumlahC > 100) {
            System.out.println("  *Diskon C: Rp " + (normalC - hargaC));
        }

        System.out.println("--------------------------------------");
        System.out.println("TOTAL SEBELUM DISKON = Rp " + totalNormal);
        System.out.println("TOTAL DISKON         = Rp " + totalDiskon);
        System.out.println("--------------------------------------");
        System.out.println("TOTAL BAYAR          = Rp " + totalAkhir);
        System.out.println("======================================");
        System.out.println("             Terima kasih             ");
        System.out.println("======================================");
    }
}