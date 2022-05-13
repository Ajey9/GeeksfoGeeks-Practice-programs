package GeeksforGeeks.Basic;

import java.util.Scanner;

public class Count_of_Camel_Case_Letters {
    public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- > 0)
            {
                String s = sc.next ();
                System.out.println (new Sol().countCamelCase (s));
            }

        }
}
class Sol
{
    int countCamelCase (String s)
    {
        int sum =0 ;
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i) >='A' && s.charAt(i) <='Z')
            {
                sum += 1;
            }
        }
         return sum;
    }
}

