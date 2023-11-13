package org.ryde.softuni.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPacketPen = Integer.parseInt(scanner.nextLine());
        int countPacketMarker = Integer.parseInt(scanner.nextLine());
        int PrepLiters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double PriceOfPen = countPacketPen * 5.80;
        double PriceOfMarker = countPacketMarker * 7.20;
        double PriceOfCleanBoard = PrepLiters * 1.20;

        double TotalPrice = PriceOfPen + PriceOfMarker + PriceOfCleanBoard;
        double PriceWithDiscount = TotalPrice - (TotalPrice * (discount / 100.0));

        System.out.println(PriceWithDiscount);
    }
}
