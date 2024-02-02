package radostin.school.uf1.Problems_JOEL.nf3;

import java.util.Arrays;
import java.util.Scanner;

public class Amplitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        while (numCases-->0){
            int nMedicions = scanner.nextInt();
            int[] medicions = new int[nMedicions];
            for (int i = 0; i < medicions.length; i++) {
                medicions[i]=scanner.nextInt();
            }
            Arrays.sort(medicions);

            for (int i = 0; i < medicions.length/2; i++) {
                if (medicions.length % 2 == 0){
                    System.out.printf("%d %d ", medicions[(medicions.length/2)-1-i], medicions[(medicions.length/2)+i]);
                } else {
                    System.out.printf("%d %d ", medicions[(medicions.length/2)-i], medicions[(medicions.length/2)+1+i]);
                }
            }
            if (medicions.length % 2 == 0) {
                System.out.println();
            } else {
                System.out.println(medicions[0]);
            }
        }
    }
}
