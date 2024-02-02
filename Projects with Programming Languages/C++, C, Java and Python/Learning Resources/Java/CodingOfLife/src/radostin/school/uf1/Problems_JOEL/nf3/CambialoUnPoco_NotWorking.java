package radostin.school.uf1.Problems_JOEL.nf3;

import java.util.Scanner;

public class CambialoUnPoco_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while(cases-->0){
            //Declaracio de variables
            int numvalues = scanner.nextInt();
            int [] valors = new int[numvalues];
            int valorBuscat, nouValor;

            //Instanciació de les variables
            numvalues = scanner.nextInt();
            valors = new int[numvalues];

            //Llegim els valors a guardar dins del vector
            for (int i = 0; i < valors.length; i++) {
                valors[i] = scanner.nextInt();

            }

            valorBuscat = scanner.nextInt();
            nouValor = scanner.nextInt();
            //Fi de lectura de entrada

            //fem el canvi
            for (int i = 0; i < valors.length; i++) {
                if (valors[i] == valorBuscat){
                    System.out.print(nouValor);
                } else {
                    System.out.println(valors[i]);
                }
                System.out.print(" ");
            }
            System.out.println();

        }

    }
}
