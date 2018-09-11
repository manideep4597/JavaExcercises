import java.util.Scanner;

public class Guess {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;          //initialising the count to 0
        int a = 1 + (int) (Math.random() * 99);//condition to set the limit
        System.out.println(a);
        int guess = 0;             //initialising the guessed number to 0

        while (guess != a) {
            guess = scanner.nextInt();    //taking input
            count++;
            if (guess > a) {                 /*checking the condition for given input*/
                System.out.println("Number guessed is more than the original number");
            }
            else if (guess < a) {
                System.out.println("Number guessed is less than original number");
            }
        }

        System.out.println("You guessed the number with "
                + count + " tries!");         //printing the success output
    }
}
