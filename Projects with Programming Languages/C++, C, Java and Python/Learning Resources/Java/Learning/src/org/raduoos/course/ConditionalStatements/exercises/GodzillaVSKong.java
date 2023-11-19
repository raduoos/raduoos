package org.raduoos.course.ConditionalStatements.exercises;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetFilm = Double.parseDouble(scanner.nextLine());
        int numPeople = Integer.parseInt(scanner.nextLine());
        double outfit = Double.parseDouble(scanner.nextLine());

        double sumDecor = (budgetFilm * 10) / 100.0;
        double sumOutfit = numPeople * outfit;

        if (numPeople > 150){
            sumOutfit = sumOutfit - ((sumOutfit * 10)/100);
        }

        double result = sumDecor + sumOutfit;

        if (budgetFilm >= result){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budgetFilm - result);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", result - budgetFilm);
        }
    }
}
