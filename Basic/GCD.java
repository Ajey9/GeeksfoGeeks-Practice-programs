package GeeksforGeeks;

import java.util.*;
class GCD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(G.gcd(A,B));
    }
}
class G
{
    public static int gcd(int A , int B)
    {
       if( A == 0) {
           return B;
       }
       else {
           return gcd(B % A, A);
       }
    }
}
