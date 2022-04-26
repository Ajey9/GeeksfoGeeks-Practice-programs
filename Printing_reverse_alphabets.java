package GeeksforGeeks;
/*
  @author - Ajay Gathadi
  @version - 17th April 2022
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printing_reverse_alphabets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string : ");
        String string = bufferedReader.readLine();

        Solution solution = new Solution();
        System.out.println(solution.reversing(string));
    }
}

class Solution
{
    String reversing(String s)
    {
        StringBuffer str = new StringBuffer();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            {
                int position = s.codePointAt(i) - 64;
                char bet= (char)(91 - position);
                str.append(bet);
            }
            else
            {
                int position = s.codePointAt(i) - 96;
                char bet = (char)(123 - position);
                str.append(bet);
            }
        }
        return str.toString();
    }
}
