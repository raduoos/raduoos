package radostin.school.uf1.Apunts.nf1;

import java.util.Scanner;

public class Conditional22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        switch(scanner.nextInt()) {
            case 1:
            case 2:
                System.out.println("You've put an 1 or 2.");
                break;
            default:
                System.out.println("You did not inputted 1 or 2");
        }
    }
}
