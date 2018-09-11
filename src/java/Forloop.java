import java.util.Scanner;

public class Forloop {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = scan.nextInt();

        for (int i=1;i<=num;i++)
        {
            for(int j=1;j<=i; j++)
            {
                System.out.print(i+" ");
            }
        }


    }
}
