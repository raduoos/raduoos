package radostin.school.uf1.Problems_JOEL.nf3;

import java.util.Scanner;

public class ElsAnimalsPreferitsDeJordina_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int cases = scanner.nextInt();

        while (cases-->0){
            int numValors = scanner.nextInt();
            String[] valors;
            String valorBuscat;
            boolean trobat = false;

            numValors = scanner.skip("[\r\n]*").nextInt();
            valors = new String[numValors-1];

            for (int i = 0; i < valors.length; i++) {
                valors[i] = scanner.skip("[\r\n]*").nextLine();
            }

            valorBuscat = valors[valors.length-1];

            for (int i = 0; !trobat && i < valors.length; i++) {
                if (valors[i].equals(valorBuscat)){
                    trobat = true;
                }

                if (trobat){
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
