package org.ryde.softuni.ConditionalStatements.exercises;

import java.util.Scanner;

public class LunchBreak_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSerie = scanner.nextLine();
        int durationSerie = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double timeforRest = durationBreak - ((durationBreak / 8.0) + (durationBreak / 4.0));

        if (timeforRest >= durationSerie){
            System.out.printf("You have enough time to watch Game of Thrones and left with %.2f minutes free time.", nameSerie, timeforRest - durationBreak);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %,2f more minutes.", nameSerie, Math.ceil(durationSerie - timeforRest));
        }
    }
}
