package GeeksforGeeks;

import java.util.*;
class Replace_5s_with_0s{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(Solution.convertFive(n));
        }
    }
}

class Solution{
    public static int convertFive(int n){
        String string = Integer.toString(n);

        char[] array = string.toCharArray();

        int i=0;
        while(i<string.length())
        {
            if(array[i] == '0')
            {
                array[i] = '5';
                i++;
            }
            else {
                i++;
            }
        }
        return Integer.parseInt(String.valueOf(array));
    }
}