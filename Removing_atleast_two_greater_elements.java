package GeeksforGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Removing_atleast_two_greater_elements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(bufferedReader.readLine());
        long[] array = new long[(int)N];

        String[] input = bufferedReader.readLine().trim().split(" ");
        for(int i=0; i<N;i++)
        {
            array[i] = Long.parseLong(input[i]);
        }
        Remove_Two_Greater_Elements remove_two_greater_elements = new Remove_Two_Greater_Elements();
        long[] answer = remove_two_greater_elements.remove_Elements(array,N);

        StringBuilder stringBuilder = new StringBuilder();
        for (long l : answer)
            stringBuilder.append(l+ " ");
        System.out.println(stringBuilder);
    }
}

class Remove_Two_Greater_Elements
{
    public long[] remove_Elements(long[] array, long N)
    {
        for(int i=1;i<N;i++)
        {
            for(int j=0;j<N;j++) {
                if (array[i] < array[j]) {
                    long temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        long[] arr = new long[array.length-2];
        for(int i=0;i< array.length-2;i++)
            arr[i] = array[i];
            //System.arraycopy(array, 0, arr, 0, array.length - 2); // Another Way
        return arr;
    }
}
