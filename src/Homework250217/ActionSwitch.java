package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 02/03/2017.
 */
public class ActionSwitch
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        double a=s.nextDouble();
        System.out.print(" Enter 2nd number : ");
        double b=s.nextDouble();
        System.out.print(" Enter any one of these sysmbol +,-,*,/");
        char ch=s.next().charAt(0);
        switch (ch)

           {
               case '+': System.out.println(a+b);break;
               case '-': System.out.println(a-b);break;
               case '*': System.out.println(a*b);break;
               case '/': System.out.println(a/b);break;
               default:
                   System.out.println("Invalid entry of symbol" +
                           "  soory!");

           }
    }
}
