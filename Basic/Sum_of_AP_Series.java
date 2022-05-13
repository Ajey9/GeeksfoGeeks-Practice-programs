package GeeksforGeeks.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * version - 11th May 2022
 */
public class Sum_of_AP_Series {
    public static void main(String[] args) throws IOException
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                long n = Long.parseLong(bufferedReader.readLine());
                Long a = Long.parseLong(bufferedReader.readLine());
                Long d = Long.parseLong(bufferedReader.readLine());
                Sum ob = new Sum();
                Long ans = ob.sum_of_ap(n, a, d);
                System.out.println(ans);
            }
        }
class Sum
{
    public long sum_of_ap(long n, long a, long d)
    {
        long sum = 0;

        for(long i=1; i<=n; i++)
        {
            sum = sum + (a + (i-1)*d);
        }
        return sum;
    }
}

