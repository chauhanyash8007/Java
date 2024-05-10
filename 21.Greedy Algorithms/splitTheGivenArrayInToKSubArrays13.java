//  Complexity :O((N−1)c(K−1))
//  (Here ‘c’ here depicts combinations i.e. ((n-1)!/((n-k)!*(k-1)!) Where N is the number of
//  elements of the array and K is the number of divisions that we are having)
//  Space Complexity: o(n)

public class splitTheGivenArrayInToKSubArrays13 {
    public static int ans = 10000000;

    public static void solve(int a[], int n, int k,
            int index, int sum, int maxSum) {
        if (k == 1) {
            maxSum = Math.max(maxSum, sum);
            sum = 0;
            for (int i = index; i < n; i++) {
                sum += a[i];
            }
            maxSum = Math.max(maxSum, sum);
            ans = Math.min(ans, maxSum);
            return;
        }
        sum = 0;
        for (int i = index; i < n; i++) {
            sum += a[i];
            maxSum = Math.max(maxSum, sum);
            solve(a, n, k - 1, i + 1, sum, maxSum);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int k = 3; // K divisions
        int n = 4; // Size of Array
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans + "\n");

    }
}
