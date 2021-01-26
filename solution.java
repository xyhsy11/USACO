import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 7;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        int max = 0;
        int cur = -1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                cur = i;
            }
        }
        int temp = 0;

        int secondMax = 0;
        for (int i = 0; i < n; i++) {
            if(i == cur){
                continue;
            }
            if (numbers[i] > secondMax) {
                secondMax = numbers[i];
                temp = i;
            }
        }
        int thirdMax = 0;
        for (int i = 0; i < n; i++) {
            if(i == cur){
                continue;
            }
            if(i == temp){
                continue;
            }
            if (numbers[i] > thirdMax) {
                thirdMax = numbers[i];
            }
        }
        int a = max - secondMax;
        int b = max - thirdMax;
        int c = max - a - b;
        System.out.println(a + " " + b + " " + c);

    }
}
