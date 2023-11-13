package org.ryde.softuni.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class USDtoBGNI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}
