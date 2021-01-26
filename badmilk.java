/*
ID: Siyu Han [xyhsy11]
LANG: JAVA
TASK: badmilk
*/

import java.io.*;
import java.util.*;
public class badmilk {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner( new File("badmilk.in") );

        int n = in.nextInt();
        int m = in.nextInt();
        int d = in.nextInt();
        int s = in.nextInt();

        ArrayList<Drink>[] drinks = new ArrayList[n+1];
        // unused: index 0
        // index 1-n: person #   (each person has a list)

        for (int p = 0; p <= n; p++)  drinks[p] = new ArrayList<>();

        for (int i = 0; i < d; i++) {
            Drink dr = new Drink(in);

            drinks[dr.p].add(dr);
        }

        // goal: look up a person #, and store/find out when they got sick
        int[] sickTimes = new int[n+1];
        // unused: index 0
        // index 1-n: person #   (each person has a sick time, or 0 for people not sick at party)

        // ex. [_, 3, 8, 0]  <-- times of sickenss / not getting sick for person 3
        //         1  2  3   <-- index #s / person #s

        for (int i = 0; i < s; i++) {
            int p = in.nextInt();
            int t = in.nextInt();

            sickTimes[p] = t;
        }

        in.close();       // optional

        for (ArrayList<Drink> list : drinks) Collections.sort(list);

        // goal: we want to be able to quickly check off a milk type if we know it's safe
        //       and later, look up if it's safe

        boolean[] safe = new boolean[m+1];
        for (int p = 1; p <= n; p++) {

        }


        int result = 0;


        System.out.println(result);

        PrintWriter out = new PrintWriter( new File("badmilk.out") );
        out.println(result);
        out.close();
    }


    static class Drink implements Comparable<Drink> {
        int p, m, t;

        Drink(Scanner in) {
            p = in.nextInt();
            m = in.nextInt();
            t = in.nextInt();
        }

        public int compareTo(Drink other) {
            if (this.t < other.t) return -1;     // any neg # means this goes before other
            if (this.t > other.t) return +342;   // any pos # means this goes after other
            return 0;                            // zero means they're tied
        }
    }
}

