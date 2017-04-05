package Jayendrabhai;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 05/03/2017.
 */
public class DuplicateString
{
    public static void main(String[] args)
    {
        String[]users="jayenra,aum,bhoomi,aum,bhavesha,navya".split(",");
        Set<String> uniqueUsers=new HashSet<String>();
        for (int i = 0; i <users.length ; i++)
        {
            if (!uniqueUsers.add(users[i]))
                users[i] = "Duplicate";
        }
        System.out.println(Arrays.toString(users));

    }
}
