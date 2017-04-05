package Homework250217;
import java.util.Scanner;

/**
 * Created by amit on 26/02/2017.
 */
public class EmpSalary
{
    public static void main(String[]arg)
     {
         Scanner in= new Scanner(System.in);

         System.out.print("Enter Employee ID : ");
         int EmpId=in.nextInt() ;
         System.out.print("Enter Employee Name : ");
         String name=in.next();

         System.out.print("Enter Basic Salary : ");
         double sal=in.nextDouble();
         double hra=(sal*10/100);
         double da=(sal*8/100);
         double ta=(sal*9/100);
         double pf=(sal*20/100);
         double gs=sal+hra+da+ta-pf;

         System.out.println("_______________Salary Slip______________");
         System.out.println("Employee ID\t\t\t:\t\t"+EmpId);
         System.out.println("Employee Name\t\t:\t\t"+name);
         System.out.println("______________________________________");
         System.out.println("Basic Salary         :  "+sal);
         System.out.println("HRA                  :  "+hra);
         System.out.println("DA                   :  "+da);
         System.out.println("PF                   :  "+pf);
         System.out.println("_______________________________________");
         System.out.println("Gross Salary         :  "+gs);


     }
}
