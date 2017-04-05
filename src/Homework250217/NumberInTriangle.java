package Homework250217;
import java.util.Scanner;


/**
 * Created by amit on 28/02/2017.
 */
public class NumberInTriangle
{
    public static void main(String[]args)
    {
        for (int a= 0; a <=10 ; a++)
        {
            for (int b = 0; b < 10-a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }
  }







