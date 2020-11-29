import java.util.*;
import java.io.*;

/**
 * ID: Siyu Han [xyhsy11]
 * LANG: JAVA
 * TASK: paint
 */
public class paint {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("paint.in"));
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i >= a && i < b){
                count ++;
            }else if(i >= c&& i< d){
                count ++;
            }
        }
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
        out.println(count);
        out.close();
        System.exit(0);
    }
}
