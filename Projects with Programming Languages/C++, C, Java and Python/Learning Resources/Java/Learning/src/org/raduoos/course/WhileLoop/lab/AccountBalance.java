package org.raduoos.course.WhileLoop.lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double totalMoney = 0;
            String string = scanner.nextLine();

            while (!string.equals("NoMoreMoney")){
                double sum = Double.parseDouble(string);
                    if (sum < 0){
                        System.out.println("Invalid operation!");
                        break;
                    }
                totalMoney += sum;
                System.out.printf("Increase: %.2f%n", sum);

                string = scanner.nextLine();

            }
            System.out.printf("Total: %.2f", totalMoney);
    }
}
