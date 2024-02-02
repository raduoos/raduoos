package radostin.school.uf1.Problems_JOEL.nf1;

import java.util.Scanner;

public class AviMesGranII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the first grandparent: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter the age of the first grandparent: ");
        int age1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the name of the second grandparent: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter the age of the second grandparent: ");
        int age2 = scanner.nextInt();

        if (age1 > age2) {
            System.out.println(name1 + " is the oldest grandparent.");
        } else if (age2 > age1) {
            System.out.println(name2 + " is the oldest grandparent.");
        } else {
            System.out.println("They are the same age.");
        }

        scanner.close();
    }
}
