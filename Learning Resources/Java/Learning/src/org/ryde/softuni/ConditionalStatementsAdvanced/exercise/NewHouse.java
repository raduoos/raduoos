package org.ryde.softuni.ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.00;


        switch (flowers) {
            case "Roses":
                totalPrice = countFlowers * 5.00;
                if (countFlowers>80){
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;
            case "Dahlias":
                totalPrice = countFlowers * 3.80;
                if (countFlowers>90){
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = countFlowers * 2.80;
                if (countFlowers>80){
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = countFlowers * 3.00;
                if (countFlowers<120){
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = countFlowers * 2.50;
                if (countFlowers<80){
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }
                break;
        }

        if (budget>=totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowers, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}
