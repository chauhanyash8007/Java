import java.util.*;

public class LinkedHashMap4 {
    public static void main(String[] args) {
        // It is Used To print Value In Order that we have added
        // Print In Ordered List
        // All Operations Time -> O(1) -> same As HashMap
        LinkedHashMap<String, Integer> lMap = new LinkedHashMap<>();
        lMap.put("India", 100);
        lMap.put("China", 150);
        lMap.put("US", 50);

        System.out.println(lMap);

        System.out.println();

        // Print In UnOrdered List
        HashMap<String, Integer> Map = new HashMap<>();
        Map.put("India", 100);
        Map.put("China", 150);
        Map.put("US", 50);

        System.out.println(Map);

    }
}
