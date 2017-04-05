package Homework250217;
import java.util.Scanner;


/**
 * Created by amit on 27/02/2017.
 */
public class CityAtoF
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter one alphabat between a to f  : ");
         char x = in.next().charAt(0);
       // String x = in.nextLine();


        if (x=='a' || x=='A')
        {System.out.println("Ahmedabad");}
          else if(x=='b' || x=='B')
          {System.out.println("Baaa");}
                 else if(x=='c'||x=='C')
                   {System.out.println("Cjklsafj");}
                   else if(x=='d'|| x=='D')
                        {System.out.println("Delta");}
                        else if(x=='e'||x=='E')
                          {System.out.println("Elfa");}
                          else if(x=='f'|| x=='F')
                                {System.out.println("Frody");}
                          else {
                                 System.out.println("City not available");
        }

    }
}
