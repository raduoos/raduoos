package radostin.school.uf1.Apunts.nf3;

import java.util.Random;

public class Random16 {
    public static void main(String[] args) {
        Random random = new Random();
        char letter = (char)(random.nextInt('j' - 'd' + 1) + 'd');
        System.out.println(letter);
    }
}
