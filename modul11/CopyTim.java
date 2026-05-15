import java.util.ArrayList;
import java.util.Collections;

public class CopyTim {
    public static void main(String[] args) {

        ArrayList<Integer> timB = new ArrayList<Integer>();
        Collections.addAll(timB, 170, 167, 165, 166, 168, 175, 172, 171, 168, 169);

        ArrayList<Integer> timC = new ArrayList<Integer>();

        // salin c ke d
        timC.addAll(timB);

        System.out.println("Data Tim B : " + timB);
        System.out.println("Data Tim C : " + timC);
    }
}