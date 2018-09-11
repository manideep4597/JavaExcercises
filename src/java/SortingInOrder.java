import java.util.Scanner;

public class SortingInOrder{

    public static void main(String[] args) {

        String n,result="";             //n is input
        // temp is temporary variable
        int sum=0;         //Addition is initialised to 0
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number:");

        n = scanner.nextLine();
        int[] sort_set ={0,0,0,0,0,0,0,0,0,0};
        //initialising a new array


        for (int i = 0; i < n.length(); i++) {              /*entering the elements if an array*/
             int temp=(int)(n.charAt(i)-'0');
            sort_set[temp]++;

        }
        for (int i = 9; i >=0 ; i--) {

            for (int j = 0; j < sort_set[i]; j++) {     /*sorting the numbers*/

                result=result+Integer.toString(i);

            }
            if(i%2==0)
                sum=sum+i*sort_set[i];

        }

        System.out.println(result);
        System.out.println("Sum of even Numbers : "+sum);   /*printing the Addition*/

        if(sum>15) {                                        /*condition for true*/
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


}