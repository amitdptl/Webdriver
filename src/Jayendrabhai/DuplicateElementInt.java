package Jayendrabhai;

import java.util.Scanner;

/**
 * Created by User on 05/03/2017.
 */
public class DuplicateElementInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter no of Elements you want in array");
        num = s.nextInt();
        int c[] = new int[num];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) {
            c[i] = s.nextInt();
        }
        System.out.print("array elements\t:\t");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i] + ",");
        }
        System.out.println();
        int dup = c[0];
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == (c[j])) {
                    System.out.println(c[j]+" is  elements more than one time array" );
                }
            }
        }
    }
}
