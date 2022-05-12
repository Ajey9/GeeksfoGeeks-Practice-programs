package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_of_Digits {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(read.readLine());

        System.out.println(Sum_Digit.sumOfDigits(N));
    }
}

class Sum_Digit
{
    static int sumOfDigits(int N)
    {
        int remainder = 0;
        while(N > 1)
        {
            remainder = remainder + (N%10); // Takes the remainder which is last digit of given number;
            N = N/10;                      // This gives updated number after remainder
            if(N<=1)
                remainder = remainder + N;
        }
        return remainder;
    }
}