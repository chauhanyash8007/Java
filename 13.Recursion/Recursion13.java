// Friends Pairing Problem
// Time Complexity=O(2^n)
// Space Complexity=O(n)

public class Recursion13 {

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // khm choices
        // single
        int single = friendsPairing(n - 1);

        // pair

        int pair = friendsPairing(n - 2);
        int pairWays = (n - 1) * pair;

        // totalWays

        int totalWays = single + pairWays;
        return totalWays;

        // return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));

    }
}
