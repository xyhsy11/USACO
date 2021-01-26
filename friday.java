/*
ID: Siyu Han [xyhsy11]
LANG: JAVA
TASK: friday
*/

import java.io.*;
import java.util.*;

public class friday {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("friday.in"));
        int n = in.nextInt();
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] monthsSpecial = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] days = new int[7];
        int current = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 12; j++) {
                if (i == 100) {
                    for (int k = 0; k < monthsSpecial[j]; k++) {
                        current++;
                        if (current == 7) {
                            current = 0;
                        }
                        if (k + 1 == 13) {
                            days[current]++;
                        }

                    }
                    continue;
                }
                if (i == 0 || i == 200 || i == 300) {
                    for (int k = 0; k < months[j]; k++) {
                        current++;
                        if (current == 7) {
                            current = 0;
                        }
                        if (k + 1 == 13) {
                            days[current]++;
                        }

                    }
                    continue;
                }
                if (i % 4 == 0) {
                    for (int k = 0; k < monthsSpecial[j]; k++) {
                        current++;
                        if (current == 7) {
                            current = 0;
                        }
                        if (k + 1 == 13) {
                            days[current]++;
                        }

                    }
                } else {
                    for (int k = 0; k < months[j]; k++) {
                        current++;
                        if (current == 7) {
                            current = 0;
                        }
                        if (k + 1 == 13) {
                            days[current]++;
                        }

                    }
                }
            }
        }


        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        out.println(days[6] + " " + days[0] + " " + days[1] + " " + days[2] + " " + days[3] + " " + days[4] + " " + days[5]);
        out.close();
        System.exit(0);
    }
}
