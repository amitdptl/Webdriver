package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 02/03/2017.
 */
public class Table
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a=s.nextInt();
        for (int i =1; i<=10 ; i++)
          {
              System.out.println(a+" * "+i+" = "+a*i);
          }


    }
}
