package radostin.school.uf1.Problems_JOEL.nf2;

import java.util.Scanner;

public class BolasLobasII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        while (numCases-- > 0) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            boolean found = false;


            for (int i = 0; !found && i < s1.length(); i++) {
                for (int j = 0; !found && j < s2.length(); j++) {
                    if ( i!=j && s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i)) {
                        System.out.println(i + " " + j);
                        found=true;
                    }
                }
            }
        }
    }
}
