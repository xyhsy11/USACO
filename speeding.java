/*
ID: Siyu Han [xyhsy11]
LANG: JAVA
TASK: speeding
*/

import java.io.*;
import java.util.*;

public class speeding {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("speeding.in"));
        int limitSeg = in.nextInt();
        int realSeg = in.nextInt();
        int[] limit = new int[100];
        int[] real = new int[100];
        int count = 0;
        for (int i = 0; i < limitSeg; i++) {
            int m = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < m; j++) {
                limit[count] = n;
                count++;
            }
        }
        count =0;
        for (int i = 0; i < realSeg; i++) {
            int m = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < m; j++) {

                real[count] = n;
                count++;
            }
        }
        int res = 0;
        for(int i = 0; i< 100; i++){
            if(real[i] - limit[i] >res){
                res = real[i]-limit[i];
            }
        }
        PrintWriter out = new PrintWriter(new File("speeding.out"));
        out.println(res);
        out.close();
        System.exit(0);

    }
}
