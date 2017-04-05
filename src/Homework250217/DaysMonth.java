package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 28/02/2017.
 */
public class DaysMonth
{
    public static void main(String[]args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println(" Enter any name of the Month pls : ");
        String x=in.next().toLowerCase();
        switch(x)
        {
            case "january":
            case "march":
            case "may":
            case "june":
            case "august":
            case "october":
            case "december":
                System.out.println("\n"+x.toUpperCase()+" month has 31 days ");
                break;

            case "february":
                System.out.println("\n"+x.toUpperCase()+" month has 28 or 29 days");
                break;

            case "april":

            case "july":

            case "september":

            case "november":
                System.out.println("\n"+x.toUpperCase()+" month has 30 days ");
                break;
                default:
                    System.out.println("Sorry");


        }
    }
}
