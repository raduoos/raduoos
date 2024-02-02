package radostin.selfThings.courses.courseSoftUni.ConditionalStatements.exercises;

import java.util.Scanner;

public class Shopping_HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Budget
        double budget = Double.parseDouble(scanner.nextLine());

        //Counting items
        int CountVideoCards = Integer.parseInt(scanner.nextLine());
        int CountProcessors = Integer.parseInt(scanner.nextLine());
        int CountRAM = Integer.parseInt(scanner.nextLine());

        //Pricing items
        double priceVideoCards = 250 * CountVideoCards;
        double priceProcessors = CountProcessors * (priceVideoCards * 0.35);
        double priceRAM = CountRAM * (priceVideoCards * 0.10);

        //TotalPrice
        double finalPrice = priceVideoCards + priceProcessors + priceRAM;

        //Making discount at the final price with 15%
        if (CountVideoCards > CountProcessors){
            finalPrice = finalPrice - (finalPrice * 0.15);
        }

        //Print the final result
        if (budget >= finalPrice){
            System.out.printf("You have %.2f leva left!", budget - finalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", finalPrice - budget);
        }
    }
}
