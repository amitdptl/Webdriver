package Jayendrabhai;
import java.util.Scanner;

/**
 * Created by User on 06/03/2017.
 */
public class AddTwoMatrix_16
{
    public static void main(String args[])
    {
        int x, y, c, d ;
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter the number of rows and columns of matrix");
        x = in.nextInt();
        y  = in.nextInt();

        int first[][] = new int[x][y];
        int second[][] = new int[x][y];
        int sum[][] = new int[x][y];

        System.out.println("Enter the elements of first matrix");

        for (  c = 0 ; c < x ; c++ )
            for ( d = 0 ; d < y ; d++ )
                first[c][d] = in.nextInt();

        System.out.println("Enter the elements of second matrix");

        for ( c = 0 ; c < x ; c++ )
            for ( d = 0 ; d < y ; d++ )
                second[c][d] = in.nextInt();

        for ( c = 0 ; c < x ; c++ )
            for ( d = 0 ; d < y ; d++ )
                sum[c][d] = first[c][d] + second[c][d];

        System.out.println("Sum of entered matrices:-");

        for ( c = 0 ; c < x ; c++ )
        {
            for ( d = 0 ; d < y ; d++ )
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }
    }
}

