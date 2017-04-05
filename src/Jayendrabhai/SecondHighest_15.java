package Jayendrabhai;

import java.util.Arrays;

/**
 * Created by User on 06/03/2017.
 */
public class SecondHighest_15
{
    public static void main(String[] args)
    {
        int a[]={2,13,25,46,67,89,21,5};
        Arrays.sort(a);
        System.out.println("Largest Number :"+a[a.length-1]);
        System.out.println("second Largest Numbber :" +a[a.length-2]);
    }

}
