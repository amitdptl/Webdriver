package HomeWork;
import java.util.Scanner;

//Created by amit on 25/02/2017.

public class IfElse
{
    public static void main(String []args)
    {  Scanner in= new Scanner(System.in);
        System.out.println("\nEnter City Name");

        String cityName=in.nextLine();

        if(cityName.equalsIgnoreCase("London"))
        {
            System.out.println("U r in UK");
        }
        else if (cityName.equalsIgnoreCase("Mumbai"))
        {
            System.out.println("U r in India");
        }
        else if (cityName.equalsIgnoreCase("New Youk"))
        {
            System.out.println("U r in USA");
        }
        else if (cityName.equalsIgnoreCase("Tokyo"))
        {
            System.out.println("U r in Japan");
        }
        else
        {
            System.out.println("Wrong city name or city not belong to NATO");
        }
    }
}
