package radostin.selfThings.courses.courseSoftUni.ConditionalStatements.exercises;

import java.util.Scanner;

public class LunchBreak_HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSerie = scanner.nextLine();
        int durationSerie = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double timeforEat = durationBreak / 8.00;
        double timeforRest = durationBreak / 4.00;

        double freetime = durationBreak - timeforEat - timeforRest;

        if (freetime >= durationSerie){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSerie, Math.ceil(freetime - durationSerie));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameSerie, Math.ceil(durationSerie - freetime));
        }
    }
}
