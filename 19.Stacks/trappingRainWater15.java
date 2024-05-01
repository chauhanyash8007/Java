
//Time Complexity : o(n)
//Space Complexity: o(n)
import java.util.*;

public class trappingRainWater15 {
    public static int maxWater(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            while ((!stack.isEmpty()) && (height[stack.peek()] < height[i])) {

                int pop_height = height[stack.peek()];
                stack.pop();
                if (stack.isEmpty())
                    break;
                int distance = i - stack.peek() - 1;
                int min_height = Math.min(height[stack.peek()], height[i]) - pop_height;

                trappedWater += distance * min_height;
            }
            stack.push(i);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.print(maxWater(arr));

    }
}
