// Time Complexity=O(n^2)

import java.util.ArrayList;

public class containerWithMostWater7 {

    public static int storeWater(ArrayList<Integer> hight) {
        int maxWater = 0;
        for (int i = 0; i < hight.size(); i++) {
            for (int j = i + 1; j < hight.size(); j++) {
                int minHeight = Math.min(hight.get(i), hight.get(j));
                int width = j - i;
                int currentWater = minHeight * width;
                maxWater = Math.max(maxWater, currentWater);

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
