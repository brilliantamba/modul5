abstract class Kue {
    public String nama;
    public double harga;

    Kue(String n, double h) {
        nama = n;
        harga = h;
    }

    abstract double hitungHarga();

    public String toString() {
        return nama + " (" + harga + ")";
    }
}