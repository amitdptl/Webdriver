package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 01/03/2017.
 */
public class DayWeek
{
    public static void main(String[]args)
    { Scanner s= new Scanner(System.in);
        System.out.println("Enter number of Day Pls  :  ");
    int a= s.nextInt();


    switch(a)
    {
        case 1:
            System.out.println("Monday");break;
        case 2:
            System.out.println("Tuesday");break;
        case 3:
            System.out.println("Wednesday");break;
        case 4:
            System.out.println("Thursday");break;
            case 5:
        System.out.println("Friday");break;
        case 6:
            System.out.println("Saturday");break;
        case 7:
            System.out.println("Sunday");break;
        default:
            System.out.println("Invalid entry");break;

    }

}
}
