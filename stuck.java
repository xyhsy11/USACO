import java.sql.Struct;
import java.util.*;

public class stuck {
    class criticalPoints{
        int timeA;
        int timeB;
        int A;
        int B;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        String[] direction = new String[n];

        for (int i = 0; i < n; i++) {
            direction[i] = in.next();
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }


    }
}