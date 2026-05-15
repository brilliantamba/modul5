import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTim {
    public static void main(String[] args) {

        // tb tim a
        ArrayList<Integer> timA = new ArrayList<Integer>();
        Collections.addAll(timA, 168, 170, 165, 168, 172, 170, 169, 165, 171, 166);

        // tb tim b
        ArrayList<Integer> timB = new ArrayList<Integer>();
        Collections.addAll(timB, 170, 167, 165, 166, 168, 175, 172, 171, 168, 169);

        System.out.println("Data Tim A : " + timA);
        System.out.println("Data Tim B : " + timB);
    }
}