// Time Complexity = O(n)

import java.util.ArrayList;
import java.util.Collections;

public class lonelyNumbers13 {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < numbers.size() - 1; i++) {
            if (numbers.get(i - 1) + 1 < numbers.get(i) && numbers.get(i) + 1 < numbers.get(i + 1)) {
                list.add(numbers.get(i));
            }
        }

        if (numbers.size() == 1) {
            list.add(numbers.get(0));
        }
        if (numbers.size() > 1) {
            if (numbers.get(0) + 1 < numbers.get(1)) {
                list.add(numbers.get(0));
            }
            if (numbers.get(numbers.size() - 2) + 1 < numbers.get(numbers.size() - 1)) {
                list.add(numbers.get(numbers.size() - 1));
            }
        }
        return list;

    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(6);
        numbers.add(5);
        numbers.add(8);
        System.out.println(findLonely(numbers));

    }
}
