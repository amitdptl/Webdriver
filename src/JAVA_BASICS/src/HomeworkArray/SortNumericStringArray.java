package HomeworkArray;

import java.util.Arrays;

/**
 * Created by amit on 07/03/2017.
 */
public class SortNumericStringArray
{
    public static void main(String[] args) {


        int[] x = {125, 256, 952, 649, 4454, 21, 6656, 100};
        String[] y = {"raju", "maya", "jayesh", "pratham", "jagubhai", "kamal"};

        System.out.println("Original numeric array : "+Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("Sorted numeric array : "+Arrays.toString(x));
        System.out.println("Original numeric array : "+Arrays.toString(y));
        Arrays.sort(y);
        System.out.println("Sorted numeric array : "+Arrays.toString(y));

    }
}
