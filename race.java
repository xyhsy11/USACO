import java.util.*;
import java.io.*;

/**
 * ID: Siyu Han [xyhsy11]
 * LANG: JAVA
 * TASK: race
 */
public class race {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("race.in"));
        int k = 0;
        int n = 0;
        k = in.nextInt();
        n = in.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
        int currentSpeed = 0;
        int leftTravel = 0;
        int rightTravel = 0;
        int time = 0;

        PrintWriter out = new PrintWriter(new FileWriter("race.out"));
        for (int i = 0; i < n; i++) {

            for (currentSpeed = 1; ; currentSpeed++) {
                leftTravel += currentSpeed;
                time++;
                if (leftTravel + rightTravel >= k) {
                    out.println(time);
                    currentSpeed = 0;
                    leftTravel = 0;
                    rightTravel = 0;
                    time = 0;
                    break;
                }
                if (currentSpeed >= x[i]){
                    rightTravel+=currentSpeed;
                    time++;
                    if(leftTravel + rightTravel >= k){
                        out.println(time);
                        currentSpeed = 0;
                        leftTravel = 0;
                        rightTravel = 0;
                        time = 0;
                        break;
                    }
                }

            }
        }
        out.close();
        System.exit(0);
    }
}
