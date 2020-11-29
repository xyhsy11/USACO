/*
ID: Siyu Han [xyhsy11]
LANG: JAVA
TASK: cownomics
*/

import java.io.*;
import java.util.*;

public class cownomics {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("cownomics.in"));
        int n = in.nextInt();
        int m = in.nextInt();
        String[] spotty = new String[n];
        String[] plain = new String[n];
        for (int i = 0; i < n; i++) {
            spotty[i] = in.next();
        }
        for (int i = 0; i < n; i++) {
            plain[i] = in.next();
        }
        in.close();

        int res = 0;
        //create container
        char temp = 'n';
        boolean flag = false;
        char[] spot = new char[n];
        char[] pla = new char[n];
        for (int i = 0; i < m; i++) {
            temp = 'n';
            for (int j = 0; j < n; j++) {
                spot[j] = spotty[j].charAt(i);
                pla[j] = plain[j].charAt(i);
            }
            for (int j = 0; j < n; j++) {
                if(temp == 'o'){
                    break;
                }
                for (int k = 0; k < n; k++) {
                    if(spot[j] == pla[k]){
                        flag = false;
                        temp = 'o';
                        break;
                    }else{
                        flag = true;
                    }
                }
            }
            if(flag){
                res++;
            }


        }


        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cownomics.out")));
        out.println(res);
        out.close();
        System.exit(0);
    }
}
