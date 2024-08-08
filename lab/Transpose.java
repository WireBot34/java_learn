package lab;

import java.util.Scanner;

class MatrixTranspose {

    // Method to get matrix from the user
    int[][] getMatrix() {
        Scanner scanner = new Scanner(System.in);

        // Getting the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Getting the elements of the matrix from the user
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to find the transpose of the matrix
    int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        // Transposing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to display the matrix
    void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create an object of MatrixTranspose class to access its methods
        MatrixTranspose mt = new MatrixTranspose();

        // Get the matrix from the user
        int[][] matrix = mt.getMatrix();

        // Find the transpose of the matrix
        int[][] transpose = mt.transposeMatrix(matrix);

        // Display the original matrix
        System.out.println("Original Matrix:");
        mt.displayMatrix(matrix);

        // Display the transpose of the matrix
        System.out.println("Transpose of the Matrix:");
        mt.displayMatrix(transpose);
    }
}

