package Practice;

import java.util.Scanner;

/**
 * Created by amit on 07/03/2017.
 */
public class Triangle
{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size : ");
        int x = s.nextInt();

//        for (int i = 1; i <=x; i++)
//        {
//            for (int j = 1; j <=x ; j++)
//            {
//                if (i>j)
//                System.out.print("*");
//
//
//            }
//            System.out.println(" ");
//        }

//        for (int i = 1; i <= x; i++) {
//            for (int j = x; j >= 1; j--) {
//
//                if (j > i) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println(" ");
//
//
//        }
        for (int i = 1; i<=x ; i++) {


            for (int j = x; j >= 1; j--) {
                if (j >= i) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}

