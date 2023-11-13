package org.ryde.softuni.ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class Comissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        double result;

        switch (city){
            case "Sofia":
                if (0 <= sells && sells <= 500){
                    result = sells * 0.05;
                    System.out.printf("%.2f", result);
                } else if (500 < sells && sells <= 1000) {
                    result = sells * 0.07;
                    System.out.printf("%.2f", result);
                } else if (1000 < sells && sells <= 10000) {
                    result = sells * 0.08;
                    System.out.printf("%.2f", result);
                } else if (sells > 1000) {
                    result = sells * 0.12;
                    System.out.printf("%.2f", result);
                }
                break;
            case "Varna":
                if (0 <= sells && sells <= 500){
                    result = sells * 0.045;
                    System.out.printf("%.2f", result);
                } else if (500 < sells && sells <= 1000) {
                    result = sells * 0.075;
                    System.out.printf("%.2f", result);
                } else if (1000 < sells && sells <= 10000) {
                    result = sells * 0.10;
                    System.out.printf("%.2f", result);
                } else if (sells > 1000) {
                    result = sells * 0.13;
                    System.out.printf("%.2f", result);
                }
                break;
            case "Plovdiv":
                if (0 <= sells && sells <= 500){
                    result = sells * 0.055;
                    System.out.printf("%.2f", result);
                } else if (500 < sells && sells <= 1000) {
                    result = sells * 0.08;
                    System.out.printf("%.2f", result);
                } else if (1000 < sells && sells <= 10000) {
                    result = sells * 0.12;
                    System.out.printf("%.2f", result);
                } else if (sells > 1000) {
                    result = sells * 0.145;
                    System.out.printf("%.2f", result);
                } else if (sells < 0) {
                    System.out.println("error");
                }
                break;
            default:
                if (!city.equals("Sofia") && !city.equals("Varna") && !city.equals("Plovdiv")){
                    System.out.println("error");
                } else if (sells<0 && sells>10000) {
                    System.out.println("error");
                }
        }
    }
}
