package Jayendrabhai;

/**
 * Created by User on 05/03/2017.
 */
public class AvegArray
{
    public static void main(String[] args)
    {
        int a[]={12,14,25,16,46};
        int sum=0;
        for (int i = 0; i <a.length-1 ; i++)

           sum=sum+a[i];
            double avg=sum/a.length;

            System.out.println("The Average of array element "+avg);
    }

}
