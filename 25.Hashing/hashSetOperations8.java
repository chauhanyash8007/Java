import java.util.*;

public class hashSetOperations8 {
    public static void main(String[] args) {
        // HashSets Are Implemented By HashMaps
        // Performance = HashSet > Linked HashSet

        HashSet<Integer> set = new HashSet<>();

        // 1) Add Operations Time -> o(1)

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        // 2) contains Operation Time -> O(1)

        if (set.contains(2)) {
            System.err.println("set contains");
        }
        if (set.contains(3)) {
            System.out.println("set contains");
        }

        // 3) Remove Operations Time -> o(1)

        set.remove(2);
        System.out.println(set);

        // 4) size + Clear + isEmpty Operations

        System.out.println("size = " + set.size());
        set.clear();
        System.out.println("size = " + set.size());
        System.out.println(set.isEmpty());

    }
}
