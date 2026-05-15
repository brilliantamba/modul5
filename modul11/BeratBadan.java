import java.util.ArrayList;
import java.util.Collections;

public class BeratBadan {
    public static void main(String[] args) {

        ArrayList<Integer> timA = new ArrayList<Integer>();
        ArrayList<Integer> timB = new ArrayList<Integer>();

        // tim a
        timA.add(50);
        timA.add(60);
        timA.add(56);
        timA.add(55);
        timA.add(60);
        timA.add(70);
        timA.add(66);
        timA.add(56);
        timA.add(72);
        timA.add(56);

        // tim b
        timB.add(66);
        timB.add(60);
        timB.add(59);
        timB.add(58);
        timB.add(58);
        timB.add(71);
        timB.add(68);
        timB.add(68);
        timB.add(65);
        timB.add(60);

        // a
        Collections.sort(timA);
        Collections.sort(timB);

        System.out.println("Berat Tim A Ascending : " + timA);
        System.out.println("Berat Tim B Ascending : " + timB);

        // d
        Collections.sort(timA, Collections.reverseOrder());
        Collections.sort(timB, Collections.reverseOrder());

        System.out.println("Berat Tim A Descending : " + timA);
        System.out.println("Berat Tim B Descending : " + timB);
    }
}