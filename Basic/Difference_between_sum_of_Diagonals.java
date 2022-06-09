package GeeksforGeeks.Basic;
import java.io.*;

public class Difference_between_sum_of_Diagonals {
        public static void main(String[] args) throws IOException {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                int N = Integer.parseInt(read.readLine());
                int[][] Grid = new int[N][N];
                for (int i = 0; i < N; i++) {
                    String[] s = read.readLine().split(" ");
                    for (int j = 0; j < N; j++) Grid[i][j] = Integer.parseInt(s[j]);
                }
                Difference ob = new Difference();
                System.out.println(ob.diagonalSumDifference(N, Grid));
            }
        }
}
class Difference {
     int diagonalSumDifference(int N, int[][] Grid) {
         int primaryDiagonal = 0;
         int secondaryDiagonal = 0;

         for(int i=0;i<N;i++)
         {
             for(int j=0;j<N;j++)
             {
                 if(i == j)
                 {
                     primaryDiagonal += Grid[i][j];
                 }
             }
         }

         for(int i=0;i<N;i++)
             for(int j=0;j<N;j++)
             {
                 if(j == (N-1)-i) {
                     secondaryDiagonal += Grid[i][j];
                 }
             }

         int difference = primaryDiagonal-secondaryDiagonal;
         if(difference< 0)
             difference = -(difference);

         return difference;
     }
}
