package Homework250217;
import java.util.Scanner;


/**
 * Created by amit on 27/02/2017.
 */

public class CityFtoA

    {     public static void main(String[] args)
         {
             Scanner s = new Scanner(System.in);
             System.out.print("Enter any alphabate between a to f  : \t");
             String x=s.next();


          switch(x)
          {

              case "a":
                  System.out.println("amm");
                  break;
              case "b":
                  System.out.println("bmm");
                  break;
              case "c":
                  System.out.println("Cmm");
                  break;
              case "d":
                  System.out.println("Cmm");
                  break;
              case "e":
                  System.out.println("Cmm");
                  break;
              case "f":
                  System.out.println("f");
                  break;
              default:
                  System.out.println("Error sorry");
                  break;
          }

         }
    }

