public class MainKue {
    public static void main(String[] args) {

        Kue[] k = new Kue[20];

        k[0]=new KuePesanan("Brownies",20000,1.5);
        k[1]=new KueJadi("Donat Kecil",5000,10);
        k[2]=new KuePesanan("Donat Besar",30000,2);
        k[3]=new KueJadi("Kue Cubit",2000,15);
        k[4]=new KuePesanan("Cheesecake",40000,1);
        k[5]=new KueJadi("Cupcake",300000,20);
        k[6]=new KuePesanan("Tiramisu",35000,1.2);
        k[7]=new KueJadi("Chocolate Coins",2500,25);
        k[8]=new KuePesanan("Red Velvet",45000,1.5);
        k[9]=new KueJadi("Sprinkles",1500,30);
        k[10]=new KuePesanan("Black Forest",50000,2);
        k[11]=new KueJadi("Chocolate Rolls",2000,18);
        k[12]=new KuePesanan("Matcha Cake",42000,1.3);
        k[13]=new KueJadi("Mini Pancakes",3000,22);
        k[14]=new KuePesanan("Chiffon",28000,1.7);
        k[15]=new KueJadi("Dorayaki",2500,12);
        k[16]=new KuePesanan("Edge Brownie",55000,1.1);
        k[17]=new KueJadi("ChocCheese Cake",2000,16);
        k[18]=new KuePesanan("Vanilla Cake",30000,1.4);
        k[19]=new KueJadi("Custom Donuts",3500,14);

        double t=0,tp=0,tb=0,tj=0,tt=0;
        Kue max=k[0];

        System.out.println("=========================================================");
        System.out.println("                    DAFTAR KUE                          ");
        System.out.println("=========================================================");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n",
                "Nama", "Jenis", "Harga", "Qty", "Total");
        System.out.println("---------------------------------------------------------");

        for (Kue x : k) {

            String jenis = (x instanceof KuePesanan) ? "Pesanan" : "Jadi";
            double qty = (x instanceof KuePesanan) ?
                    ((KuePesanan)x).berat :
                    ((KueJadi)x).jumlah;

            double h = x.hitungHarga();

            //total semua
            t += h;

            //KuePesanan
            if (x instanceof KuePesanan) {
                tp += h;
                tb += ((KuePesanan)x).berat;
            }

            //KueJadi
            else {
                tj += h;
                tt += ((KueJadi)x).jumlah;
            }

            //terbesar
            if (h > max.hitungHarga()) max = x;

            System.out.printf("%-15s %-10s %-10.0f %-10.1f %-10.0f\n",
                    x.nama, jenis, x.harga, qty, h);
        }

        System.out.println("\n=========================================================");
        System.out.println("                     RINGKASAN                          ");
        System.out.println("=========================================================");

        System.out.printf("Total Semua Kue : %.0f\n", t);

        System.out.printf("\nKue Pesanan\n");
        System.out.printf("Total Harga : %.0f\n", tp);
        System.out.printf("Total Berat : %.1f\n", tb);

        System.out.printf("\nKue Jadi\n");
        System.out.printf("Total Harga : %.0f\n", tj);
        System.out.printf("Total Jumlah: %.1f\n", tt);

        System.out.println("\n=========================================================");
        System.out.println("                   KUE TERMAHAL                         ");
        System.out.println("=========================================================");

        System.out.printf("Nama  : %s\n", max.nama);
        System.out.printf("Jenis : %s\n",
                (max instanceof KuePesanan) ? "Pesanan" : "Jadi");
        System.out.printf("Total : %.0f\n", max.hitungHarga());
    }
}