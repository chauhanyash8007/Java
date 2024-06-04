// Time -> O(n+m) n=array1  m=array2 -> O(n)

import java.util.*;

public class unionAndInterSectionOd2Array13 {
    public static void main(String[] args) {
        int array1[] = { 7, 3, 9 };
        int array2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> set = new HashSet<>();

        // union
        for (int i = 0; i < array1.length; i++) {
            set.add(array1[i]);
        }
        for (int j = 0; j < array2.length; j++) {
            set.add(array2[j]);
        }

        System.out.println("unique set: " + set + "  size: " + set.size());

        // InterSection
        set.clear();

        for (int i = 0; i < array1.length; i++) {
            set.add(array1[i]);

        }
        int count = 0;
        for (int j = 0; j < array2.length; j++) {
            if (set.contains(array2[j])) {
                count++;
                System.out.print(array2[j] + " ");
                set.remove(array2[j]);

            }
        }
        System.out.println();

        System.out.println("InterSection : " + count);

    }
}
