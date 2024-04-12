// Time Complexity = O(n)

import java.util.ArrayList;

public class pairSum2Advance11 {

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int breakingPoint = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) { // breaking point
                breakingPoint = i;
                break;
            }
        }

        int leftPointer = breakingPoint + 1; // smallest
        int rightPointer = breakingPoint; // largest

        while (leftPointer != rightPointer) {
            // case 1
            if (list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            }
            // case 2
            if (list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer = (leftPointer + 1) % n;
            } else {
                // case 3
                rightPointer = (n + rightPointer - 1) % n;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 11,15,6,8,9,10 --> sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));
    }

}
