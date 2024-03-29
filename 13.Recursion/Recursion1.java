// Print numbers in decreasing order
// Print number from n to 1
//Time Complexity = O(n)

public class Recursion1 {

    public static void printInDecreasingOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printInDecreasingOrder(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printInDecreasingOrder(n);
    }
}
