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
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        for (int i = 0; i < 7; i++) {
            out.println();
        }
        out.close();
        System.exit(0);
    }
}
