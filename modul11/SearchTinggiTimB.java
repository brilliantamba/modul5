import java.util.ArrayList;
import java.util.Collections;

public class SearchTinggiTimB {
    public static void main(String[] args) {

        ArrayList<Integer> timB = new ArrayList<Integer>();

        Collections.addAll(timB, 170, 167, 165, 166, 168, 175, 172, 171, 168, 169);

        Collections.sort(timB);

        int tinggi168 = Collections.frequency(timB, 168);
        int tinggi160 = Collections.frequency(timB, 160);

        System.out.println("Jumlah pemain tinggi 168 cm : " + tinggi168);
        System.out.println("Jumlah pemain tinggi 160 cm : " + tinggi160);
    }
}