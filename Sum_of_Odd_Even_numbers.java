package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_of_Odd_Even_numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number till you want to have sum of Odd and Even numbers");
        int number = Integer.parseInt(bufferedReader.readLine());

        Sum_OddEven sum_oddEven = new Sum_OddEven();
        int[] sum = sum_oddEven.find_sum(number);

        for (int j : sum)
            System.out.print(j + " ");
    }
}

class Sum_OddEven
{
    public int[] find_sum(int n)
    {
        int even_sum = 0;
        int odd_sum = 0;
        int[] summ = new int[2];

        for(int i=1; i<=n;i++)
        {
            if(i%2 == 0)
            {
                even_sum += i;
            }
            else
                odd_sum += i;
        }

        summ[0] = odd_sum;
        summ[1] = even_sum;

        return summ;
    }
}
