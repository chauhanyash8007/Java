// Time -> o(n)

import java.util.*;

public class iterationOnHashMaps2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Indonesia", 6);
        map.put("Nepal", 5);

        // iteration
        // use Of keySet
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println(" Key = " + k + ",  Value = " + map.get(k));

        }

        System.out.println();

        // use of entrySet
        Set<Map.Entry<String, Integer>> key = map.entrySet();

        for (Map.Entry<String, Integer> k : key) {
            System.out.println(" Key = " + k.getKey() + ",  Value = " + k.getValue());

        }

    }
}
