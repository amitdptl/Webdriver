package HomeworkArray;

import java.util.Scanner;

/**
 * Created by amit on 09/03/2017.
 */
public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print(" Enter any number : ");
        int x=s.nextInt();
        int i;
        if(x==1)
        {
            System.out.println(" Smallest Prime Number is 2");
        }
        for ( i = 2; i <x ; i++)
        {
            if(x%i==0)
              {
            System.out.println("Not a Prime");
            break;
              }

        }
        if (x==i)
        {
            System.out.println(" Is Prime number");
        }
    }

}
