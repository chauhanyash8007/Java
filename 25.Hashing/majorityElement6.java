// Time -> O(n)

import java.util.*;

public class majorityElement6 {
    public static void main(String[] args) {
        int array[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            // if (map.containsKey(array[i])) {
            // map.put(array[i], map.get(array[i]) + 1);
            // } else {
            // map.put(array[i], 1);
            // }
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        // Set<Integer> keySet = map.keySet();
        // for (Integer key : keySet) {
        // if (map.get(key) > array.length / 3) {
        // System.out.println(key);
        // }
        // }

        for (Integer key : map.keySet()) {
            if (map.get(key) > array.length / 3) {
                System.out.println(key);
            }
        }

    }
}
