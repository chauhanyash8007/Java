// Time = O(n)

import java.util.ArrayList;

public class maximumElement2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            // if (maximum < list.get(i)) {
            // maximum = list.get(i);
            // }
            maximum = Math.max(maximum, list.get(i));
        }
        System.out.println("Maximum Element is : " + maximum);

    }
}
