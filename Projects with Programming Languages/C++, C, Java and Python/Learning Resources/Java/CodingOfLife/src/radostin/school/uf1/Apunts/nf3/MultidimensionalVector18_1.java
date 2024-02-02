package radostin.school.uf1.Apunts.nf3;

public class MultidimensionalVector18_1 {
    public static void main(String[] args) {
        //First attempt
        int[][] RectangularMatrix = new int[5][10];

            for (int i = 0; i < RectangularMatrix.length; i++) {
                for (int j = 0; j < RectangularMatrix[i].length; j++) {
                    System.out.print(RectangularMatrix[i][j] + " ");
                }
                System.out.println();
            }

        System.out.println();

        //Second attempt
        int[][] InfinityMatrix = new int[3][2];

            for (int i = 0; i < InfinityMatrix.length; i++) {
                for (int j = 0; j < InfinityMatrix[i].length; j++) {
                    System.out.print(InfinityMatrix[i][j] + " ");
                }
                System.out.println();
            }

    }
}
