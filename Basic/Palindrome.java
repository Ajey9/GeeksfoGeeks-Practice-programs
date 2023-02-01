package GeeksforGeeks;
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class Palindrome
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Pal pal = new Pal();
            String ans = pal.is_palindrome(n);
            System.out.println(ans);
        }
    }
}

class Pal
{
    public String is_palindrome(int n)
    {
        String string = Integer.toString(n);

        char[] chars = string.toCharArray();
        char[] re = new char[chars.length];

        int j = chars.length-1;
        for(int i= 0; i<chars.length;i++)
        {
            re[i] = chars[j--];
        }

        if(Arrays.equals(chars, re))
        {
            return "Yes";
        }
        else {
            return "No";
        }
    }
}
