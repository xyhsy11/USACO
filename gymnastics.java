
/*
ID: Siyu Han [xyhsy11]
LANG: JAVA
TASK: gymnastics
*/

import java.io.*;
import java.util.*;

public class gymnastics {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("gymnastics.in"));
        int k = in.nextInt();
        int n = in.nextInt();
        int aTemp = 0;
        int bTemp = 0;
        int answer = 0;
        int total = 0;
        int[][] performance = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                performance[i][j] = in.nextInt();

            }
        }
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                total = 0;
                for (int current = 0; current < k; current++) {

                    for (int i = 0; i < n; i++) {
                        if (performance[current][i] == a) {
                            aTemp = i;
                        }
                        if (performance[current][i] == b) {
                            bTemp = i;
                        }
                    }
                    if (aTemp < bTemp) {
                        total++;
                    }

                }
                if (total == k) {
                    answer++;
                }

            }

        }
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));
        out.println(answer);
        out.close();
        System.exit(0);
    }
}
