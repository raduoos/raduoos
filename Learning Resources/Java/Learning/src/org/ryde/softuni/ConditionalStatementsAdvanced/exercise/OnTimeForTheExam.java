package org.ryde.softuni.ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minuteArrive = Integer.parseInt(scanner.nextLine());

        int timeExam = hourExam * 60 + minuteExam;
        int arrivalTime = hourArrive * 60 + minuteArrive;

        int diff = Math.abs(timeExam - arrivalTime);

        if (timeExam < arrivalTime) {
            System.out.println("Late");
            if (diff >= 60){
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (timeExam == arrivalTime || diff <= 30){
            System.out.println("On time");
            if (diff != 0){
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60){
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}
