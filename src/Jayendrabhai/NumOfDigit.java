package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 03/03/2017.
 */
public class NumOfDigit
{
    public static void main(String[] args)
    {
        int x,a=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        x=sc.nextInt();
        if(x<0)
        {
            x=x*-1;
        }
        else if(x==0)
          {
              x=0;
          }
        while (x>0)
        {
            x=x/10;
            a++;
        }
        System.out.println("Number of Digit in given number is :" +a);
    }
}
