package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 03/03/2017.
 */
public class Factorial
{
    public static void main(String[] args)
    {
        int x,fect=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any Number :");
        x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            fect=fect*i;
        }
        System.out.println("Factorial is : "+fect);
    }
}
