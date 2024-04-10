// Time Complexity = O(n^2)
// Space Complexity = O(1)

public class majorityElements5 {

    public static int majorityElements(int numbers[]) {
        int majorityCount = numbers.length / 2;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count = count + 1;
                }
            }
            if (count > majorityCount) {
                return numbers[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 2, 1, 1, 1, 2, 2, };
        System.out.println(majorityElements(numbers));
    }

}
