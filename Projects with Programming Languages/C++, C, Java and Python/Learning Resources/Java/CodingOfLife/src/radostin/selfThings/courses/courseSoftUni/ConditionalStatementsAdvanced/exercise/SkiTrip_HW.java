package radostin.selfThings.courses.courseSoftUni.ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class SkiTrip_HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stayingDays = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String mark = scanner.nextLine();

        int nightPrice = stayingDays - 1;
        double finalPrice = 0;

        switch (roomType){
            case "room for one person":
                finalPrice = nightPrice * 18.00;
                break;
            case "apartment":
                finalPrice = finalPrice * 25.00;
                break;
            case "president apartment":
                finalPrice = finalPrice * 35.00;
                break;
        }


    }
}
