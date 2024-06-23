public class CatalansNumberRecursion1 {
    public static int CatalansNumber(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += CatalansNumber(i) * CatalansNumber(n - i - 1);

        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(CatalansNumber(n));
    }
}