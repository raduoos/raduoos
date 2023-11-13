package org.raduoos.course.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Nylon = Integer.parseInt(scanner.nextLine());
        int Paint = Integer.parseInt(scanner.nextLine());
        int Razreditel = Integer.parseInt(scanner.nextLine());
        int Hours = Integer.parseInt(scanner.nextLine());

        double NylonSum = (Nylon+2) * 1.50;
        double PaintSum = (Paint + (Paint * 10 / 100.0)) * 14.50;
        double RazreditelSum = Razreditel * 5;

        double TotalSumForMaterials = NylonSum + PaintSum + RazreditelSum + 0.40;
        double SumMaistori = Hours * (TotalSumForMaterials * 30 / 100);
        double TotalSum = TotalSumForMaterials + SumMaistori;

        System.out.println(TotalSum);
    }
}
