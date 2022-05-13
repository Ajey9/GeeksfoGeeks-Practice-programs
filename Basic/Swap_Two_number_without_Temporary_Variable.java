package GeeksforGeeks.Basic;
import java.util.*;
import java.lang.*;

/**
 * version - 11th May 2022
 */
public class Swap_Two_number_without_Temporary_Variable {
    public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();

       List<Integer> ans = Swap.get(a,b);
       List<Integer> res = Swapping.getting(a,b);
       System.out.println(ans.get(0)+" "+ans.get(1));
       System.out.print(res.get(0)+ " "+res.get(1));
        }
    }
class Swap{
    static List<Integer> get(int a,int b)
    {
      List<Integer> list = new ArrayList<>();
      list.add(b);
      list.add(a);

      return list;
    }
}

class Swapping
{
    static List<Integer> getting(int a, int b)
    {
        List<Integer> list = new ArrayList<>();
        a = a+b;
        b = a-b;
        a = a-b;

        list.add(a);
        list.add(b);

        return list;
    }
}

