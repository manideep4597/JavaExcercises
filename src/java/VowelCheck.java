import java.util.Scanner;

public class VowelCheck {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String user_str = scanner.next();
        user_str=user_str.toLowerCase();
        char[] str_array =user_str.toCharArray();
        int[] asc=new int[10000];
        int temp=0;

        for(int i=0;i<user_str.length();i++)
        {
             asc[i]=(int)str_array[i];
             if(asc[i] == 'a' || asc[i] == 'e' || asc[i] == 'i'
                     || asc[i] == 'o' || asc[i] == 'u')
             {
                 System.out.print("Vowel ");temp++;
             }
             else if (asc[i]>='a'&&asc[i]<='z')
             {
                 System.out.print("Consonant ");temp++;
             }
        }
        if (temp==0)
        {
            System.out.println("No Characters in Given Input");
        }
    }
}
