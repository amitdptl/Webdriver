package Jayendrabhai;
import java.util.Scanner;
//
///**
// * Created by amit on 27/03/2017.
// */
//locating every character in positin and total of character
public class SumOfNameP
//{
//    public static void main(String arg[])
//    {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("\n Enter name to count String : ");
//        String oringinal=sc.nextLine().toLowerCase();
//        char ch= oringinal.charAt(0);
//        int sum=0;
//        int length=oringinal.length();
//        System.out.println("Total character in string are : "+length);
//        for(int i=0; i<length; i++ )
//        {
//            ch = oringinal.charAt(i);
//            if(ch>='A' && ch<='Z')
//            {
//                System.out.println(ch+ " is position at \t: " + ((int) ch - 'A' + 1));
//                sum = sum + ((int) ch - 'A' + 1);
//            }
//            if (ch >= 'a' && ch <= 'z')
//                 {
//                System.out.println(ch + " is at position : " + ((int)ch -'a' + 1));
//                sum = sum + ((int) ch - 'a' + 1);
//                 }
//        }
//            System.out.println("\nThe total character in string is : "+sum);
//
//        }
//
//    }
//
//

{
    public static void main(String[] args)
       {
           Scanner sc= new Scanner(System.in);
           System.out.print("\nEnter any name : ");
           String name=sc.nextLine().toLowerCase();
           char ch=name.charAt(0);
           int sum=0;
           int length = name.length();

           System.out.print("\nTotal character in string is : "+length);
           System.out.println(" ");

           for (int i = 0; i <length ; i++)
               {
                   ch=name.charAt(i);
                   if (ch>='a' && ch<'z')
                     {
                         System.out.println(ch+" is at position : "+((int)ch-'a'+1));
                         sum= sum+((int)ch-'a'+1);

                     }


               }
           System.out.println("\nThe total character in string is : "+sum);





       }
}