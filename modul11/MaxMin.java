import java.util.ArrayList;
import java.util.Collections;

public class MaxMin {
    public static void main(String[] args) {

        ArrayList<Integer> tinggiA = new ArrayList<Integer>();
        ArrayList<Integer> tinggiB = new ArrayList<Integer>();

        ArrayList<Integer> beratA = new ArrayList<Integer>();
        ArrayList<Integer> beratB = new ArrayList<Integer>();

        // tb tim a
        Collections.addAll(tinggiA, 168, 170, 165, 168, 172, 170, 169, 165, 171, 166);
        // tb tim b
        Collections.addAll(tinggiB, 170, 167, 165, 166, 168, 175, 172, 171, 168, 169);
        // bb tim a
        Collections.addAll(beratA, 50, 60, 56, 55, 60, 70, 66, 56, 72, 56);
        // bb tim b
        Collections.addAll(beratB, 66, 60, 59, 58, 58, 71, 68, 68, 65, 60);

        System.out.println("TINGGI TIM A");
        System.out.println("Maksimum : " + Collections.max(tinggiA));
        System.out.println("Minimum  : " + Collections.min(tinggiA));

        System.out.println("\nTINGGI TIM B");
        System.out.println("Maksimum : " + Collections.max(tinggiB));
        System.out.println("Minimum  : " + Collections.min(tinggiB));

        System.out.println("\nBERAT TIM A");
        System.out.println("Maksimum : " + Collections.max(beratA));
        System.out.println("Minimum  : " + Collections.min(beratA));

        System.out.println("\nBERAT TIM B");
        System.out.println("Maksimum : " + Collections.max(beratB));
        System.out.println("Minimum  : " + Collections.min(beratB));
    }
}