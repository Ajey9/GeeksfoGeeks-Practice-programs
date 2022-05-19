package GeeksforGeeks.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Split_Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();

        List<String> ans = Splitting.splitString(S);
        for (String val : ans)
        {
            if (val.equals(" "))
                System.out.println(-1);
            else
                System.out.println(val);
        }
    }
}
class Splitting
{
    static List<String> splitString(String S)
    {
        String chars= " ";
        String numbers = " ";
        String special = " ";

        List<String> list = new ArrayList<>();

        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i) >='A' && S.charAt(i)<='Z' || S.charAt(i) >='a' && S.charAt(i) <='z')
            {
                chars += S.charAt(i);
            }
            else  if((S.charAt(i) >='0' && S.charAt(i) <='9'))
            {
                numbers += S.charAt(i);
            }
            else  if(!(Character.isDigit(S.charAt(i))) && !(Character.isLetter(S.charAt(i))))
            {
                special += S.charAt(i);
            }

        }
        list.add(chars);
        list.add(numbers);
        list.add(special);

        return list;
    }
}
