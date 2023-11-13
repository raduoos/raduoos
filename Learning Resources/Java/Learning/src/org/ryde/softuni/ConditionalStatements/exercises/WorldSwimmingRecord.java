package org.ryde.softuni.ConditionalStatements.exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double RecordInSeconds = Double.parseDouble(scanner.nextLine());
        double Meters = Double.parseDouble(scanner.nextLine());
        double TimeInSeconds = Double.parseDouble(scanner.nextLine());

        double delay = Math.floor(Meters / 15) * 12.5;
        double finalTime = (TimeInSeconds * Meters) + delay;

        if (RecordInSeconds > finalTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", finalTime - RecordInSeconds);
        }

    }
}
