package HomeworkArray;

/**
 * Created by amit on 09/03/2017.
 */
public class DiamondNumber {
    public static void main(String[] args) {

        int no = 1;
        int space = 3;
        int coloumn = 1;

        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j < space; j++) {
                System.out.println(" ");

                if (i < 4) {
                    space = space - 1;
                    no = i;
                } else {
                    space = space + 1;
                    no = 8 - i;
                }

            }
            for (int j = 1; j <= coloumn; j++) {
                int middlecoloumn = coloumn / 2 + 1;
                System.out.print(no);
                if (j < middlecoloumn) {
                    no--;
                } else {
                    no++;
                }
                System.out.println();
                if (i < 4) {
                    coloumn = coloumn + 2;
                } else {
                    coloumn = coloumn - 2;
                }
            }
        }
    }}