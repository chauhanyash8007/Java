// Here i loop is running for n/2 times and inner loop j is running for j+j*2 times means log n times 
// So total Time Complexity is = O(n log n)

public class example2 {
    public static void main(String[] args) {
        int k = 0;
        int n = 4;

        for (int i = n / 2; i <= n; i++) {
            for (int j = 2; j <= n; j = j * 2) {
                k = k + n / 2;

            }

        }
    }
}
