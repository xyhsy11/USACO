/*
ID: Siyu Han [xyhsy11]
LANG: JAVA
TASK: blocks
*/

import java.io.*;
import java.util.*;
public class blocks {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("blocks.in"));
        int n = in.nextInt();
        String[][] boards= new String[n][2];
        for (int i = 0; i < n; i++) {
            boards[i][0] = in.next();
            boards[i][1] = in.next();
        }
        in.close();
        int[] alphabet = new int[26];
        int count = 1;
        for (int i = 0; i < n; i++) {
            count = count*2;
        }

        String[] need = new String[n];
        for (int i = 0; i < n; i++) {
            need[i] = boards[i][0].concat(boards[i][1]);

            
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < n; j++) {

            }
        }
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
        out.println(count);
        out.close();
        System.exit(0);
    }
    public static String concatWithoutOverlap(String str1,String str2) {
        String temp = str1.concat(str2);
        char[] chars = temp.toCharArray();
        boolean flag = false;
        for (int i = 0; i < temp.length(); i++) {
            if(temp.indexOf(temp.charAt(i)) != temp.lastIndexOf(temp.charAt(i))){
                chars[i] = ' ';
            }
        }
        return chars.toString();


    }
}
