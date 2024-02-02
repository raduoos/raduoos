package radostin.school.uf1.Apunts.nf3;

public class MultidimensionalVector21 {
    public static void main(String[] args) {
        //Bidimensional vector or matrix of 3x?
        int[][] matrix = {{2, 8, 1, 6, 4}, {1, 6, 5}, {3}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println(" ");
        }
    }
}
