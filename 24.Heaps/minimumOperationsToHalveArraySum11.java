
//Time Complexity : o(n log n)
//Space Complexity: o(n)
import java.util.*;

public class minimumOperationsToHalveArraySum11 {
    static int minOps(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            pq.add(-numbers.get(i));
        }
        double temp = sum;
        int cnt = 0;
        while (temp > sum / 2) {
            int x = -pq.peek();
            pq.remove();
            temp -= Math.ceil(x * 1.0 / 2);
            pq.add(x / 2);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(
                List.of(
                        1, 5, 8, 19));
        int count = minOps(numbers);
        System.out.println(count);

    }
}
