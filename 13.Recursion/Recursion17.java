// find length of string using recursion
// Time Complexity = O(n^2)
// Space Complexity = O(n)

public class Recursion17 {

    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return length(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(length(str));
    }
}
