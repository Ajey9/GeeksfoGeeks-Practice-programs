package GeeksforGeeks;

import java.io.*;

/**
 * This program prints like this
 * Input - Time
 * Output - Time
 *          .ime
 *          ..me
 *          ...e
 */
class Triangle_shrinking_downwards {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String string = bufferedReader.readLine();

        String str = Word_Pattern_Solve.pattern(string);

        for (int i = 0; i < str.length(); i++)
        {
            System.out.print(str.charAt(i));
            if((i+1) == str.length())
                System.out.println();
        }
    }
}

class Word_Pattern_Solve
{
    static String pattern(String s)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            stringBuilder.append(".".repeat(i)); //@method '.repeat(i)' appends the "." i times.
            stringBuilder.append(s.substring(i));
        }
        return stringBuilder.toString();
    }
}