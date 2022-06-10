package GeeksforGeeks.Basic;
/*
A.B = a1 * b1 + a2 * b2 + a3 * b3

A x B = (a2 * b3 - a3 * b2) i - (a1 * b3 - b1* a3) j + (a1 * b2 - a2 * b1) k

|A|2 = a12 + a22 + a32

If A.B = 0, then A and B are perpendicular.

If |A X B|2 = 0, then A and B are parallel.
*/

/*A and B vector as parameter
 returns 1 if they are parallel to each other,
 2 if they are perpendicular to each other or 0 otherwise.
 A and B vectors will contain (a1,a2,a3) and (b1,b2,b3) respectively.

Input: A = 3i + 2j + k, B = 6i + 4j + 2k
Output: 1
Explanation: |A X B|2 = 0
 */
import java.lang.*;
import java.io.*;

public class Paraller_perpandicular {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
                String[] S1 = br.readLine().trim().split(" ");
                String[] S2 = br.readLine().trim().split(" ");
                int[] A = new int[3];
                int[] B = new int[3];
                for(int i = 0; i < 3; i++)A[i] = Integer.parseInt(S1[i]);
                for(int i = 0; i < 3; i++)B[i] = Integer.parseInt(S2[i]);
                PP ob = new PP();
                int ans = ob.find(A, B);
                System.out.println(ans);
            }
        }
    }
class PP
    {
        public int find(int[] A, int[] B)
        {
            int A_B = 0;
            for(int i=0;i<3;i++)
            {
                A_B += (A[i]*B[i]);
                System.out.println(A_B);
            }

            int AxB = ((A[1]*B[2])-(A[2]*B[1]))-((A[0]*B[2])-(B[0]*A[2]))+((A[0]*B[1])-(A[1]*B[0]));

            if(Math.pow(AxB, 2) == 0)
            {
                return 1;
            }
            else if(A_B == 0)
            {
                return 2;
            }
            else
                return 0;
        }
}
