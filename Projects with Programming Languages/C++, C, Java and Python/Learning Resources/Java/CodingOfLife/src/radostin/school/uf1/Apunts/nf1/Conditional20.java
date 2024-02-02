package radostin.school.uf1.Apunts.nf1;

import java.util.Scanner;

public class Conditional20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Also working method > int i = scanner.nextInt();

        switch(scanner.nextInt()) {
            case 0:
                System.out.println("i es cero.");
                break;
            case 1:
                System.out.println("i es uno.");
                break;
            case 2:
                System.out.println("i es dos.");
                break;
            case 3:
                System.out.println("i es tres.");
                break;
            default:
                System.out.println("i es mayor a tres.");
        }
    }
}
