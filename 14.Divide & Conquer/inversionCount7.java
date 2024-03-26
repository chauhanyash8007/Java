// Time Complexity = O(n^2)

public class inversionCount7 {

    public static int getInvCount(int array[]) {
        int n = array.length;
        int invCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    public static void main(String[] args) {
        int array[] = { 1, 20, 6, 4, 5 };
        System.out.println("inversion count  = " + getInvCount(array));
    }
}
