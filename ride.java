

/*
ID: Siyu Han [xyhsy11]
LANG: JAVA
TASK: ride
*/

import java.io.*;
import java.util.*;

class ride {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("ride.in"));
        char[] chars1 = in.next().toCharArray();
        char[] chars2 = in.next().toCharArray();
        int temp1 = 1;

        for (int i = 0; i< chars1.length;i++) {
            temp1 *= ((int)chars1[i] - 64);

        }
        int temp2 = 1;
        for (int i = 0; i< chars2.length;i++) {
            temp2 *= ((int)chars2[i] - 64);

        }
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

        if (temp1 % 47 ==  temp2 % 47 ){
            out.println("GO");
        }else{
            out.println("STAY");
        }


        out.close();
        System.exit(0);
    }
}