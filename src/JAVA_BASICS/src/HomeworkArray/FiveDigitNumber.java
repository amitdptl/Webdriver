package HomeworkArray;

import java.util.Scanner;

/**
 * Created by amit on 08/03/2017.
 */
public class FiveDigitNumber {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter any 5 digit number : ");
        int x = s.nextInt();
        int b=0;
        if (x<99999){
        while (x!=0 )
        {
            int a=x%10;
            b = b+a;
            x=x/10;
        }
        System.out.println(b);}
        else


        { System.out.println(" Error ");}

    }
}