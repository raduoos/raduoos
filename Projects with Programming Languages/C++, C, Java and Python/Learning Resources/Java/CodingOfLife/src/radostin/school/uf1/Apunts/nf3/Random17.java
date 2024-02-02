package radostin.school.uf1.Apunts.nf3;

import java.util.Random;

public class Random17 {
    public static void main(String[] args) {
        Random random = new Random();

        int num = random.nextInt(34 - 21 + 1) + 21;
        System.out.println(num);
    }
}
