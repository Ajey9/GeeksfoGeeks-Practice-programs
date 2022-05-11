package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * version - 11th May 2022
 */
public class Mean {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(read.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(read.readLine());

        System.out.println(Average.mean(N, A));
        }
}

    class Average {
        static int mean(int N, int[] A) {
            int sum = 0;

            for (int i : A) {
                sum += i;
            }
            return sum / N;
        }
    }
