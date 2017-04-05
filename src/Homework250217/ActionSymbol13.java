package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 01/03/2017.
 */
public class ActionSymbol13
{
    public static void main()
    {
        Scanner s= new Scanner(System.in);
        System.out.println(" Enter any 1st number : ");
        int a=s.nextInt();
        System.out.println(" Enter any 2nd numbr : ");
        int b=s.nextInt();
        System.out.println(" Enter any symbol example; +,-,/,* : ");
        char c=s.next().charAt(0);

        if(c=='+')
        {
            System.out.println(a+b);
        }

    }

}
