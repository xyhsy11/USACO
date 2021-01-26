import java.util.*;

public class solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> cows = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (in.nextInt() % 2 == 0) {
                cows.add(2);
            } else {
                cows.add(1);
            }
        }
        int answer = 0;
        int current = 0;
        boolean flag = true;
        boolean ok = false;
        while (flag) {
            if (cows.size() == 0) {
                flag = false;
                break;
            }
            if (current == 0) {
                current = 1;


                for (int i = 0; i < cows.size(); i++) {
                    if (cows.get(i) % 2 == 0) {
                        cows.remove(i);
                        answer++;

                        ok = true;
                        break;
                    }
                    ok = false;
                }

                if (!ok) {
                    cows.remove(0);
                    cows.remove(0);
                    answer++;
                    ok = false;

                }


            } else {
                current = 0;
                if (countOdd(cows) == 1) {
                    answer++;
                    answer++;
                    System.out.println(answer);
                    System.exit(0);
                }
                if (amout(cows) == 5) {
                    answer++;
                    answer++;
                    System.out.println(answer);
                    System.exit(0);
                }
                for (int i = 0; i < cows.size(); i++) {
                    if (cows.get(i) % 2 == 1) {
                        cows.remove(i);
                        answer++;
                        ok = true;
                        break;
                    }
                    ok = false;
                }
                if (!ok) {
                    cows.remove(0);
                    cows.remove(0);
                    answer++;
                    ok = false;

                }

            }
        }

        System.out.println(answer);
    }

    private static int amout(ArrayList<Integer> cows) {
        int temp = 0;
        for (int i = 0; i < cows.size(); i++) {
            temp += cows.get(i);
        }
        return temp;
    }


    private static int countOdd(ArrayList<Integer> cows) {
        int temp = 0;
        for (int i = 0; i < cows.size(); i++) {
            if (cows.get(i) % 2 == 1) {
                temp++;
            }
        }
        return temp;
    }

    private static int countEven(ArrayList<Integer> cows) {
        int temp = 0;
        for (int i = 0; i < cows.size(); i++) {
            if (cows.get(i) % 2 == 0) {
                temp++;
            }
        }
        return temp;
    }
}
