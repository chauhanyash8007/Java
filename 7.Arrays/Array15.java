public class Array15 {

    public static int search(int number[], int target) {
        // min will have index of minimum element of numbers

        int min = minSearch(number);

        // find in sorted left

        if (number[min] <= target && target <= number[number.length - 1]) {
            return search(number, min, number.length - 1, target);
        }
        // find in sorted right
        else {
            return search(number, 0, min, target);
        }
    }

    // binary search to find target in left to right boundary

    public static int search(int numbers[], int left, int right, int target) {
        int l = left;
        int r = right;

        // System.out.println(left+" "+right);

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    // smallest element index

    public static int minSearch(int numbers[]) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && numbers[mid - 1] > numbers[mid]) {
                return mid;
            } else if (numbers[left] <= numbers[mid] && numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int numbers[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        System.out.println(search(numbers, target));
        System.out.println(search(numbers, target, target, target));

        System.out.println(minSearch(numbers));
    }
}
