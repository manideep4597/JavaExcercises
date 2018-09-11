
import java.util.Scanner;

public class RepeatingCharacter {

    public static void main(String[] args) {

        String str = "";            //empty input string
        int n;                      //variable input
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();        //taking string input from console
        n = scanner.nextInt();           //taking the input from console
        int length = str.length();

        for (int i = 0; i < length - n; i++) {          /*printing the initial characters*/
            System.out.print(str.charAt(i));
        }

        int j = 0;
        while (j < n) {                                 /* condition to print the n variables*/
            for(int k=length-n;k<length;k++) {
                System.out.print(str.charAt(k));
            }
            j++;
        }

    }
}