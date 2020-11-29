/*
 ID: Siyu Han [xyhsy11]
 LANG: JAVA
 TASK: cowsignal
*/

import java.util.*;
import java.io.*;

public class cowsignal {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("cowsignal.in"));
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        char[][] original = new char[m][n];

        for (int i = 0; i < m; i++) {
            original[i] = in.next().toCharArray();
        }
        in.close();
        char[][] res = new char[k * m][k * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    for (int o = 0; o < k; o++) {
                        res[k*i+o][k * j + l] = original[i][j];

                    }
                }
            }
        }


        PrintWriter out = new PrintWriter(new File("cowsignal.out"));
        for (int i = 0; i < k * m; i++) {
            for (int j = 0; j < k * n; j++) {
                out.print(res[i][j]);
            }
            out.println();

        }
        out.close();
    }
}
