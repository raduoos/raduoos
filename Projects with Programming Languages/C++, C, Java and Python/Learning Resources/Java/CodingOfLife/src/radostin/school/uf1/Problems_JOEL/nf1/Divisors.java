package radostin.school.uf1.Problems_JOEL.nf1;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numCases = input.nextInt();
        while (numCases --> 0){
            //Tractament de cada cas
            int num = input.nextInt();
            int divisor = 1;
            while (divisor <= num){
                if (num % divisor == 0){
                    System.out.printf("%d ", divisor);
                }
                divisor++;
            }
            System.out.println();
        }
    }
}
