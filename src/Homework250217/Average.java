package Homework250217;
import java.util.Scanner;
/**
 * Created by amit on 26/02/2017.
 */
public class Average
{
    public static void main(String[]arg)
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter any five number   = ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int e=in.nextInt();

        double ave= (a+b+c+d+e)/5;
        System.out.println("Average of 5 values  :   "+ave);


    }
}
