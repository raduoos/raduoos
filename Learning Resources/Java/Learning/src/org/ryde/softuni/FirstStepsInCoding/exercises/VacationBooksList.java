package org.ryde.softuni.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPages = Integer.parseInt(scanner.nextLine());
        int Pages = Integer.parseInt(scanner.nextLine());
        int dayCount = Integer.parseInt(scanner.nextLine());

        int TotalTime = numPages / Pages;
        int HoursDay = TotalTime / dayCount;

        System.out.println(HoursDay);
    }
}
