package radostin.school.uf1.Apunts.nf3;

public class MultidimensionalVector20 {
    public static void main(String[] args) {
        //Bidimensional vector or matrix of 3x?
        int[][] matrix = new int[3][];

        matrix[0] = new int[5];
        matrix[1] = new int[3];
        matrix[2] = new int[1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
