package GeeksforGeeks.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diagonal_SUm {public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine().trim());
            while(T-->0)
            {
                int n = Integer.parseInt(br.readLine().trim());
                int[][] matrix = new int[n][n];
                for(int i = 0; i < n; i++){
                    String[] S = br.readLine().trim().split(" ");
                    for(int j = 0; j < n; j++)
                        matrix[i][j] = Integer.parseInt(S[j]);
                }
                Mat ob = new Mat();
                int ans = ob.DiagonalSum(matrix);
                System.out.println(ans);
            }
        }
}

class Mat
    {
        public int DiagonalSum(int[][] matrix)
        {
            int sum = 0;
            for(int i=0;i<matrix.length;i++) {
                sum = sum + matrix[i][i];
            }

            for(int j= matrix.length-1,i=0; j>=0;j--)
            {
                sum += matrix[i++][j];
            }
            return sum;
        }
    }

