package org.raduoos.course.ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        if (degrees<=18){
            if (time.equals("Morning")){
                System.out.println("It's " + degrees + " degrees, get your Sweatshirt and Sneakers.");
            } else if (time.equals("Afternoon")) {
                System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
            } else if (time.equals("Evening")) {
                System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
            }
        } else if (degrees<=24) {
            if (time.equals("Morning")){
                System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
            } else if (time.equals("Afternoon")) {
                System.out.println("It's " + degrees + " degrees, get your T-Shirt and Sandals.");
            } else if (time.equals("Evening")) {
                System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
            }
        } else if (degrees>=25) {
            if (time.equals("Morning")){
                System.out.println("It's " + degrees + " degrees, get your T-Shirt and Sandals.");
            } else if (time.equals("Afternoon")) {
                System.out.println("It's " + degrees + " degrees, get your Swim Suit and Barefoot.");
            } else if (time.equals("Evening")) {
                System.out.println("It's " + degrees + " degrees, get your Shirt and Moccasins.");
            }
        }
    }
}
