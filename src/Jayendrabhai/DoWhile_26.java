package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 06/03/2017.
 */
public class DoWhile_26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any  Number :");
        int x = sc.nextInt();
        do
        {
            System.out.print(x+",");
            x--;

        }while (x>=0);

    }
}
