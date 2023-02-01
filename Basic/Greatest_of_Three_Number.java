package GeeksforGeeks;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Greatest_of_Three_Number {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            int C = Integer.parseInt(S[2]);
            Greatest ob = new Greatest();
            System.out.println(ob.greatestOfThree(A, B, C));
        }
    }
}

class Greatest {
    int greatestOfThree(int A, int B, int C) {

        int great = (A<B)?B:A;
        int greatest = (great<C)?C:great;
        return greatest;
    }
}

