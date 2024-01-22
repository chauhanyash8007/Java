/*
        1
       2 2
      3 3 3
     4 4 4 4      print the following pattern
    5 5 5 5 5
 
 */

public class pattern15 {

    public static void numberPyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // number

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberPyramid(5);
    }
}
