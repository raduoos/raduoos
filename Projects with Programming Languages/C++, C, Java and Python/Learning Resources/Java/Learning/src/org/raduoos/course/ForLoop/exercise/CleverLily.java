package org.raduoos.course.ForLoop.exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int iAge = 1; iAge <= age ; iAge++) {
            if (iAge % 2 == 0){
                sum += (((double) iAge / 2) * 10) - 1;

            } else {
                sum += priceToy;
            }
        }

        double diff = Math.abs(sum - priceWashingMachine);

        if (sum >= priceWashingMachine){
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }

    }
}
