/*

  ****
  *  *
  *  *  print the following pattern
  ****

 */

public class pattern5 {

    public static void hollow_rectangle(int totRow, int totCols) {
        // outer-loop rows
        for (int i = 1; i <= totRow; i++) {
            // inner-loop cols
            for (int j = 1; j <= totCols; j++) {
                // cell-i,j
                if (i == 1 || i == totRow || j == 1 || j == totCols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}
