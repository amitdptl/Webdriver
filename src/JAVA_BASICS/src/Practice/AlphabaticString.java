package Practice;

import javax.swing.*;
import java.util.Arrays;

/**
 * Created by amit on 14/03/2017.
 */
public class AlphabaticString
{
    public static void main(String[] args)
    {
        String[]x={"Surat", "Abad","Culcutta","Delhi"};
        int size=x.length;
        String y;

//        Arrays.sort(x);
//        System.out.println("After sort : "+  Arrays.toString(x));
        for (int i = 0; i <size ; i++)
           {
               for (int j =i+1; j <size; j++)
               {
                   if (i<j)
                   {
                       y= x[i];
                       x[i]=x[j];
                       x[j]=y;

                   }

               }

            }
        for (int i = 0; i <x.length ; i++)
        {
            System.out.println(x[i]);

        }

    }
}
