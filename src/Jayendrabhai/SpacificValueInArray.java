package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 05/03/2017.
 */
public class SpacificValueInArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value:");
        int x=sc.nextInt();

        int a[]={12,23,14,56,78};

        if(a[0]==x || a[1]==x ||a[2]==x ||a[3]==x ||a[4]==x)
        {
            System.out.println("Enter value in Array");
        }else
            {
                System.out.println("Enter value is not in Array");
            }
    }
}







