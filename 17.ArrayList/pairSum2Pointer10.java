// Time Complexity = O(n)

import java.util.ArrayList;

public class pairSum2Pointer10 {

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int leftPointer = 0;
        int rightPointer = list.size() - 1;

        while (leftPointer != rightPointer) {
            // case 1
            if (list.get(leftPointer) + list.get(rightPointer) == target) {
                System.out.println("The pair is : " + "(" + list.get(leftPointer) + "," + list.get(rightPointer) + ")");
                return true;
            }
            // case 2
            if (list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer++;
            } else {
                // case 3
                rightPointer--;
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
