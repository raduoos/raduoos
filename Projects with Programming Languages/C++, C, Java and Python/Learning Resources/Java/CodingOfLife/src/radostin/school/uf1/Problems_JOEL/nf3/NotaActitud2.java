package radostin.school.uf1.Problems_JOEL.nf3;


import java.util.Scanner;

public class NotaActitud2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-->0){
            //Tractament de cada cas
            int numNotes = scanner.nextInt();
            int [] before = new int[numNotes];
            int [] next = new int[numNotes];
            int [] diferencies = new int[numNotes];


            //Llegim les nostes abans d'actitud
            for (int i = 0; i < before.length; i++){
                before[i] = scanner.nextInt();
            }

            //Llegim les notes despres d'actitud
            for (int i = 0; i < next.length; i++){
                next[i] = scanner.nextInt();
            }


            //Calculem les diferencies entre les notes
            for (int i = 0; i < diferencies.length; i++) {
                diferencies[i]=next[i]-before[i];
            }

            //Anem a calcular la nota maxima i comptar quants alumnes la tenen
            int max = diferencies[0];
            for (int i = 0; i < diferencies.length; i++) {
                if (diferencies[i]>max){
                    max = diferencies[i];
                }
            }

            //Comptem quants alumnes tenen la nota maxima
            int counter = 0;
            for (int i = 0; i < diferencies.length; i++) {
                if(diferencies[i]==max){
                    counter++;
                }
            }

            //Mostrem resultat
            System.out.printf("%d %d%n", max, counter);
        }
    }
}


