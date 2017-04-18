package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by amit on 28/03/2017.
 */
public class AddElementP
{
     static int x,a ,i;

    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of array wanted :");
        x=sc.nextInt();
        int [] a =new int[x+1];
        System.out.println("Enter elements");
        for (int i = 0; i <a.length; i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.print("Original array : ");

        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]+",");
        }




    }
}
