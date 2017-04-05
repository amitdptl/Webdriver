package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 03/03/2017.
 */
public class PrimeNumber_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter any Number :");
        int x = sc.nextInt();
        int i;
        if (x == 1)
        {
            System.out.println("Smallest Prime Number is 2");
        }
        for (i = 2; i < x; i++)
        {
            if (x % i == 0)
            {
                System.out.println(" Not a Prime");
                break;
            }
        }
        if (x == i) {
            System.out.print(" Is Prime Number");

        }
    }
}

