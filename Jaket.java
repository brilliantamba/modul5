public class Jaket {

    public final int hargaA = 100000;
    public final int hargaB = 125000;
    public final int hargaC = 175000;

    public int hitungHargaA(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 95000;
        } else {
            return jumlah * hargaA;
        }
    }

    public int hitungHargaB(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 120000;
        } else {
            return jumlah * hargaB;
        }
    }

    public int hitungHargaC(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 160000;
        } else {
            return jumlah * hargaC;
        }
    }
}