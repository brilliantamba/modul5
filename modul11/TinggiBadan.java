import java.util.ArrayList;
import java.util.Collections;

public class TinggiBadan {
    public static void main(String[] args) {

        ArrayList<Integer> timA = new ArrayList<Integer>();
        ArrayList<Integer> timB = new ArrayList<Integer>();

        // tim b
        timA.add(168);
        timA.add(170);
        timA.add(165);
        timA.add(168);
        timA.add(172);
        timA.add(170);
        timA.add(169);
        timA.add(165);
        timA.add(171);
        timA.add(166);

        // tim b
        timB.add(170);
        timB.add(167);
        timB.add(165);
        timB.add(166);
        timB.add(168);
        timB.add(175);
        timB.add(172);
        timB.add(171);
        timB.add(168);
        timB.add(169);

        // a
        Collections.sort(timA);
        Collections.sort(timB);

        System.out.println("Tinggi Tim A Ascending : " + timA);
        System.out.println("Tinggi Tim B Ascending : " + timB);

        // d
        Collections.sort(timA, Collections.reverseOrder());
        Collections.sort(timB, Collections.reverseOrder());

        System.out.println("Tinggi Tim A Descending : " + timA);
        System.out.println("Tinggi Tim B Descending : " + timB);
    }
}