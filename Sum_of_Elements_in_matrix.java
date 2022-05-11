package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * version - 11th May 2022
 */
public class Sum_of_Elements_in_matrix {
        public static void main(String[] args) throws IOException {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                int N = Integer.parseInt(read.readLine());
                int M = Integer.parseInt(read.readLine());

                int[][] Grid = new int[N][M];

                for(int i=0;i<N;i++)
                {
                    for(int j=0;j<M;j++)
                    {
                        Grid[i][j] = Integer.parseInt(read.readLine());
                    }
                }

            for(int i=0;i<N;i++) {
                for (int j = 0; j < M; j++) {
                    System.out.print(Grid[i][j]+" ");
                }
                System.out.println();
            }
                Add ob = new Add();
                System.out.println("Sum of Elements of Matrix is " +ob.sumOfMatrix(N, M, Grid));
            }
}

class Add {
        int sumOfMatrix(int N, int M, int[][] Grid)
        {
            int sum = 0;

            for(int i=0;i<N;i++)
            {
                for(int j=0;j<M;j++)
                {
                    sum = sum+ Grid[i][j];
                }
            }
            return sum;
        }

}
