package radostin.selfThings.experiments.problems;

import java.util.Scanner;

public class Factorial {

    // Let's make factorial function

    public static int factorial(int n) {
        return n <= 0 ? 0 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Invalid input: Please enter a valid integer");
        }

        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}

