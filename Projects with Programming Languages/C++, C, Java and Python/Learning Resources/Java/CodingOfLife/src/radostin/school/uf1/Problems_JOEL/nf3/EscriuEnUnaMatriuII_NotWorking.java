package radostin.school.uf1.Problems_JOEL.nf3;

import java.util.Scanner;

public class EscriuEnUnaMatriuII_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        for (int k = 0; k < columns; k++) {
            int temp = matrix[i][k];
            matrix[i][k] = matrix[j][k];
            matrix[j][k] = temp;
        }

        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < columns; l++) {
                System.out.println(matrix[k][l] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
