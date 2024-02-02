package radostin.school.uf1.Problems_JOEL.nf2;

import java.util.Scanner;

public class CrecQueNoMhanPosseit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.skip("[\r\n]*").nextInt();

        while (numCases --> 0){
            int jumps = scanner.skip("[\r\n]*").nextInt();
            String phrase = scanner.skip("[\r\n]*").nextLine();
            String exported = "", rest = "";

            for (int i = 0; i < phrase.length(); i++) {
                if ((i+1) % (jumps+1) == 0){
                    exported += phrase.charAt(i);
                } else {
                    rest += phrase.charAt(i);
                }
            }
            System.out.printf("%s%n%s", exported, rest);
        }
    }
}
