// write a function to find first occurence of an element in an array
// Time complexity = O(n)
// Space complexity = O(n)

public class Recursion7 {
    public static int firstOccurence(int array[], int key, int i) {
        if (i == array.length) {
            return -1;
        }
        // first compare to self
        if (array[i] == key) {
            return i;
        }
        // then look forward
        return firstOccurence(array, key, i + 1);

    }

    public static void main(String[] args) {
        int array[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOccurence(array, 5, 0));

    }
}
