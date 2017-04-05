package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 05/03/2017.
 */
public class AddElement
{
    public static void main(String[] args)
    {   int x,pos,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements you want in array :");
        x= sc.nextInt();
        int a[] = new  int[x+1];
        System.out.print("Enter all the Elements");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert elements :");
        pos=sc.nextInt();
        System.out.print("Enter the elements you want to insert :");
        y=sc.nextInt();
        for (int i = (x-1); i >=(pos-1); i--)
        {
            a[i+1]=a[i];

        }
        a[pos-1] =y;
        System.out.println("After inserting :");
        for (int i = 0; i <x ; i++)
        {
            System.out.print(a[i]+",");

        }
    }
}
