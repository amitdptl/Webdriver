package HomeworkArray;

/**
 * Created by amit on 07/03/2017.
 */
public class SumArray
{
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int sum= 0;
        for (int i: a)
        {
            sum+= i;
        }
        System.out.println("Sum of the array : " +sum);
    }
}
