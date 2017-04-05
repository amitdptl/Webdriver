package Homework250217;
import java.util.Scanner;
/**
 * Created by amit on 26/02/2017.
 */

public class SalesComission
{
    public static void main(String []arg)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Sales ID       =  ");
        String id=in.next();
        System.out.print("Enter Seller's Name  =  ");
        String name=in.next();
        System.out.print("Enter Basic salary   =  ");
        double bs=in.nextDouble();
        System.out.print("Enter Sales amt      =  ");
        double salesamt=in.nextDouble();

        double comission;
         double total;
        if(salesamt>=50000)
           {
               comission=salesamt*35/100;
           }else if (salesamt>=30000)
               {
                   comission=salesamt*20/100;
               } else if(salesamt>=20000)
                    {
                        comission=salesamt*10/100;
                    }else if (salesamt>=10000 && salesamt>=1)
                        {
                            comission=salesamt*2/100;
                        }else{comission=0;}

        System.out.println("__________Salary Slip______________");
        System.out.println("Seller's Name     : "+name);
        System.out.println("Seller Id         : "+id);
        System.out.println("___________________________________");
        System.out.println("Basic salary      : "+bs);
        System.out.println("comission         : "+comission);
        System.out.println("                    =============  ");
        total=bs+comission;
        System.out.println("Total amt paid    : "+ total);



    }
}
