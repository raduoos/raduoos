package radostin.school.uf1.Problems_JOEL.nf2;

import java.text.Normalizer;
import java.util.Scanner;

public class Abba_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.skip("[\r\n]*").nextInt();

        while (numCases-->0){
            String[] names = scanner.skip("[\r\n]*").nextLine().split(", ");

            for (int i = 0; i < names.length-1; i++) {
                String s = names[i].toUpperCase();
                s = Normalizer.normalize(s, Normalizer.Form.NFD);
                s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                System.out.print(s.charAt(0));
            }

            names = names[names.length-1].split(" i");

            switch (names.length){
                case 2:
                    for (int i = 0; i < names.length; i++) {
                        String s = names[i].toUpperCase();
                        s = Normalizer.normalize(s, Normalizer.Form.NFD);
                        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                        System.out.print(s.charAt(0));
                    }
                    break;
                case 3:
                    for (int i = 0; i < names.length; i++) {
                        if (i==1){
                            continue;
                        }
                        String s = names[i].toUpperCase();
                        s = Normalizer.normalize(s, Normalizer.Form.NFD);
                        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                        System.out.print(s.charAt(0));
                    }
                    break;
            }
        }

    }
}
