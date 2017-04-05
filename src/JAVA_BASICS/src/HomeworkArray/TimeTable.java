package HomeworkArray;

import java.util.Scanner;

/**
 * Created by amit on 08/03/2017.
 */
public class TimeTable
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("From which number want to star table : ");
        int a=s.nextInt();
        System.out.print("Up to which number  u want table : ");
        int b=s.nextInt();

        if(a<b) {

            int number = 1, num2 = a;

            do {
                number = 1;
                do {
                    System.out.println(num2 + "x " + number + " = " + num2 * number);
                    number++;
                } while (number <= 10);
                System.out.println();
                num2++;
            } while (num2 <= b);
        }else {
            System.out.println("Wrong input");}
    }
}
