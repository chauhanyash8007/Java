// Time -> o(n)

import java.util.*;

public class subArraySumEqualToK16 {
    public static void main(String[] args) {
        int array[] = { 10, 2, -2, -20, 10 };
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        // sum,Count

        int sum = 0;
        int ans = 0;

        for (int j = 0; j < array.length; j++) {
            sum += array[j];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        System.out.println(" count of SubArray sum with To Value k = " + ans);

    }
}
