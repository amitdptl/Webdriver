package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 01/03/2017.
 */
public class SymbolAction
{
    public static void main(String[] args)
    {

        {
            Scanner s= new Scanner(System.in);
            System.out.println(" Enter any 1st number : ");
            double a=s.nextDouble();
            System.out.println(" Enter any 2nd numbr : ");
            double b=s.nextDouble();
            System.out.println(" Enter any symbol example; +,-,/,* : ");
            char c=s.next().charAt(0);

            if(c=='+')
            {
                System.out.println(a+b);
            }else if (c=='-')
              {
                  if(a>b)
                  {System.out.println(a-b);}
                  else if (b>a)
                  {
                      System.out.println(b-a);
                  }
              }
              else if(c=='/')
                       {
                           System.out.println(a/b);
                       }
                       else if (c=='*')
                         {
                             System.out.println(a*b);
                         }


        }

    }
}
