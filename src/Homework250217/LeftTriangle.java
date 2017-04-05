package Homework250217;

/**
 * Created by amit on 28/02/2017.
 */
public class LeftTriangle
{
    public static void main(String[]args)
    {
        for (int i = 0; i <9 ; i++)
        {
            for (int j = 0; j <9-i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <i ; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
