
import java.util.*;

public class daisychain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] flowers = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            flowers[i] = in.nextInt();
        }
        int res = 0;
        int temp = 0;
        int cur = 0;
        for (int i = n; i >= 1; i--) {
            temp = 0;
            for (int j = 1; j <= i; j++) {
                temp = 0;
                for (int k = j; k <= i; k++) {
                    temp += flowers[k];
                }
                if (temp % (i - j + 1) != 0) {
                    continue;
                } else {
                    cur = temp / (i - j + 1);
                }

                for (int k = j; k <= i; k++) {
                    if (cur == flowers[k]) {
                        res++;
                        break;
                    }
                }

            }
        }
        System.out.println(res);
    }
}
