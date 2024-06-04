import java.util.*;

public class TowSum18 {
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // diff = given target - number given at ith index
            int diff = target - arr[i];
            // check if found difference is present in the MAP list
            if (visited.containsKey(diff)) {
                // if difference in map matches with the ith index element in array
                return new int[] { i, visited.get(diff) };
            }
            // add arr element in map to match with future element if forms a pair
            visited.put(arr[i], i);
        }
        // if no matches are found
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4 };
        int target = 6;

        // int[] result = twoSum(arr, target);
        // if (result[0] != 0 || result[1] != 0) {
        // System.out.println("Indices of the two numbers that add up to the target:");
        // System.out.println("Index 1: " + result[0]);
        // System.out.println("Index 2: " + result[1]);
        // } else {
        // System.out.println("No two numbers found that add up to the target.");
        // }

        int[] result = twoSum(arr, target);
        System.out.println("Indices of the two numbers that add up to the target:");
        System.out.println("Index 1: " + result[1]);
        System.out.println("Index 2: " + result[0]);
    }

}
