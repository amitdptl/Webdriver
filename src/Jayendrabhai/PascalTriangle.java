package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 05/03/2017.
 */
public class PascalTriangle
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of row");
        int x = sc.nextInt();
        int a=1;
        int space=x-1;

        for (int i=1;i<=x;i++)
        {
        int k=0;
        for (int j=1;j<=space;j++)
        {
            System.out.print(" ");
        }
        for (int j = 1; j <=a; j++)
        {
            if(j<=i)
            {
                k=k+1;
            }else
                {
                    k=k-1;
                }
            System.out.print(k);
        }
        System.out.println();
        a=a+2;
        space=space-1;
    }
    }
}
