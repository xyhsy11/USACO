import java.util.Scanner;
public class udderedbutnotherd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String alphabet = in.next();
        String words = in.next();
        int wLength = words.length();
        int aLength = alphabet.length();
        int answer = 0;

        for (int i = 0; i < aLength; i++) {
            for (int j = 0; j < wLength; j++) {
                if(alphabet.charAt(i) == words.charAt(j)){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
