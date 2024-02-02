package radostin.selfThings.courses.courseSoftUni.ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFishers = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0.00;

        switch (season){
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }

        if (countFishers<=6){
            boatPrice = boatPrice - (boatPrice * 0.10);
        } else if (countFishers>=7 && countFishers<=11) {
            boatPrice = boatPrice - (boatPrice * 0.15);
        } else {
            boatPrice = boatPrice - (boatPrice * 0.25);
        }

        if (countFishers % 2 == 0 && !season.equals("Autumn")){
            boatPrice = boatPrice - (boatPrice * 0.05);
        }

        if (budget>=boatPrice){
            System.out.printf("Yes! You have %.2f leva left.", budget - boatPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budget);
        }
    }
}
