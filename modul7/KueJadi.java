class KueJadi extends Kue {
    public double jumlah;

    KueJadi(String n, double h, double j) {
        super(n, h);
        jumlah = j;
    }

    double hitungHarga() {
        return harga * jumlah * 2;
    }

    public String toString() {
        return "Jadi: " + nama + " | " + hitungHarga();
    }
}