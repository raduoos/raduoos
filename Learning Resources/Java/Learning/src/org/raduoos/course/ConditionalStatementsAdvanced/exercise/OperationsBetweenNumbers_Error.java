package org.raduoos.course.ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers_Error {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String Operator = scanner.nextLine();

        if (N2 == 0 && (Operator.equals("/") || Operator.equals("%"))){
            System.out.printf("Cannot divide %s by zero", N1);
            return;
        }
        double result = 0;

        if (Operator.equals("+")){
            result = N1 + N2;
        } else if (Operator.equals("-")) {
            result = N1 - N2;
        } else if (Operator.equals("*")) {
            result = N1 * N2;
        } else if (Operator.equals("/")) {
            result = N1 * 1.0 / N2;
        } else if (Operator.equals("%")) {
            result = N1 % N2;
        }

        if (Operator.equals("+") || Operator.equals("-") || Operator.equals("*")){
            String evenOrOdd = "";
            if (result % 2 == 0){
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", N1, Operator, N2, result, evenOrOdd);
        } else if (Operator.equals("/")) {
            System.out.printf("%d / %d = %.2f", N1, N2, result);
        } else if (Operator.equals("%")) {
            System.out.printf("%d %% %d = %.0f", N1, N2, result);
        }

        System.out.println(result);
    }
}
