
/*
ID: Siyu Han [xyhsy11]
LANG: JAVA
TASK: gymnastics
*/

import java.io.*;
import java.util.*;

public class gymnastics {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("gymnastics.in"));
        int k = in.nextInt();
        int n = in.nextInt();
        int[][] performance = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                performance[i][j] = in.nextInt();
            }
        }
        in.close();
        int res = 0;
        boolean flag = false;
        int count = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            count ++;
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < n; l++) {

                }
            }
        }
        PrintWriter out = new PrintWriter(new File("gymnastics.out"));
        out.println(res);
        out.close();
        System.exit(0);
    }
    public static int find(int target, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;//insurance
    }
}
