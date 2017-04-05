package HomeworkArray;
import java.lang.String;

public class SpecificValue {

public static boolean contains(int[] arr, int item)
       {
        for (int n : arr) {
     if (item == n) {return true;}
        }
        return false;
        }
 public static void main(String[] args) {
      int[] arr = {50,60,89,78,456,58,56,78,80};
        System.out.println(contains(arr, 78));
        System.out.println(contains(arr, 215));
        }
}
