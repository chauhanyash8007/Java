// Print numbers in Increasing order
// Print number from n to 1
//Time Complexity = O(n)
//Space Complexity = O(n)

public class Recursion2 {

    public static void printInIncreasingOrder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInIncreasingOrder(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        printInIncreasingOrder(n);
    }
}
