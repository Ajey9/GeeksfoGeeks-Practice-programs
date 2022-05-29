package GeeksforGeeks.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remove_Characters_from_Alphanumeric_String {
    public static void main(String[] args) throws IOException {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                String s = read.readLine();

                Remove_Characters ob = new Remove_Characters();
                String result = ob.removeCharacters(s);

                System.out.println(result);
            }
        }
 }
class Remove_Characters {
        String removeCharacters(String S) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i<S.length();i++)
            {
                if(S.charAt(i) >= '0' && S.charAt(i) <='9')
                  stringBuilder.append(S.charAt(i));
            }
            return stringBuilder.toString();
        }
    }