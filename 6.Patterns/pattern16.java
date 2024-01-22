/*
        1
       212
      32123
     4321234      print the following pattern
    543212345
 
 */

public class pattern16 {

    public static void palindromicPatternwithNumber(int n) {
        // outer
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // number descending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // number ascending

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        palindromicPatternwithNumber(5);
    }
}
