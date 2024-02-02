package radostin.school.uf1.Apunts.nf3;

public class Vectors13 {
    public static void main(String[] args) {
        //Vector of 5 numbers.
        int[] values = {10, 20, 30, 40, 50};

        for (int i = values.length-1; i >= 0; i--) {
            System.out.printf("\nvalues[%d] = %d", i, values[i]);
        }
    }
}
