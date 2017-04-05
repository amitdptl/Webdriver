package Homework250217;
import java.util.Scanner;


/**
 * Created by amit on 28/02/2017.
 */
public class AdditonNaturalNumber
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any natural number  :  ");
        int x=in.nextInt();


        //double ans=(x*(x+1))/2;

      //  System.out.println("Addition of Total number = "+ans);
        for (int i=1;  i<=x; i++)
        {
            System.out.println(i);
        }
        int a=x*(x+1)/2;
        System.out.println("\nTotal = " +a);
    }

}
