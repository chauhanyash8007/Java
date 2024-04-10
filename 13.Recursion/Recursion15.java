// print all index of the key
// Time Complexity = O(n)
// Space Complexity = O(n)

public class Recursion15 {

    public static void printAllKeyIndex(int array[], int index, int key) {
        if (index == array.length) {
            return;
        }

        if (array[index] == key) {
            System.out.print(index + " ");
        }

        printAllKeyIndex(array, index + 1, key);
    }

    public static void main(String[] args) {
        int array[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        printAllKeyIndex(array, 0, key);
    }
}
