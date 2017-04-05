package Homework250217;
import java.util.Scanner;


/**
 * Created by amit on 02/03/2017.
 */
public class DividedByThreeFive
{

            public static void main(String []args)

        {
            System.out.println("\nNumbers divided by 3  :  ");
            for (int i = 1; i <=100 ; i++)
            {
                if(i%3==0)
                    System.out.print(i+",");
            }
            System.out.println("\nNumbers divided by 5  :  ");
            for (int j = 1; j <=100 ; j++)
            {
                if (j%5==0)
                    System.out.print(j+",");

            }
        }


    }






