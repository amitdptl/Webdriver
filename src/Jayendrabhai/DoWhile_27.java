package Jayendrabhai;

/**
 * Created by User on 06/03/2017.
 */
public class DoWhile_27
{
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nEnter any Number :");
//        int x = sc.nextInt();
        int i=1;
        System.out.print("\nThe Multiplication Table of 1 to 10 is :");
        System.out.print("\nNo=1 \t\tno=2 \t no=3 \t No=4 \t no=5 \t no=6 \t No=7 \t no=8 \t no=9 \t no=10 ");
        do {
            System.out.print("\n1*"+i+"="+(i*1)+"\t\t "+(i*2)+"\t\t "+(i*3)+"\t\t "+(i*4)+"\t\t "+(i*5)+"\t\t "+(i*6)+"\t\t "+(i*7)+"\t\t "+(i*8)+"\t\t "+(i*9)+"\t\t "+(i*10));
            i++;
        }while (i<=10);
    }
}
