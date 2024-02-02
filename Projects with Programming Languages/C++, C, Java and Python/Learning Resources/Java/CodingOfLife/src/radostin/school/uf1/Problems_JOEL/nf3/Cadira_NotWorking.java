package radostin.school.uf1.Problems_JOEL.nf3;

import java.util.Arrays;
import java.util.Scanner;

public class Cadira_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.skip("[\r\n]*").nextInt();

        while (cases --> 0){
            // Tractament de cada cas
            String[] guys, turns;

            // Omplim el vector en el nom dels xiquets
            String names = scanner.skip("[\r\n]*").nextLine();
            guys=names.split(" "); // Crea un vector de strings que conte les subcadenes de la cadena inicial separades per caracter que passem com a parametro.

            turns = scanner.skip("[\r\n]*").nextLine().split("");

            if (guys.length<= turns.length){
                System.out.println("CAP GUANYADOR");
                continue;
            }

            int start = 0;

            for (int i = 0; i < turns.length; i++) {
                int turn = Integer.parseInt(turns[i]);

                while (turn>0) {
                    do {
                        start++;
                        start = start % guys.length;
                        if (guys[start]!=null){
                            break;
                        }
                    } while (true);
                }

                guys[start]=null;
                do {
                    start++;
                    start = start % guys.length;
                    if (guys[start]!=null){
                        break;
                    }
                } while (true);
            }
            System.out.println(Arrays.toString(guys));
        }
    }
}
