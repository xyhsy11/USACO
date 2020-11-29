import java.io.*;
import java.util.*;

/**
 * ID: Siyu Han [xyhsy11]
 * LANG: JAVA
 * TASK: learning
 */
public class learning {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("badmilk.in"));
        int nodes = in.nextInt();
        int[] xs = new int[nodes];
        int[] ys = new int[nodes];
        for (int i = 0; i < nodes; i++) {
            xs[i] = in.nextInt();
            ys[i] = in.nextInt();

        }
        int temp = 0;
        for (int i = 1; i < nodes - 1; i++) {

        }


    }

    public static int add(int i, int j) {
        if (i + j < 0) {
            return -i - j;

        } else {
            return i + j;
        }
    }
}
