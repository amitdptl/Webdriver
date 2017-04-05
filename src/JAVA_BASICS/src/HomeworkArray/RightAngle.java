package HomeworkArray;

import java.util.Scanner;

/**
 * Created by amit on 07/03/2017.
 */
public class RightAngle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int x = s.nextInt();
        int no = 1;
        for (int i = 1; i <=x; i++)
           {

            for (int j = 1; j <=i; j++)
             {

                System.out.print(no);
                 no++;
             }
            System.out.println();
        }

    }

}
