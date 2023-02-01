package GeeksforGeeks;

import java.util.ArrayList;
import java.util.List;

public class G1 {
    public static int gcd(int A , int B){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=A; i++)
        {
            if( A%i == 0)
            {
                list.add(i);

            }
        }


        List<Integer> list1 = new ArrayList<>();
        for(int i=1; i<=B;i++)
        {
            if(B%i == 0)
            {
                list1.add(i);

            }
        }

        System.out.println(list);
        System.out.println(list1);

        List<Integer> integers = new ArrayList<>();

        for (Integer value : list) {
            for (Integer integer : list1) {
                if (value.equals(integer)) {
                    integers.add(integer);
                }
            }
        }

            return integers.get(integers.size()-1);
    }
}
