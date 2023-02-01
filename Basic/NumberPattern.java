package GeeksforGeeks;

import java.io.*;
import java.util.*;

class NumberPattern
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();

        Pattern ob = new Pattern();
        ArrayList<String> res = ob.numberPattern(N);

        for (String re : res) {
            System.out.print(re + " ");
        }
        System.out.println();
    }
}
class Pattern{
    ArrayList<String> numberPattern(int N){
        ArrayList<String> list = new ArrayList<String>();

        //Little Slower approach
        /*
        String string = "";

        for(int i=1;i<=N;i++)
       {
           for(int j=1;j<=i;j++)
           {
               string = string+ j;
               if(j==i && j>1) {
                   for (int k = j; k >= 2; k--) {
                       string = string + (k - 1);
                   }
               }
           }
           string = string+ " ";
       }
        list.add(string);
        */


        // Time Efficient Approach
        StringBuilder string = new StringBuilder();

        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                string.append(j);
            }

            for(int j=i-1;j>=1;j--)
            {
                string.append(j);
            }
            string.append(" ");
        }
        list.add(string.toString());

        return list;
    }
}
