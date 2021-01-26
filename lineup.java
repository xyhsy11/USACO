/*
 ID: Siyu Han [xyhsy11]
 LANG: JAVA
 TASK: lineup
*/

import java.io.*;
import java.util.*;

public class lineup {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("lineup.in"));
        int n = in.nextInt();
        String[] cows = {"Beatrice", "Belinda", "Bessie", "Bella", "Blue", "Betsy", "Buttercup", "Sue"};
        String[] a = new String[43210];
        String[] b = new String[43210];

        String trash;
        for (int i = 0; i < n; i++) {
            a[i] = in.next();
            trash = in.next();
            trash = in.next();
            trash = in.next();
            trash = in.next();
            b[i] = in.next();

        }




        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lineup.out")));
        for (int i = 0; i < 8; i++) {
            out.println();
        }
        out.close();
        System.exit(0);
    }

}