// Time Complexity = O(n*log n)

public class majorityElements6 {

    private static int countInRanges(int numbers[], int number, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (numbers[i] == number) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementsRec(int numbers[], int si, int ei) {
        // base case the only elements in an array of size 1 is the majority
        // elements
        if (si == ei) {
            return numbers[si];
        }

        // recurse on left and right halves of this slice.

        int mid = (ei - si) / 2 + si;
        int left = majorityElementsRec(numbers, si, mid);
        int right = majorityElementsRec(numbers, mid + 1, ei);

        // if the tow halves agree on the majority elements , return it.
        if (left == right) {
            return left;

        }

        // otherwise , count each element and return the "winner" element.

        int leftCount = countInRanges(numbers, left, si, ei);
        int rightCount = countInRanges(numbers, right, si, ei);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElements(int numbers[]) {
        return majorityElementsRec(numbers, 0, numbers.length - 1);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElements(numbers));
    }
}
