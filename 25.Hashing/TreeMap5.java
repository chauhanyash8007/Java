import java.util.*;

public class TreeMap5 {
    public static void main(String[] args) {
        // It's Keys are Arranged In Sorted Order
        // So Because Of Sorting All Operations Time -> O(log n) if using Red-Black
        // Trees
        // It's Internal Implementations Is Done By Using --> Red-BLack Trees
        // null value are not allowed to add
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("India", 100);
        treeMap.put("China", 150);
        treeMap.put("US", 50);
        treeMap.put("Indonesia", 6);

        System.out.println(treeMap);

        System.out.println();

        // Print In UnOrdered List
        HashMap<String, Integer> Map = new HashMap<>();
        Map.put("India", 100);
        Map.put("China", 150);
        Map.put("US", 50);

        System.out.println(Map);
    }
}
