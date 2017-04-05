package HomeworkArray;

/**
 * Created by amit on 08/03/2017.
 */
public class Diamond2
        {
            public static void main(String[] args)
            {
                int c=5;
                int r=1;
                while (r<=c)
                {
                    int space =0;
                    while (space<c-r)
                    {
                        space++;
                        System.out.print(" ");
                    }
                    int j=r;
                    while (j>0){
                        j--;
                        System.out.print("* ");
                    }
                    System.out.println();
                    r++;

                }
                r=4;
                while (r>0) {
                    int spaces = 0;
                    while (spaces < c - r) {
                        spaces++;
                        System.out.print(" ");
                    }
                }
                int j=r;
                while (j>0){
                    System.out.print("* ");
                    j--;
                }
                System.out.println();
                r--;

                }
            }





