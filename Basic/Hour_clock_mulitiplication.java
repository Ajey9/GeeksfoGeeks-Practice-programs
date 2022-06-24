package GeeksforGeeks.Basic;
import java.io.*;

public class Hour_clock_mulitiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                String[] S = read.readLine().split(" ");

                int num1 = Integer.parseInt(S[0]);
                int num2 = Integer.parseInt(S[1]);

                System.out.println(Clock.mulClock(num1, num2));
            }
        }
}
class Clock {
        static int mulClock(int num1, int num2) {
            int num = num1*num2;

            if(num==12)
            {
                return 0;
            }
            else if(num>=0 && num<=11)
            {
                return num;
            }
            else
            {
                return num%12;
            }
        }
 }

