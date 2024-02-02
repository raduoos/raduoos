package radostin.school.uf1.Apunts.nf3;

import java.util.Arrays;

public class Vector8 {
    public static void main(String[] args) {

        int n = 5;
        float[] valors = new float[n++];

        for (int i = 0; i < valors.length; i++) {
            valors[i] = i;
        }

        System.out.println(Arrays.toString(valors));
    }
}
