package org.ryde.softuni.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int YearTax  = Integer.parseInt(scanner.nextLine());

        double PriceOfShoes = YearTax - (YearTax * 40/100.0);
        double PriceUniform = PriceOfShoes - (PriceOfShoes * 20/100);
        double PriceBall = PriceUniform / 4;
        double PriceAccessories = PriceBall / 5;

        double TotalPrice = YearTax + PriceOfShoes + PriceUniform + PriceBall + PriceAccessories;

        System.out.println(TotalPrice);
    }
}
