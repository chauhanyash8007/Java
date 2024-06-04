// Time -> o(n)

import java.util.*;

public class largestSubArrayWithSumZero15 {
    public static void main(String[] args) {
        int array[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        HashMap<Integer, Integer> map = new HashMap<>();
        // sum ,Index

        int sum = 0;
        int length = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
            if (map.containsKey(sum)) {
                length = Math.max(length, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        System.out.println("largest SubArray with 0 Sum = " + length);

    }
}
