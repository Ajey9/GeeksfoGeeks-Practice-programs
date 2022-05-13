package GeeksforGeeks.Basic;

public class Addition {

    /**
     *This method  updates the @param - matrix_1 and saves the memory
     * */
    public void addition(int[][] matrix_1, int[][] matrix_2) {

        for(int i=0;i< matrix_1.length;i++)
        {
            for(int j=0;j<matrix_2.length;j++)
            {
                matrix_1[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }
    }
}
