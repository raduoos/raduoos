package org.raduoos.course.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double DepositedSum = Double.parseDouble(scanner.nextLine());
        int DepositDate = Integer.parseInt(scanner.nextLine());
        double YearTaxPercent = Double.parseDouble(scanner.nextLine());

        double sum = DepositedSum + DepositDate * ((DepositedSum * YearTaxPercent/100) /12);
        System.out.println(sum);
    }
}
