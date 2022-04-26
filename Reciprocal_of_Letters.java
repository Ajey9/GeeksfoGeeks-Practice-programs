package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reciprocal_of_Letters {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String string = bufferedReader.readLine();
        System.out.println(Reciprocal.reciprocate_letters(string));
    }
}

class Reciprocal
{
   public static String reciprocate_letters(String str)
    {
        StringBuilder stringBuffer = new StringBuilder();

        for(int i=0; i<str.length(); i++)
        {
            if(!Character.isLetter(str.codePointAt(i)))
            {
                stringBuffer.append(str.charAt(i));
            }
            else
            if((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
            {
                int place = str.codePointAt(i) - 96;
                char letter = (char) (123 - place);
                stringBuffer.append(letter);
            }
            else
             {
                 int place = str.codePointAt(i) - 64;
                 char letter = (char) (91 - place);
                 stringBuffer.append(letter);
            }
        }
        return stringBuffer.toString();
    }
}
