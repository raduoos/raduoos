package org.ryde.softuni.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class Aquarim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int LongCm = Integer.parseInt(scanner.nextLine());
        int WideCm = Integer.parseInt(scanner.nextLine());
        int HighCm = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double WeightAquarium = LongCm * WideCm * HighCm;
        double Liters = WeightAquarium / 1000;

        double neededLiters = Liters - (Liters * percent / 100);
        System.out.println(neededLiters);

    }
}
