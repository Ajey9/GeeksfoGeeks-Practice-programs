package GeeksforGeeks.Basic;
import java.io.*;


public class nPr {
    public static void main(String[] args)throws IOException
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            while(t-- > 0){
                String[] a = in.readLine().trim().split("\\s+");
                long n = Long.parseLong(a[0]);
                long r = Long.parseLong(a[1]);

                System.out.println(Permutation.calculation(n,r));
            }
        }
}
class Permutation {
    static long calculation(long n, long r){
         long fact_n = 1;
         long fact_r = 1;
         for(int i=0 ;i<n;i++)
         {
             fact_n = fact_n*(n-i);
         }

         for(int i=0;i<r;i++)
         {
             fact_r = fact_r*(r-i);
         }

         long difference_r = (n-r);
         long fact_difference_r = 1;

         for(int i=0;i<difference_r;i++) {
                 fact_difference_r = fact_difference_r * (difference_r - i);
         }

         return fact_n/fact_difference_r;
    }
}

