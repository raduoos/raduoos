package radostin.school.uf1.Problems_JOEL.nf3;

import java.util.Arrays;
import java.util.Scanner;

public class ManInTheMiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        while (numCases-->0){
            int alumnes = scanner.nextInt();
            int fA=0, fB=0;
            int[] forces = new int[alumnes];
            for (int i = 0; i < forces.length; i++) {
                forces[i]=scanner.nextInt();
            }
            Arrays.sort(forces);

            for (int i = forces.length-1; i >= 1; i--) {
                if (fA<=fB){
                    fA += forces[i];
                } else {
                    fB+=forces[i];
                }
            }

            if (fA>fB) {
                if (fB + forces[0] > fA) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (fA + forces[0] > fB) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
