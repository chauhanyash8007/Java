// finding the largest & smallest element form array 

import java.util.*;

public class Matrices2 {

    public static void searchLargestAndSmallestElement(int matrix[][]) {

        Scanner sc = new Scanner(System.in);

        // for input element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // for print element

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (smallest > matrix[i][i]) {
                    smallest = matrix[i][j];
                }
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }

        }
        System.out.println("smallest element is : " + smallest);
        System.out.println("Largest element is : " + largest);
        sc.close();

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        searchLargestAndSmallestElement(matrix);

    }
}
