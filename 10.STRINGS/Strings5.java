// print subStrings

public class Strings5 {

    public static String subString(String str, int s1, int e1) {
        String subStr = "";
        for (int i = s1; i < e1; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 5));

        // inbuilt function to find subStrings for any String
        System.out.println(str.subSequence(0, 5));
    }
}
