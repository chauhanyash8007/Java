// return true is any value appears at least twice in given array 

// time complexity = O(n square)

public class Array14 {

    public static boolean containsDuplicate(int number[]) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = { 1, 1, 1, 3, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(containsDuplicate(number));
    }
}
