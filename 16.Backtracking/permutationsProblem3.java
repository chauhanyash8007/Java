// Time complexity = O(n*n!)
// Space Complexity = O(n)

public class permutationsProblem3 {

    public static void findPermutation(String str, String ans) {

        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            // "abcde"= "ab"+"de" == "a b d e" if we want to remove "c" then
            String newStr = str.substring(0, i) + str.substring(i + 1); // no need to right i+1 to str.length
            // because in substring in build function last index is dose not count
            // like (0,1) means (0,0) it go to last index -1

            findPermutation(newStr, ans + current);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
