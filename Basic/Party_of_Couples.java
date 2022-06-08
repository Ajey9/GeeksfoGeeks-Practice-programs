package GeeksforGeeks.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program find out which element is occuring only once in a given array.
 */
public class Party_of_Couples {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] input_line = read.readLine().trim().split("\\s+");
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);

            System.out.println(Single.findSingle(N, arr));
        }
    }
}
class Single {
    static int findSingle(int N, int[] arr) {
        int single = 0;

        for(int i=0;i<N;i++)
        {
           single = single ^ arr[i];
        }
        return single;
    }
}

