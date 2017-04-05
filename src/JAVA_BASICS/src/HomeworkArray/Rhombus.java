package HomeworkArray;

/**
 * Created by amit on 07/03/2017.
 */
public class Rhombus {
    public static void main(String[] args) {
        int coloumn = 1;
        int increase=0;
        int raws=7;
        int space=3, space2=0;


        for (int i = 1; i <=raws; i++) {

            for (int k = 0; k < space ; k++) {

                System.out.print(" ");

            }
            space--;

            for (int j = 1; j <= coloumn; j++) {

                System.out.print("*");
            }

            space2++;
            System.out.println();
            if (i<raws/2+1) {
                coloumn = coloumn + 2;
            }
            else
            {
                coloumn=coloumn-2;
            }
            for (int j = 3; j < space2; j++) {

                System.out.print(" ");

            }


        }
    }
}