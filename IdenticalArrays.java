//**  Marstella, Taryn */
//**  SDEV200 M1A3 */

import java.util.Scanner;

public class IdenticalArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input for the first 3x3 array
        System.out.println("Enter the elements of the first 3x3 array:");
        int[][] m1 = new int[3][3];
        enterMatrixElements(scanner, m1);

        //  user input for the second 3x3 array
        System.out.println("Enter the elements of the second 3x3 array:");
        int[][] m2 = new int[3][3];
        enterMatrixElements(scanner, m2);

        // Check if the arrays are identical and display the result
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical.");
        } 
            else {
                System.out.println("The two arrays are not identical.");
        }
    }

    // Method to enter elements into a 3x3 matrix
    private static void enterMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to check if two 3x3 matrices are identical
    public static boolean equals(int[][] m1, int[][] m2) {
        // Check if both arrays have the same dimensions
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }

        // Check if the corresponding elements are equal
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }

        // If all checks pass, the arrays are identical
        return true;
    }
}

