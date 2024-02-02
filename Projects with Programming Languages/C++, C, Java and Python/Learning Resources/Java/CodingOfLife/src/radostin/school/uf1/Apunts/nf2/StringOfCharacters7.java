package radostin.school.uf1.Apunts.nf2;

import java.util.Scanner;

public class StringOfCharacters7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce one string of characters: ");
        String answer = scanner.nextLine();

        for (int i = 0; i < answer.length(); i++) {
            System.out.printf("\n%d character %c", i, answer.charAt(i));
        }
    }
}
