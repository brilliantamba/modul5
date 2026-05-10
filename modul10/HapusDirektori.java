import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {

        File folder = new File("D:\\TestCase Modul 10 Pemlan");

        File[] daftarFile = folder.listFiles();

        if (daftarFile != null) {

            for (File file : daftarFile) {
                file.delete();
            }

            folder.delete();

            System.out.println("Folder berhasil dihapus");

        } else {
            System.out.println("Folder tidak ditemukan");
        }

    }
}