package Jayendrabhai;

/**
 * Created by User on 06/03/2017.
 */
public class charactorRhombusStructure
{
    public static void main(String[] args)
    {
        int a=1;
        char start='A'-1;
        int l=1;
        l=l-1;
        for (int i = 1; i <=4 ; i++)
        {
            for(int j=1;j<=a;j++)
            {char ch=(char)(start);
                if(j<=i) {
                    ch = (char) (start+j );

                }else
                    {
                      ch=(char)(start+l);
                      l++;

                    }
                System.out.print(ch);


            }
            System.out.println("");
            a=a+2;


        }



    }
}
