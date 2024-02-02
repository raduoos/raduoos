package radostin.school.uf1.Apunts.nf3;

import java.util.Random;

public class Random15 {
    public static void main(String[] args) {
        int throwss = 5;

        Random random = new Random();

        while (throwss>0){
            int face = random.nextInt(6)+1;
            System.out.println(face);

            throwss = throwss - 1;
        }
    }
}
