package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 28/02/2017.
 */
public class FindNumbAlphaSymbol
{
    public static void main(String []args)
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Please enter any alphabat character or number or symbol :  ");
        char x =s.next().charAt(0);

       // if(x>='a' && x<='z'||x>='A' && x<='Z')
        if(Character.isAlphabetic(x))
        {

            System.out.println(" This character is an alphabat ");

        }//else if(x>=1||x<=1)
        else if (Character.isDigit(x))
        {
            System.out.println("\nThis character is number ");
        }
        else
        {System.out.println("This is Symbol");}
    }
}
