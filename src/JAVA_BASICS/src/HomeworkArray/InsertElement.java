package HomeworkArray;

import java.util.Arrays;

/**
 * Created by amit on 08/03/2017.
 */
public class InsertElement
{
    public static void main(String[] args) {
        int []x={15,45,89,78,56,80};
        //insert an element at 4th position
        int index=3;
        int newValue=25;

        System.out.println("Original Array :"+ Arrays.toString(x));
        for (int i = x.length-1; i >index ; i--)
        {
            x[i]=x[i-1];
        }
        x[index+1]=newValue;
        System.out.println("New Array : "+Arrays.toString(x));
    }
}

