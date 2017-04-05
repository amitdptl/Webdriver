package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 01/03/2017.
 */
public class FibonacciNumber
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter any natural number :  ");
        int x=s.nextInt();
        int a=1;
        int b=1;
        int c;


        for (int i = 1; i <=x; i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;



            }
        }


    }

