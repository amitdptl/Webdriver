package Homework250217;
import java.util.Scanner;



/**
 * Created by amit on 26/02/2017.
 */
public class ClsOddEven
{
    public static void main(String[]arg)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("\nEnter 1st number pls ");
        int a=in.nextInt();
        System.out.println("\nEnter 2nd number pls ");
        int b=in.nextInt();


        String c= a%2==1?  a+" number Is odd": a+" number is even ";
        String d=b%2==1? b+ " nubmer Is odd":b+" is even number";
        System.out.println(c);
        System.out.println(d);

    }
}
