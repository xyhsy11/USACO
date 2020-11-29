import java.io.*;
import java.util.*;

/**
 * ID: Siyu Han [xyhsy11]
 * LANG: JAVA
 * TASK: lostcow
 */
public class lostcow {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("lostcow.in"));
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();
        int count = 0;
        int res = 0;

        boolean flag = true;
        while (flag) {
            if (count % 2 == 0) {
                int m = 1;
                for (int i = 0; i < count; i++) {
                    m = m * 2;
                }
                for (int i = 0; i < m; i++) {
                    if (x + i + 1 == y) {
                        res++;
                        flag = false;
                        break;
                    } else {
                        res++;


                    }
                }
                for (int i = 0; i < m; i++) {
                    if(flag == false){
                        break;
                    }
                    if (x + i + 1 == y) {
                        res++;
                        flag = false;
                        break;
                    } else {
                        res++;


                    }
                }
                count++;
            } else {
                int m = 1;
                for (int i = 0; i < count; i++) {
                    m = m * 2;
                }
                for (int i = 0; i < m; i++) {
                    if (x - i - 1 == y) {
                        res++;
                        flag = false;
                        break;
                    } else {
                        res++;

                    }
                }
                for (int i = 0; i < m; i++) {
                    if(flag == false){
                        break;
                    }
                    if (x - i - 1 == y) {
                        res++;
                        flag = false;
                        break;
                    } else {
                        res++;

                    }
                }
                count++;
            }
        }


        PrintWriter out = new PrintWriter(new File("lostcow.out"));
        out.println(res);
        out.close();
        System.exit(0);
    }
}
//O(n) = n^2

