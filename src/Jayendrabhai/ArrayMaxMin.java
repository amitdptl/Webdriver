package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 05/03/2017.
 */
public class ArrayMaxMin
{
    public static void main(String[] args)
    {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements you want in array :");
        x= sc.nextInt();

        int a[] = new  int[x];

        System.out.print("Enter all the Elements");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("Array elements:");
        for (int i = 0; i <a.length ; i++)
        {
         System.out.print(a[i]+",");
        }
        System.out.println();
        int min=a[0] ,max = a[0];
        for (int i = 1; i <a.length ; i++)
        if(min>a[i])
            min=a[i];
            System.out.println("The minimum elememt in array is " +min);
        for (int i = 1; i <a.length ; i++)
            if(max<a[i])
                max=a[i];
        System.out.println("The maximum elememt in array is " +max);
    }
}
