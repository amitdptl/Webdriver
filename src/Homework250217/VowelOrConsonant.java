package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 01/03/2017.
 */
public class VowelOrConsonant
{
    public static void main(String []args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any alphabat : ");
        String x=s.next().toLowerCase();

        int a=x.length();
        char ch=x.charAt(0);
        if (a>1)
        {
            System.out.println("Error, It's not character");
        }else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("This Character is a Vowel");
        }else
            {
                System.out.println("This Character is a Consonant");
            }

    }
}
