package Jayendrabhai;

/**
 * Created by User on 05/03/2017.
 */
public class GridArray
{
    public static void main(String[] args)
    {
        String[][] s=new String[10][10];
        for (int i = 0;i<10 ; i++)
        {

            for (int j = 0; j < 10 ; j++)
            {
                s[i][j]="- ";
                System.out.print(s[i][j]);
            }
            System.out.println();
        }

    }
}
