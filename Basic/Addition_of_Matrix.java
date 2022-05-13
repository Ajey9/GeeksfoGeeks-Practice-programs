package GeeksforGeeks.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition_of_Matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the matrix ");
        int n = Integer.parseInt(bufferedReader.readLine());

        int[][] matrix_1 = new int[n][n];
        int[][] matrix_2 = new int[n][n];

        System.out.println("Enter the 1st multi dimensional matrix ");
        // Input for Matrix 1
        for(int i=0 ; i<n;i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix_1[i][j] = Integer.parseInt(bufferedReader.readLine());
            }
        }

        System.out.println("Enter the 2nd multi dimensional matrix ");
        // Input for Matrix 2
        for(int i=0 ; i<n;i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix_2[i][j] = Integer.parseInt(bufferedReader.readLine());
            }
        }

        System.out.println("Matrix 1 is ");
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix_1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2 is ");
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix_2[i][j] + " ");
            }
            System.out.println();
        }

        Addition addition = new Addition();
        addition.addition(matrix_1, matrix_2);

        System.out.println("After addition the updated matrix is ");
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix_1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
