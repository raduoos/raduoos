package radostin.school.uf1.Problems_JOEL.nf2;

import java.util.Scanner;

public class ParaulaMesLlarga2_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        while (numCases-->0){
            String phrase = scanner.skip("[\r\n]*").nextLine().trim();

            int i = 0;
            int start = 0;
            int max = -1;

            for (int j = 0; j < phrase.length(); j++) {
                if (phrase.charAt(i) == ' ' || i + 1 == phrase.length()){
                    if (i+1 == phrase.length()){
                        start++;
                    }

                    if (start > max){
                        max = start;
                    }
                    start = 0;
                } else {
                    start++;
                }

                System.out.println(max);

            }
        }
    }
}
