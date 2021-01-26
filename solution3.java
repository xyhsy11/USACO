import java.util.*;
public class solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] cows = new int[n];
        int[] limit = new int[n];
        for (int i = 0; i < n; i++) {
            cows[i] = in.nextInt();

        }
        for (int i = 0; i < n; i++) {
            limit[i] = in.nextInt();

        }
        Arrays.sort(cows);
        Arrays.sort(limit);
        long answer = 1;
        int temp = 0;
        int current = 0;
        int[] possibility = new int[n];
        for (int i = n-1; i >=0; i--) {
            for (int j = n-1; j >=0; j--) {
                if(limit[j]<cows[i]){
                    possibility[i] = n-1-j-temp;

                    temp++;
                    current = i;
                    break;
                }

            }

        }
        for (int j = 0; j < current; j++) {
            if(n-1-temp==0){
                possibility[j] = 1;
                continue;
            }
            possibility[j] = n-temp;
            temp++;

        }
        for (int i = 0; i < n; i++) {
            answer = possibility[i]*answer;

        }
        System.out.println(answer);
    }
}
