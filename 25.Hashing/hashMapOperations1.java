import java.util.*;

public class hashMapOperations1 {

    public static void main(String[] args) {

        // Create
        HashMap<String, Integer> map = new HashMap<>();

        // 1) Put Operations (add) Time -> O(1)
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);

        // HashMaps are Known as UnOrder maps so if we add in line but
        // it is not Confirmed that it will come out in order form
        // it will always print in UnOrder Form they don't follow order it is unDefied
        System.out.println(map);

        // 2) Map Size + isEmpty Operations
        System.out.println("size = " + map.size());
        System.out.println(map.isEmpty());

        // 3) Remove Operation Time -> O(1)
        System.out.println(map.remove("China"));
        System.out.println(map);

        // 4) Get Operations Time -> O(1)
        int population = map.get("India");
        System.out.println(population);
        System.out.println("not existing value will return Null value = " + map.get("Indonesia"));

        // 5) ContainsKey Operation Time -> O(1)
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Indonesia"));

        // 6) Clear Operation To Remove All Elements Form Map
        map.clear();
        System.out.println(map.isEmpty());

    }
}