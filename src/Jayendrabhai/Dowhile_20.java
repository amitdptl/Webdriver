package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 06/03/2017.
 */
public class Dowhile_20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter any Five Digit Number :");
        int x = sc.nextInt();
        int a,b=0,c=0,oSum=0,eSum=0;
        while (x>0)
        {
            a=x%10;
            if(a%2==0)
            {
                eSum=eSum+a;
                b++;
            }else
                {
                    oSum=oSum+a;
                    c++;
                }
            x=x/10;
        }
        System.out.println("The Number of Even digit is : " +b+ " and It's Sum is : "+eSum);
        System.out.println("The Number of Odd digit is : " +c+ " and It's Sum is  : "+oSum);
    }
}
