package radostin.school.uf1.Problems_JOEL.nf3;

import java.util.Scanner;

public class MaximDeMatriu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NumCases = scanner.nextInt();

        while (NumCases --> 0){
            int rows = scanner.nextInt();
            int columns = scanner.nextInt();
            int max = 0, iMax = 0, jMax = 0;

            int[][] matrix = new int[rows][columns];

            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    matrix[j][k] = scanner.nextInt();
                    if (j==0 && k==0){
                        max=matrix[0][0];
                        iMax=0;
                        jMax=0;
                    } else if (matrix[j][k] >= max){
                        max = matrix[j][k];
                        iMax = j;
                        jMax = k;
                    }
                }
            }
            System.out.printf("%d %d%n", iMax+1, jMax+1);
        }
    }
}

