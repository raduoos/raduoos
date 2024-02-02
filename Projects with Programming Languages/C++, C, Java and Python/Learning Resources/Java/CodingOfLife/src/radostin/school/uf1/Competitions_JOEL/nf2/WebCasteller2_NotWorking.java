package radostin.school.uf1.Competitions_JOEL.nf2;

import java.util.Scanner;

public class WebCasteller2_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        while (numCases-->0){
            String word1 = scanner.nextLine();
            String word2 = scanner.nextLine();

            int longest = word1.length() >= word2.length() ? word1.length() : word2.length();
            int countLoop = 0;

            for (int i = 0; i < word1.length() && i < word2.length() && countLoop < longest/2; i++) {
                if (word1.charAt(i) == word2.charAt(i)){
                    countLoop++;
                }
            }

            if (countLoop>=(longest + 1)/2){
                System.out.println("GRACIES WEBCASTELLER");
            } else {
                System.out.println("WEBCASTELLER ESTA TRAVIESO HOY");
            }
        }
    }
}
