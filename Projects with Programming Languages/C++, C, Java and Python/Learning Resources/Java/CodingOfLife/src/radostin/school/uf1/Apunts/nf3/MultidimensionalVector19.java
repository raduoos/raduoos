package radostin.school.uf1.Apunts.nf3;

public class MultidimensionalVector19 {
    public static void main(String[] args) {
        //Bidimensional vector or matrix of 5x4
        int[][] nums = new int[5][4];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
