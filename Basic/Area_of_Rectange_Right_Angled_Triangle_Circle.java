package GeeksforGeeks.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @version - 9th May 2022
 */
public class Area_of_Rectange_Right_Angled_Triangle_Circle {
        public static void main(String[] args) throws IOException {
            var read = new BufferedReader(new InputStreamReader(System.in));

                String[] S = read.readLine().split(" ");
                int L = Integer.parseInt(S[0]);
                int W = Integer.parseInt(S[1]);
                int B = Integer.parseInt(S[2]);
                int H = Integer.parseInt(S[3]);
                int R = Integer.parseInt(S[4]);

                int[] ptr = Areas.getAreas(L,W,B,H,R);

                System.out.print(ptr[0]);
                System.out.print(" ");
                System.out.print(ptr[1]);
                System.out.print(" ");
                System.out.println(ptr[2]);
            }
        }


    class Areas {
        static int[] getAreas(int L , int W , int B , int H , int R) {

            int[] array_of_areas  = new int[3];

            array_of_areas[0] = L*W;
            array_of_areas[1] = (B*H)/2;
            array_of_areas[2] = (int)(Math.pow(R,2)* 3.14);

            return array_of_areas;
        }
}
