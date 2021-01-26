import java.util.*;
public class solution1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String alphabet = in.next();
        String words = in.next();
        int wLength = words.length();

        int answer = 0;
        int temp = 26;
        boolean flag = true;
        for (int j = 0; j < wLength; j++) {
            for (int i = temp+1; i < 26; i++) {
                if(words.charAt(j) == alphabet.charAt(i)){
                    if(j == wLength-1){
                        System.out.println(answer);
                        System.exit(0);
                    }
                    j++;
                }
            }

            for (int i = 0; i < 26; i++) {

                if(words.charAt(j) == alphabet.charAt(i)){

                    answer++;
                    temp = i;
                    flag = false;

                    break;
                }
            }


        }

        System.out.println(answer);
    }
}
