package radostin.school.uf1.Problems_JOEL.nf1;

import java.util.Scanner;

public class AviMesGranIII {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        String nom1, nom2;
        int edat1, edat2;

        nom1 = ent.skip("[\r\n]*").nextLine();
        edat1 = ent.skip("[\r\n]*").nextInt();
        nom2 = ent.skip("[\r\n]*").nextLine();
        edat2 = ent.skip("[\r\n]*").nextInt();

        if (edat1>edat2){
            System.out.println(nom1);
        } else if (edat1 < edat2) {
            System.out.println(nom2);
        } else {
            System.out.println("Tenen la mateixa edat");
        }

    }
}
