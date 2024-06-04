import java.util.*;

public class TreeSets11 {
    public static void main(String[] args) {
        // Sorted In Ascending Order
        // null value are not allowed to add
        // TreeSets are implemented by TreeMaps
        // Time -> O(log n)

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

        System.out.println();

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Delhi");
        treeSet.add("Mumbai");
        treeSet.add("NoIda");
        treeSet.add("BengALuru");
        System.err.println(treeSet);

    }
}
