package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 03/03/2017.
 */
public class SumOfName
{
    public static void main(String[] args)
    {
        String original;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the string to count Sum :");
        original = in.nextLine();
        char ch = original.charAt(0);
        int sum=0;
        int length = original.length();
        System.out.println("\nThe total character in string is :"+length);
        System.out.println("\nThe position of alphabet in ABCD is :");
        for(int i=0; i<length; i++)
        {
            ch = original.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                System.out.println(ch+ " is position at \t: " + ((int) ch - 'A' + 1));
                sum = sum + ((int) ch - 'A' + 1);
            }
            if(ch>='a' && ch<= 'z')
            {
                System.out.println(ch + " is position at \t: " + ((int) ch - 'a' + 1));
                sum = sum + ((int) ch - 'a' + 1);
            }
        }
        System.out.println("\nThe total of alphabet position is :\t"+sum);
    }
}
