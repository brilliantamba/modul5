import java.util.ArrayList;
import java.util.Collections;

public class SearchBeratTimA {
    public static void main(String[] args) {

        ArrayList<Integer> timA = new ArrayList<Integer>();

        Collections.addAll(timA, 50, 60, 56, 55, 60, 70, 66, 56, 72, 56);

        Collections.sort(timA);

        int berat56 = Collections.frequency(timA, 56);
        int berat53 = Collections.frequency(timA, 53);

        System.out.println("Jumlah pemain berat 56 kg : " + berat56);
        System.out.println("Jumlah pemain berat 53 kg : " + berat53);
    }
}