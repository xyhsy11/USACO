/*
ID: Siyu Han [xyhsy11]
LANG: JAVA
TASK: badmilk
*/

import java.io.*;
import java.util.*;

public class badmilk {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("badmilk.in"));
        int n = in.nextInt();
        int m = in.nextInt();
        int d = in.nextInt();
        int s = in.nextInt();
        int[][] guestDrink = new int[d][3];
        int[][] illGuest = new int[s][2];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < 3; j++) {
                guestDrink[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < 2; j++) {
                illGuest[i][j] = in.nextInt();
            }
        }
        int[] illMan = new int[s];
        for (int i = 0; i < s; i++) {
            illMan[i] = illGuest[i][0];
        }
        int[] illMilk = new int[s];
        Set<Integer> possibleIllMilk = new HashSet<>();
        for (int i = 0; i < d; i++) {
            for (int z = 0; z < s; z++) {
                if (guestDrink[i][0] == illMan[z]) {
                    possibleIllMilk.add(guestDrink[i][1]);
                }
            }

        }


        PrintWriter out = new PrintWriter(new File("badmilk.out"));
        out.println();
        out.close();
        System.exit(0);

    }
}
