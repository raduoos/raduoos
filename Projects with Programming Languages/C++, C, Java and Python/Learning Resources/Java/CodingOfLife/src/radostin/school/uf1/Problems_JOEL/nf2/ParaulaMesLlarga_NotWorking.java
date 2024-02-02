package radostin.school.uf1.Problems_JOEL.nf2;

import java.util.Scanner;

public class ParaulaMesLlarga_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        while (numCases-->0){
            String phrase = scanner.skip("[\r\n]*").nextLine().trim();

            int i = 0;
            int start = 0;
            int max = -1;

            while (true){
                int j = scanner.nextLine().indexOf(" ",i);

                if (j == -1){
                    if (phrase.length()-start > max){
                        max = phrase.length() - start;
                        break;
                    }
                } else {
                    if (j-start > max){
                        max = j-start;
                        start = j+1;
                    }
                }
                i = j + 2;
                System.out.println(max);
            }
        }
    }
}
