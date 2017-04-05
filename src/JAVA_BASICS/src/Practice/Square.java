package Practice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by amit on 07/03/2017.
 */
public class Square {
    public static void main(String[] args)

    {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter size : ");
        int x = s.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <=x ; j++)
            {
                if (j==1||j==x||i==1||i==x)
                {System.out.print("*");}
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");


        }
    }
}