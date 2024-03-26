// Time Complexity = O(n log n)
// Space Complexity = O(1)

public class SearchAndRotated3 {

    public static int searchAndRotatedArray(int[] array, int target, int si, int ei) {

        if (si > ei) {
            return -1;
        }
        // kam
        int mid = si + (ei - si) / 2;

        // case found
        if (array[mid] == target) {
            return mid;
        }

        // mid on line 1
        if (array[si] < array[mid]) {
            // case a : mid left
            if (array[si] <= target && target <= array[mid]) {
                return searchAndRotatedArray(array, target, si, mid - 1);

            } else {
                // case b : mid right
                return searchAndRotatedArray(array, target, mid + 1, ei);

            }

        }

        // mid on line 2
        else {
            // case c : mid right
            if (array[mid] <= target && target <= array[ei]) {
                return searchAndRotatedArray(array, target, mid + 1, ei);
            } else {
                // case d : mid left
                return searchAndRotatedArray(array, target, si, mid - 1);
            }

        }

    }

    public static void main(String[] args) {
        int array[] = { 4, 5, 6, 7, 0, 1, 2, };
        int target = 0;
        int targetIndex = searchAndRotatedArray(array, target, 0, array.length - 1);
        System.out.println(targetIndex);
    }

}
