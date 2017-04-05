package Jayendrabhai;

import java.util.Arrays;

/**
 * Created by User on 05/03/2017.
 */
public class SortArray
{
    public static void main(String[] args)
    {
        int a[] = {33,10,15,16,35};
        String s[] = {"jayendra","bhavesh","arvind","kavita","sneha","niyam","suresh"};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        Arrays.sort(s);
        for (int j=0;j<s.length;j++)
        {
            System.out.println(s[j]);
        }



    }
}
