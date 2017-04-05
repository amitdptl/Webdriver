package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 06/03/2017.
 */
public class DoWhile_19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter any Five Digit Number :");
        int x=sc.nextInt();
        int a,sum=0;
        while(x>0)
        {
            a=x%10;
            x=x/10;
            sum=sum+a;
        }
        System.out.println("The sum of each digit is : "+sum);
    }
}
