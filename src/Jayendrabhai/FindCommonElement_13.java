package Jayendrabhai;

/**
 * Created by User on 06/03/2017.
 */
public class FindCommonElement_13
{
    public static void main(String[] args)
    {
        int a[]={2,3,4,7,8,2,36,7};
        int b[]={2,3,7,5,10};
        int c=0;
        int t=0;
        int tCounter=0;
        for (int i = 0; i <a.length ; i++)
        {
            t=a[i];
            tCounter=0;
            for (int j = 0; j <b.length ; j++)
            {
                if(t==b[j])
                {
                    tCounter++;
                }
            }
            if(tCounter==1)
            {
                t=a[i];
                c++;
                System.out.println(t);
            }
        }

    }
}
