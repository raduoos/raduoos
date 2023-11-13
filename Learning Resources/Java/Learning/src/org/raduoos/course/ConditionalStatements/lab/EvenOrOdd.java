package org.raduoos.course.ConditionalStatements.lab;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        // Важно!!! Ако разделим модулно едно число на 2 и не получа остатък -> четно.
        if (num % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
