package radostin.selfThings.courses.courseSoftUni.ConditionalStatements.exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        minute = minute +15;

        if (minute >= 60){
            minute = minute - 60;
            hour = hour + 1;
        }

        if (hour >= 24){
            hour = hour - 24;
        }

        System.out.printf("%d:%02d", hour, minute);
    }
}
