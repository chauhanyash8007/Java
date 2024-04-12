// Time complexity =O(n^2)

import java.util.ArrayList;

public class pairSum9 {

    // Brute Force
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("The pair is : " + "(" + list.get(i) + "," + list.get(j) + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum(list, target));

    }
}
