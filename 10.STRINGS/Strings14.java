// check if the Strings sre anagrams

import java.util.Arrays;

public class Strings14 {

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        // convert Strings to lowercase.Why? so that we don't have to check separately
        // for lower & uppercase

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // first check if the length are same

        if (str1.length() == str2.length()) {

            // convert strings to chat array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // sort the char array

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // if sorted char arrays are same or identical then Strings are anagrams

            boolean result = Arrays.equals(str1charArray, str2charArray);

            if (result) {
                System.out.println(str1 + "and " + str2 + "are anagrams of each other");
            } else {
                System.out.println(str1 + "and " + str2 + "are  not anagrams of each other");

            }

        }
        // cases when length are not equal
        else {

            System.out.println(str1 + "and " + str2 + "are  not anagrams of each other");

        }

    }
}