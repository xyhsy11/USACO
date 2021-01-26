/*
ID: Siyu Han [xyhsy11]
LANG: JAVA
TASK: beads
*/

import java.io.*;
import java.util.*;
public class beads {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("beads.in"));
        int res = 0;
        int n = in.nextInt();
        String necklace = in.next();
        char[] necklaceArr = new char[350];







        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
        out.println(necklace);
        out.close();
        System.exit(0);
    }
}
