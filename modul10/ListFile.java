import java.io.File;

public class ListFile {
    public static void main(String[] args) {

        File folder = new File("D:\\Brilli Kuliah");

        String[] daftarFile = folder.list();

        for (String namaFile : daftarFile) {
            System.out.println(namaFile);
        }

    }
}