package Jayendrabhai;

import java.util.ArrayList;

/**
 * Created by User on 05/03/2017.
 */
public class RemoveElement
{
    public static void main(String[] args)
    {
        ArrayList a= new ArrayList<Integer>();
        a.add(0,12);
        a.add(1,23);
        a.add(2,45);
        a.add(3,56);
        a.add(4,70);
        a.add(5,78);
        a.remove(2);
        System.out.println(a);

    }
}
