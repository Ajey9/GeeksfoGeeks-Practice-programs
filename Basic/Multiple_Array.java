package GeeksforGeeks;

import java.util.*;

class Num {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n+5];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(Solution1.product(arr, n));
        }
    }
}
class Solution1 {

    public static int product(int[] arr,int n)
    {
        int multiplication = 1;

        for(int i=0;i<n;i++)
        {
            multiplication = multiplication *arr[i];
        }
        return multiplication;
    }
}

