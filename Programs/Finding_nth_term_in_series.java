package GeeksforGeeks.Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program finds the Nth term in the series of sum of natural numbers
 * @version - 5th May 2022
 */
public class Finding_nth_term_in_series {
    public static void main(String[] args) throws IOException
    {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the number ");
         int N = Integer.parseInt(read.readLine());

         System.out.println(Nth_Term.findNthTerm(N));
     }
}
class Nth_Term {
        static int findNthTerm(int N)
        {
            int sum = 0;
            for(int i=1; i<=N;i++)
            {
                sum = sum +i;
                System.out.print(sum+ " ");
            }
            System.out.println();
            return sum;
        }
}
