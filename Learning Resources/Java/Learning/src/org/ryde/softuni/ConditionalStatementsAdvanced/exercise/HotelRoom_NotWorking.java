package org.ryde.softuni.ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class HotelRoom_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceApartment = 0.0;
        double priceStudio = 0.0;

        switch (month){
            case "May":
                priceApartment = 65.00 * countNights;
                priceStudio = 50.00 * countNights;
                if (countNights>7){
                    priceStudio = priceStudio - (priceStudio * 0.05);
                }
                if (countNights>14) {
                    priceStudio = priceStudio - (priceStudio * 0.30);
                }
                break;
            case "June":
                priceApartment = 68.70 * countNights;
                priceStudio = 75.20 * countNights;
                if (countNights > 14){
                    priceStudio = priceStudio - (priceStudio * 0.20);
                }
                break;
            case "July":
                priceApartment = 77.00 * countNights;
                priceStudio = 76.00 * countNights;
                if (countNights > 14){
                    priceStudio = priceStudio - (priceStudio * 0.20);
                }
                break;
            case "August":
                priceApartment = 77.00 * countNights;
                priceStudio = 76.00 * countNights;
                if (countNights > 14){
                    priceStudio = priceStudio - (priceStudio * 0.20);
                }
                break;
            case "September":
                break;
            case "October":
                priceApartment = 65.0;
                priceStudio = 50.0;
                if (countNights>7){
                    priceStudio = priceStudio - (priceStudio * 0.05);
                }
                break;
            default:
                if (countNights>14){
                    priceApartment = priceApartment - (priceApartment * 0.10);
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.", priceApartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", priceStudio);

    }
}
