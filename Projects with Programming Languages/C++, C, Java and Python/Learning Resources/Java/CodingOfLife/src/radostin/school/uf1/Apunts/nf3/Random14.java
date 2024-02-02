package radostin.school.uf1.Apunts.nf3;

import java.util.Random;

public class Random14 {
    public static void main(String[] args) {
        Random random = new Random();

        //Generate between 0 and 10
        int randomNum = random.nextInt(11);
        //Generate unlimited num
        int unlimitedNum = random.nextInt();

        System.out.println(randomNum);
        System.out.println(unlimitedNum);
    }
}
