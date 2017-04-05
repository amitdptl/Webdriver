package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 03/03/2017.
 */
public class Palindrome_24
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter any number :");
        int x=sc.nextInt();
        int pal=0,a,b;
        b=x;
        while (x>0)
        {
            a=x%10;
            x=x/10;
            pal =(pal*10)+a;
        }
        if (pal==b)
        {
            System.out.println(+b+ " Is Palindrome number");
        }else
            {
                System.out.println(+b+ " Is not Palindrome Number");
            }
    }
}
