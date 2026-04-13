class KuePesanan extends Kue {
    public double berat;

    KuePesanan(String n, double h, double b) {
        super(n, h);
        berat = b;
    }

    double hitungHarga() {
        return harga * berat;
    }

    public String toString() {
        return "Pesanan: " + nama + " | " + hitungHarga();
    }
}