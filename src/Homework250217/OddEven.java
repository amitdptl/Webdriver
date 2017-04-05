package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 26/02/2017.
 */
public class OddEven
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int a=in.nextInt();

       if(a%2==0)
          {
           System.out.println("This number is Even number ");
           }else
                   {System.out.println("This number is Odd number");}
       }

    }

