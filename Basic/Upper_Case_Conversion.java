package GeeksforGeeks.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * version - 9th May 2022
 */
public class Upper_Case_Conversion {
    public static void main(String[] args)throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
                String str = br.readLine();
                Conversion_to_upper conversion_to_upper = new Conversion_to_upper();
                System.out.println(conversion_to_upper.transform(str));

        }
    }
    class Conversion_to_upper
    {
        public String transform(String s)
        {
            char[] chars = s.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            int i=1;
            while(i< chars.length)
            {
                if(Character.isLetter(chars[i]) && Character.isLetter(chars[i-1]))
                {
                    i++;
                }
                else
                {
                    chars[i] = Character.toUpperCase(chars[i]);
                    i++;
                }
            }
             return new String(chars);
        }
    }

//Another simplest way thtough which we can have the result
//while(i< chars.length)
//            {
//                if(Character.isWhitespace(chars[i-1]))
//                {
//                    chars[i] = Character.toUpperCase(chars[i]);
//                }
//                i++;
//            }
