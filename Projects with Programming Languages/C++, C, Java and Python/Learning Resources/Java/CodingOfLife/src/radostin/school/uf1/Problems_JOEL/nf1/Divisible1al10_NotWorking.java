package radostin.school.uf1.Problems_JOEL.nf1;

import java.util.Scanner;

public class Divisible1al10_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        String result = "NO";

        if (N % 2 == 0 && sumOfDigits(N) % 3 == 0 && N % 4 == 0 && N % 5 == 0 && N % 7 == 0 && sumOfDigits(N) % 9 == 0) {
            result = "YES";
        }

        System.out.println(result);

        scanner.close();
    }

    // Function to calculate the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
