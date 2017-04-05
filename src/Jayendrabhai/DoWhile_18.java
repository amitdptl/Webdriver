package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 06/03/2017.
 */
public class DoWhile_18
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int x=sc.nextInt();
        while (x>=0)
        {
            System.out.print(x+",");
            x--;
        }
    }
}
