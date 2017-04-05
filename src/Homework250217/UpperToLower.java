package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 01/03/2017.
 */
public class UpperToLower
{
    public static void main(String []args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter any word in UPPER case  :  ");
        String x= s.next().toLowerCase();
        System.out.println("Output in lowercase  : "+x);
    }
}
