import java.util.Scanner;

public class InputScanner {

    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNextInt())
        {
            int num = scanner.nextInt();
            sum =sum+num;
        }

        System.out.println(sum);
    }
}
