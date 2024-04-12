// Time Complexity=O(n)

import java.util.ArrayList;

public class containerWithMostWater2Pointer8 {

    public static int storeWater(ArrayList<Integer> hight) {
        int maxWater = 0;
        int leftPointer = 0;
        int rightPointer = hight.size() - 1;
        while (leftPointer < rightPointer) {
            // calculate water area
            int minHeight = Math.min(hight.get(leftPointer), hight.get(rightPointer));
            int width = rightPointer - leftPointer;
            int currentWater = minHeight * width;
            maxWater = Math.max(maxWater, currentWater);

            // update pointers
            if (hight.get(leftPointer) < hight.get(rightPointer)) {
                leftPointer++;

            } else {
                rightPointer--;
            }

        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<Integer>();
        // 1,8,6,2,5,4,8,3,7
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        System.out.println("max water can store between two height is : " + storeWater(hight));

    }
}
