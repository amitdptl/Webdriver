package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 03/03/2017.
 */
public class Armstrong_23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("\nEnter the number to check is it Armstrong_23 or not? :");
        int x = sc.nextInt();
        int length=(int)(Math.log10(x)+1);
        int arm=0,a,b;
        b=x;
        switch (length)
        {
            case 2:
                while(x>0)
                {
                    a= x%10;
                    x=x/10;
                    arm= arm+a*a;
                }
                break;
            case 3:
                while(x>0)
                {
                    a= x%10;
                    x=x/10;
                    arm= arm+a*a*a;
                }
                break;
            case 4:
                while(x>0)
                {
                    a= x%10;
                    x=x/10;
                    arm= arm+a*a*a*a;
                }
                break;
            case 5:
                while(x>0)
                {
                    a = x % 10;
                    x = x / 10;
                    arm = arm +a*a*a*a*a;
                }
                break;
            default:
                System.out.println("Error Number should be Between 2 to 5 digit");
        }

        if (arm ==b)
        {
            System.out.println( +b+ " is Armstrong_23 Number ");
        }
        else
        {
            System.out.println(+b+ " is not Armstrong_23 Number ");
        }
    }
}
