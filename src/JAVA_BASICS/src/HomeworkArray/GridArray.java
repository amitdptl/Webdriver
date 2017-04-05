package HomeworkArray;
import java.lang.String;
/**
 * Created by amit on 07/03/2017.
 */
public class GridArray
{
    public static void main(String[] args)
    {
           int [][]a=new int[10][10];
        for (int i = 0; i < 10; i++)
        {
            for (int j = 1; j < 10; j++)
            {
                System.out.printf(" - ");
            }

            System.out.println();
        }
    }
}
