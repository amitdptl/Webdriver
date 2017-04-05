package HomeworkArray;

import java.util.Arrays;

/**
 * Created by amit on 08/03/2017.
 */
public class RemoveElement {
    public static void main(String[] args) {


        int[] x = {10, 20, 30, 40, 50};
        System.out.println("Original :"+ Arrays.toString(x));
      int removeIndex=2;
        for (int i = removeIndex; i < x.length-1; i++)
        {
           x[i]=x[i+1];
        }


              System.out.println("After removing : "+Arrays.toString(x));
    }
}