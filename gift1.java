/*
 ID: Siyu Han [xyhsy11]
 LANG: JAVA
 TASK: gift1
*/

import java.io.*;
import java.util.*;

public class gift1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("gift1.in"));
        int number = in.nextInt();
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] name = new String[number];
        for (int i = 0; i < number; i++) {
            name[i] = in.next();
            hashMap.put(name[i], 0);
        }
        for (int i = 0; i < number; i++) {
            String currentName = in.next();
            int gift = in.nextInt();
            int collectors = in.nextInt();
            int giftGive = 0;
            if (collectors != 0) {
                giftGive = gift / collectors;
            }
            hashMap.put(currentName, hashMap.get(currentName) - giftGive * collectors);

            for (int j = 0; j < collectors; j++) {
                String collector = in.next();
                hashMap.put(collector, hashMap.get(collector) + giftGive);
            }
        }


        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        for (int i = 0; i < number; i++) {
            int giftnum = hashMap.get(name[i]);
            out.println(name[i] + " " + giftnum);
        }
        out.close();
        System.exit(0);
    }
}