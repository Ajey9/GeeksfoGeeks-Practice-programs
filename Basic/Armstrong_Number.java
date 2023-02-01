package GeeksforGeeks;

import java.io.*;
import java.util.ArrayList;

class Armstrong_Number {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            System.out.println(Armstrong.armstrongNumber(n));
        }
    }
}

class Armstrong {
    static String armstrongNumber(int n){

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int N=n;
        while(n >=1)
        {
            list.add(n%10);
            System.out.println(list);
            n=n/10;
            System.out.println(n);
        }

        for(int i:list)
        {
            sum = sum + (int)Math.pow(i,3);
        }

        if(sum == N)
            return "Yes";
        else
            return "No";
    }

}
