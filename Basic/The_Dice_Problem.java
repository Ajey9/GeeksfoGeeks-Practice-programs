package GeeksforGeeks.Basic;

import java.io.IOException;
import java.util.Scanner;

public class The_Dice_Problem {

    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
         int N=sc.nextInt();
            int ans  = Opposite.oppositeFaceOfDice(N);
            System.out.println(ans);
        }
    }
}
class Opposite{
    static int oppositeFaceOfDice(int N){
        int [] dice = {6,5,4,3,2,1};

        return dice[N-1];
    }
}

