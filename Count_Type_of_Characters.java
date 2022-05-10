package GeeksforGeeks;

import java.util.Scanner;

public class Count_Type_of_Characters {
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);

            String s = sc.next ();
            int[] res = new Counting().count(s);

            for (int i = 0; i < 4; i++)
                System.out.print (res[i]+ " ");

            int[] result = new Counting_via_Logic().count_via_logic(s);
                    for(int i:result)
                        System.out.print(i+" ");
        }
}

class Counting
{
    int[] count (String s)
    {
        int upper = 0, lower=0,digit=0, special_character =0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.codePointAt(i)))
                upper += 1;
            else if (Character.isLowerCase(s.codePointAt(i))) {
                lower += 1;
            } else if (Character.isDigit(s.codePointAt(i))) {
                digit += 1;
            }
            else if(!Character.isWhitespace(s.codePointAt(i)))
            special_character += 1;

        }
        return new int[]{upper,lower,digit,special_character};
    }
}

class Counting_via_Logic
{
    int[] count_via_logic(String s)
    {
        char[] chars = s.toCharArray();
        int upper = 0, lower=0,digit=0, special_character =0;
        for(int i=0;i<s.length();i++)
        {
            if(chars[i] >='A' && chars[i]<='Z')
            {
                upper += 1;
            }
            else if(chars[i]>='a' && chars[i]<='z')
            {
                lower +=1;
            }
            else if(chars[i] >= '0' && chars[i]<= '9')
            {
                digit += 1;
            }
            else
                special_character += 1;
        }
        return new int[] {upper,lower,digit,special_character};
    }
}


    
