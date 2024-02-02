package radostin.selfThings.courses.courseSoftUni.ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class OperationsBetweenNumbersII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        char operator = sc.nextLine().charAt(0);
        double result;
        String evenOdd;

        switch (operator) {
            case '+':
                result = n1 + n2;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %c %d = %d - %s",n1 ,operator,n2,(int) result,evenOdd);
                break;
            case '-':
                result = n1 - n2;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %c %d = %d - %s",n1 ,operator,n2,(int) result,evenOdd);
                break;
            case '*':
                result = n1 * n2;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d %c %d = %d - %s",n1 ,operator,n2,(int) result,evenOdd);
                break;
            case '/':
                if (n2 != 0) {
                    result = (double) n1 / n2;
                    System.out.printf("%d %c %d = %.2f",n1 , operator, n2, result);
                } else {
                    System.out.printf("Cannot divide %d by zero",n1);
                }
                break;
            case '%':
                if (n2 != 0) {
                    result = n1 % n2;
                    System.out.printf("%d %c %d = %d", n1, operator, n2, (int) result);
                } else {
                    System.out.printf("Cannot divide %d by zero", n1);
                }
                break;
        }
    }
}
