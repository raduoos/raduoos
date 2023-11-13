package org.ryde.softuni.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ChickenMenu = Integer.parseInt(scanner.nextLine());
        int FishMenu = Integer.parseInt(scanner.nextLine());
        int VegetarianMenu = Integer.parseInt(scanner.nextLine());

        double PriceChickenMenu = ChickenMenu * 10.35;
        double PriceFishMenu = FishMenu * 12.40;
        double PriceVegetarianMenu = VegetarianMenu * 8.15;
        double TotalPriceOfMenu = PriceChickenMenu + PriceFishMenu + PriceVegetarianMenu;
        double PriceDesert = (TotalPriceOfMenu * 0.20);
        double PriceDelivery = 2.50;
        double TotalPrice = TotalPriceOfMenu + PriceDesert + PriceDelivery;

        System.out.println(TotalPrice);
    }
}
