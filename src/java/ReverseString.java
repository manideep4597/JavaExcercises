import java.util.Scanner;

public class ReverseString {

    public static void main(String[]args) {

        String string="";                                         //empty input string
        String reverse="";                                         //empty output string
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();                              //taking input of the string

        for(int i=string.length()-1;i>=0;i--) {                   /*condition to reverse the string*/
            reverse=reverse+string.charAt(i);
        }
        System.out.println(reverse);                               //printing the reversed string
    }
}