package org.ryde.softuni.FirstStepsInCoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int CountDogFood = Integer.parseInt(scanner.nextLine());
        int CountCatFood = Integer.parseInt(scanner.nextLine());

        double CostDogFood = CountDogFood * 2.50;
        double CostCatFood = CountCatFood * 4.00;

        double result = CostCatFood + CostDogFood;
        System.out.println(result + " lv");
    }
}
