/*
 ID: Siyu Han [xyhsy11]
 LANG: JAVA
 TASK: whereami
*/

import java.io.*;
import java.util.*;
public class whereami {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("whereami.in"));
        int answer = 0;
        int N = in.nextInt();
        String str = in.next();
        boolean isOk = true;

        for (int i = 1; i <= N; i++) {
            isOk = true;
            for (int j = 0; j + i <= N; j++) {
                for (int k = 0; k < j; k++) {
                    if(str.substring(j,j+i).equals(str.substring(k,k+i))){
                        isOk = false;
                    }

                }

            }
            if(isOk){
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("whereami.out")));
                out.print(i);
                out.close();
                System.exit(0);
            }

        }


    }
}
