package Practice;

import java.util.Scanner;

/**
 * Created by amit on 07/03/2017.
 */
public class Rhombus {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.print("Enter max number of star: ");
        int x=s.nextInt();
//        int space =x/2;
//        int odd=1
        int coloumns=1;
        int space=x/2-1;
        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <=space ; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <=coloumns; j++)
            {
                System.out.print("*");
            }
            System.out.println();


            if (i<x/2)
               {coloumns=coloumns+2;
                   space=space-1;

               }
              else
                { coloumns=coloumns-2;
                    space=space+1;
                }

        }

    }


}