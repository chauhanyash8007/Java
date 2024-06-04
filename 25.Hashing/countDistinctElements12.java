import java.util.*;

public class countDistinctElements12 {
    public static void main(String[] args) {
        int array[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println("Distinct elements are: " + set.size());

    }
}
