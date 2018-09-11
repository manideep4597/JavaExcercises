public class Palidrome {
    public static String main(long user_i )
    {

        long temp,rev_i=0,sum=0;temp=user_i;

        while(temp>0)
        {
            long k =temp%10;
            rev_i=rev_i*10+k;
            temp=temp/10;
            if(k%2==0)
            {
                sum+=k;
            }
        }

        if(user_i == rev_i&&sum>25)
        {
            return (user_i +" is a Pallidrome and sum of the even numbers is greater than 25");
        }

        else if(user_i == rev_i&&sum<25)
        {
            return (user_i+" is a Pallidrome and sum of the even numbers is less than 25");
        }

        else
        {
            return (user_i+" is a not a Pallidrome");
        }

    }
}
