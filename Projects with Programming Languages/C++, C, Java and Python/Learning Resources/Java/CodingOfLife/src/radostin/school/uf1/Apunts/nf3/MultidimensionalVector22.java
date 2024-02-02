package radostin.school.uf1.Apunts.nf3;

public class MultidimensionalVector22 {
    public static void main(String[] args) {
        //Tridimensional vector
        int[][][] threeC = new int[5][10][8];

        for (int i = 0; i < threeC.length; i++) {
            for (int j = 0; j < threeC[i].length; j++) {
                for (int k = 0; k < threeC[i][j].length; k++) {
                    System.out.print(threeC[i][j][k] + " ");
                }
                //System.out.print(Arrays.toString(threeC[i][j]) + " ");
            }
            System.out.println();
        }

        int[][][] threeLine = new int[4][][];
        //Qautridimensional vector
        int[][][][] fourColumn = new int[3][][][];
        int[][][][] fourLine = new int[3][1][7][];
    }
}
