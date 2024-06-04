import java.util.*;

public class LinkedHashSet10 {
    public static void main(String[] args) {
        // Ordered using Doubly linked Lists
        // Linked HashSets Are Implemented By Linked HashMaps
        // Performance = Linked HashSets < HashSet
        // Time -> O(1)

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("NoIda");
        cities.add("BengALuru");
        System.err.println(cities);

        System.out.println();

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("NoIda");
        lhs.add("BengALuru");
        System.err.println(lhs);

    }
}
