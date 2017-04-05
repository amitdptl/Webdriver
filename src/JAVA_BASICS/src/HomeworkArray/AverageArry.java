package HomeworkArray;

/**
 * Created by amit on 07/03/2017.
 */
public class AverageArry
{    double average;
    public static void main(String[] args) {
        int []x={2,3,4,5,6,7};
        int sum=0;

        for (int i = 0; i <x.length; i++)
        {
            sum=sum+i;

        }
        System.out.println("Sum "+sum);
        double average=sum/x.length;
        System.out.println("Average "+average);
//        for (int i: x)
//        {
//            sum+=i;
//        }
//        double average=sum/x.length;
//        System.out.println(average);
//
    }
}
