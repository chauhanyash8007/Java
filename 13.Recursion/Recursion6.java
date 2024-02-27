// Check if a given array is sorted or not
// Time complexity = O(n)
// Space complexity = O(n)

public class Recursion6 {

    public static boolean checkIfSortedOrNot(int array[], int i) {
        if (i == array.length - 1) {
            return true;
        }
        if (array[i] > array[i + 1]) {
            return false;
        }
        return checkIfSortedOrNot(array, i + 1);

    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        System.out.println(checkIfSortedOrNot(array, 0));
    }
}
