// Time complexity = O(n*2^n)
// Space Complexity = O(n)

public class printSubsetOfString2 {

    public static void findSubset(String str, String newStr, int i) {
        // base case
        if (i == str.length()) {
            if (newStr.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(newStr);

            }
            return;
        }

        // Recursion
        // Yes Choice
        findSubset(str, newStr + str.charAt(i), i + 1);

        // No Choice
        findSubset(str, newStr, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}
