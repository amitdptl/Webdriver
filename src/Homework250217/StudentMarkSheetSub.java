package Homework250217;

import java.util.Scanner;

/**
 * Created by amit on 26/02/2017.
 */


/**
 * Created by amit on 26/02/2017.
 */
public class StudentMarkSheetSub
{
    public static void main(String[]arg)
    {
        Scanner in= new Scanner(System.in);
        System.out.print(" Enter Student name : ");
        String name=in.next();
        System.out.print(" Enter Student Roll number : ");
        int Roll= in.nextInt();
        System.out.print(" Enter Maths marks : ");
        int Maths=in.nextInt();

        if(Maths<0)
        {System.out.println("Invalid mark entry, mark should not be negative");
        }
        System.out.print(" Enter Science marks : ");
        int Sci=in.nextInt();
        if(Sci<0)
        {System.out.println("Invalid mark entry, mark should not be negative");
        }
        System.out.print(" Enter English marks : ");
        int Eng=in.nextInt( );
        if(Eng<0)
        {System.out.println("Invalid mark entry, mark should not be negative");
        }

        int total=Maths+Sci+Eng;
        float p= (total)/3;

        System.out.println("_______________Mark Sheet______________");
        System.out.println("Student Name\t\t\t:\t\t"+name);
        System.out.println("Student Roll Number\t\t:\t\t"+Roll);
        System.out.println("______________________________________");
        System.out.println("Subject\t\t\t\t\t\tMarks");
        System.out.println("Maths\t\t\t\t:\t\t"+Maths);
        System.out.println("Science\t\t\t\t:\t\t"+Sci);
        System.out.println("English\t\t\t\t:\t\t"+Eng);
        System.out.println("_______________________________________");
        System.out.println("Total\t\t\t\t:\t\t"+total);
        System.out.println("Percentage\t\t\t:\t\t"+p);

        if(p>=80) {System.out.println( "Grade              :          A+");}
        else if (p>=60){System.out.println("Grade               :        A");}
        else if (p>=50) {System.out.println("Grade               :        B");}
        else if (p>=35){System.out.println("Grade               :         C");}

        if(Maths<35)    {System.out.println("Result              :       Fail");}
        else if(Sci<35) {System.out.println("Result              :       Fail");}
        else if (Eng<35){System.out.println("Result              :       Fail");}
        else{
                         System.out.println("Result              :        Pass");
        }



        System.out.println("_________________________________________");
    }
}
