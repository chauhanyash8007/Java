
import java.util.ArrayList;

public class mostFrequentNumberFollowingKey14 {

    public static int mostFrequent(ArrayList<Integer> numbers, int key) {
        int result[] = new int[1000];
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == key) {
                result[numbers.get(i + 1) - 1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(100);
        numbers.add(200);
        numbers.add(1);
        numbers.add(100);
        int key = 1;

        System.out.println(mostFrequent(numbers, key));

    }
}
