package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 03/03/2017.
 */
public class PalindromeName
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the String : ");
        String str = sc.nextLine();
        char ch=str.charAt(0);
        String reverse = " ";
        for (int i=str.length()-1;i>=0;i--)
        {
            reverse =reverse+str.charAt(i);
        }
        System.out.println("The reverse is : " +reverse);
        if (str.equals(ch))
        {
            System.out.println("The string is Palindrome_24 ");
        }else
            {
                System.out.println("Not Palindrome_24 ");
            }
    }
}
