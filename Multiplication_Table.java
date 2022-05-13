package GeeksforGeeks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args)throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0)
            {
                int N = sc.nextInt();
                ArrayList<Integer> ans = Mulitplication.getTable(N);
                for (Integer val: ans)
                    System.out.print(val+" ");
                System.out.println();
            }
        }
    }
    class Mulitplication{
        static ArrayList<Integer> getTable(int N){
            ArrayList<Integer> table = new ArrayList<>(10);
            int sum = 0;
            for(int i=0; i<10;i++)
            {
                sum = sum + N;
                table.add(sum);
            }
            return table;
        }
    }

