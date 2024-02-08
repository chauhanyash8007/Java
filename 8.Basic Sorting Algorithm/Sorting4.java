// inbuilt Sort

import java.util.Arrays;
import java.util.Collections;

public class Sorting4 {
    public static void main(String[] args) {
        // int arrays[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(arrays);
        // Arrays.sort(arrays, 0, 3); start index & end index+1

        Integer arrays[] = { 5, 4, 1, 3, 2 };

        // Arrays.sort(arrays, Collections.reverseOrder());
        Arrays.sort(arrays, 0, 3, Collections.reverseOrder());
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
