package radostin.school.uf1.Problems_JOEL.nf1;

import java.util.Scanner;

public class Caramels {
    public static void main(String[] args) {

        //Declaració de variables
        Scanner scanner =new Scanner(System.in);

        int nebots, caramels;


        //LLegim les dades
        caramels = scanner.nextInt();
        nebots = scanner.nextInt();

        //Mostrem el resultat
        System.out.println(caramels % nebots);

    }
}
 