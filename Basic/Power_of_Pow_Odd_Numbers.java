package GeeksforGeeks.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Power_of_Pow_Odd_Numbers {
    public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("For many times you want to calculate");
            int T = Integer.parseInt(br.readLine().trim());
            while(T-->0)
            {
                System.out.println("Enter for " +T+ " time");
                long n = Long.parseLong(br.readLine().trim());
                Math_Power_Odd_Add ob = new Math_Power_Odd_Add();
                long ans = ob.sum_of_square_oddNumbers(n);
                System.out.println(ans);
            }
        }
    }
class Math_Power_Odd_Add
    {
        public long sum_of_square_oddNumbers(long n)
        {
            long sum = 0;
            for(int i=1; i<=n*2;i++)
            {
                if(i%2 != 0 )
                {
                    sum += (Math.pow(i,2));
                }
            }
            return sum;
        }
    }

