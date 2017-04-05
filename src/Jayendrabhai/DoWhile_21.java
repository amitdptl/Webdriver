package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 06/03/2017.
 */
public class DoWhile_21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any Five Digit Number :");
        int x = sc.nextInt();
        int a,rev=0;
        while (x>0)
        {
            a=x%10;
            x=x/10;
            rev=(rev*10)+a;
        }
        System.out.println("The Reverse Number is \t\t: "+rev);

    }
}
