package HomeworkArray;

import java.util.Scanner;

/**
 * Created by amit on 07/03/2017.
 */
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of  odd number : ");
        int x=s.nextInt();
        int coloumn=1;
        int space=x/2-1;
        int i=1;

        while (i<=x)
        {
            System.out.println(" ");
        }


//        for (int i = 0; i <x ; i++) {
//            for (int j = 1; j <=space ; j++)
//            {
//                System.out.print(" " );
//            }


            for (int j = 1; j <=coloumn; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            if (i<x/2)
            {
                coloumn=coloumn+2;
                space=space-1;
            }
            else
            {
                coloumn=coloumn-2;
                space=space+1;
            }

        }



    }
