package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Pattern_of_Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String string = bufferedReader.readLine();

        Pattern_String pattern_string = new Pattern_String();
        ArrayList<String> arrayList = pattern_string.pattern(string);
        for(String result : arrayList)
            System.out.println(result);

    }
}

class Pattern_String
{
    ArrayList<String> pattern(String s)
    {
        ArrayList<String> stringArrayList = new ArrayList<>();

        for(int i = s.length()-1; i>=0 ; i--)//Executes the loop s.length time
        {
            stringArrayList.add(s.substring(0,i+1)); //With Every Decrement of i, Prints the letter till i.
        }
        return stringArrayList;
    }

}
