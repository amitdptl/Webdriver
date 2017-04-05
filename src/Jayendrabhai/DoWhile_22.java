package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 06/03/2017.
 */
public class DoWhile_22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any Five Digit Number :");
        int x = sc.nextInt();
        int a,sum=0,b=0;
        while (x>0)
        {
           a=x%10;
           b++;
           if(b==1||b==5)
           {
               sum=sum+a;
           }
           x=x/10;
        }
        System.out.println("\nThe Sum of First and last Digit is : "+sum);

    }
}
