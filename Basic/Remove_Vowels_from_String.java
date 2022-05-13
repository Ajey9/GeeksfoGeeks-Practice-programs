package GeeksforGeeks.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remove_Vowels_from_String {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string");
        String string = bufferedReader.readLine();

        Vowels_Removal vowels_removal = new Vowels_Removal();
        System.out.println(vowels_removal.removeVowels(string));
    }
}

class Vowels_Removal
{
    public String removeVowels(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<string.length();i++)
        {
            if(!(string.charAt(i) == 'a' || string.charAt(i) =='e' || string.charAt(i) =='i' ||string.charAt(i) =='o'||string.charAt(i) == 'u'
                    || string.charAt(i) == 'A' || string.charAt(i) == 'E' ||string.charAt(i) =='I'||string.charAt(i) =='O'||string.charAt(i) =='U'))
            {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
