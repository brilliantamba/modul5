import java.io.File;

public class UkuranFile {
    public static void main(String[] args) {

        File file = new File("test.txt");

        long ukuran = file.length();

        if (ukuran < 1024 * 1024) {

            double kb = ukuran / 1024.0;
            System.out.println("Ukuran file: " + kb + " KB");

        } else {

            double mb = ukuran / (1024.0 * 1024);
            System.out.println("Ukuran file: " + mb + " MB");

        }
    }
}