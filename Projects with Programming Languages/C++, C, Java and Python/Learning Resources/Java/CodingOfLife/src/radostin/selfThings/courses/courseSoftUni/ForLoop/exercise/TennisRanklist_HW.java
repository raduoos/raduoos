package radostin.selfThings.courses.courseSoftUni.ForLoop.exercise;

import java.util.Scanner;

public class TennisRanklist_HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEvents = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        String etap = scanner.nextLine();

        for (int iEvent = 1; iEvent < countEvents; iEvent++) {
            String etapp = scanner.nextLine();

            switch (etapp){
                case "W":
                    break;
                case "F":
                    break;
            }
        }
    }
}
