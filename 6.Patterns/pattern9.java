/*
    1
    2 3
    4 5 6            print the following pattern
    7 8 9 10
    11 12 13 14 15
    
 */

public class pattern9 {

    public static void floyds_triangle(int n) {
        int counter = 1;
        // outer
        for (int i = 1; i <= n; i++) {
            // inner-how many times will counter will be printed
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyds_triangle(5);
    }
}