package Homework250217;

import java.util.Scanner;


/**
 * Created by amit on 26/02/2017.
 */
public class LeapYear {
    public static void main(String[] arg)
    {


        Scanner in = new Scanner(System.in);
        System.out.println("\nPlease enter year in digit");
        int a = in.nextInt();

        if (a % 4 == 0)
        {
            System.out.println(a+" is a Leap year ");
        }
        else
            {
                System.out.println(a+" is not a Leap year");
            }
    }
}