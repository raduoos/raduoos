package radostin.school.uf1.Apunts.nf1;

import java.util.Scanner;

public class Conditional23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next().charAt(0)){
            case 'a':
            case 'b':
                System.out.println("You introduced a or b");
                break;
            default:
                System.out.println("You did not introduced a or b");
        }
    }
}
