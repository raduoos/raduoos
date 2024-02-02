package radostin.school.uf1.Problems_JOEL.nf2;

import java.util.Scanner;

public class QuadratMagicReloaded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        while (numCases --> 0){
            int dimension = scanner.nextInt();
            int[][] matrix = new int[dimension][dimension];
            int value = 1;

            int i = 0, j = dimension/2;
            matrix[i][j] = value++;

            while (value <= dimension * dimension){
                int oldI = i, oldJ = j;
                i--;
                    if (i==-1){
                        i = dimension - 1;
                    }
                j--;
                    if (j==-1){
                        j = dimension - 1;
                    }

                if (matrix[i][j]==0){
                    matrix[i][j]=value++;
                } else {
                    i=oldI+1;
                    j=oldJ;
                    matrix[i][j] = value++;
                }
            }

            for (int k = 0; k < matrix.length; k++) {
                for (int l = 0; l < matrix[k].length; l++) {
                    System.out.printf("%d ", matrix[k][l]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
