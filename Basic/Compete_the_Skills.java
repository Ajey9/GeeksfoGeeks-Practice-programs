package GeeksforGeeks.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Compete_the_Skills {
    static long ca = 0;
    static long cb = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while(t-- >0)
        {
            int n=3;
            long[] a = new long[(int) (n)];
            long[] b = new long[(int)(n)];

            String[] inputLine = bufferedReader.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
            {
                a[i] = Long.parseLong(inputLine[i]);
            }

            String[] inputLine1 = bufferedReader.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
            {
                b[i] = Long.parseLong(inputLine1[i]);
            }

            Compete compete = new Compete();
            compete.scores(a, b);
            System.out.print(ca+ " "+cb);
        }
    }
}

class Compete
{
    public void scores(long[] a, long[] b)
    {
        int ca=0;
        int cb =0;
        for(int i=0; i<3;i++)
        {
            if(a[i] > b[i])
            {
               ca += 1;
            }
            else //if(a[i] < b[i])
            {
                cb += 1;
            }
        }
        Compete_the_Skills.ca= ca;
        Compete_the_Skills.cb = cb;
    }
}
