package GeeksforGeeks.Basic;

import java.io.IOException;
import java.util.Scanner;

public class Floyds_Triangle {
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
            Triangle.printFloydTriangle(N);
        }
    }
}
class Triangle{
    static void printFloydTriangle(int N){
        int n = 0;
        for(int i=0;i<N;i++)
        {
            for(int j=0; j<=i;j++)
            {
                System.out.print((n += 1)+" " );
            }
            System.out.println();
        }
    }
}

