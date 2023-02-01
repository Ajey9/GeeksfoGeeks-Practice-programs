package GeeksforGeeks;

import java.util.*;

class BinaryRepresentation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            String ans = Binary.getBinaryRep(N);
            System.out.println(ans);
        }
    }
}

class Binary{
    static String getBinaryRep(int N){


        StringBuilder stringBuilders = new StringBuilder();
        int i=0;
        while(N != 1)
        {
            stringBuilders.append(N%2);
            N = N/2;
            i++;
            if(N == 1) {
                stringBuilders.append(1);
                i++;
                for(;i<30;i++)
                {
                    stringBuilders.append(0);
                }
            }
        }

        StringBuilder stringBuilder = stringBuilders.reverse();
        return stringBuilder.toString();
    }
}
