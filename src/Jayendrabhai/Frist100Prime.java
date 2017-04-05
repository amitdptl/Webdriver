package Jayendrabhai;

/**
 * Created by User on 03/03/2017.
 */
public class Frist100Prime
{
    public static void main(String[] args)
    {
        int i, k=2;
        if (k == 1)
        {
            System.out.println("Smallest Prime Number is 2");
        }
        System.out.println("");
        for ( k = 2; k < 550; k++)
        {
            for (i = 2; i < k; i++)
            {
                if (k % i == 0)
                {
                   break;
                }
            }
            if (k == i)
            {
                System.out.print(k+",");
            }
        }
    }
}



