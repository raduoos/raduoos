package radostin.selfThings.courses.courseSoftUni.ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double qt = Double.parseDouble(scanner.nextLine());

        double price = 0.00;

        switch (product){
            case "coffee":
                if (city.equals("Sofia")){
                    price = 0.50;
                } else if (city.equals("Plovdiv")) {
                    price = 0.40;
                } else if (city.equals("Varna")) {
                    price = 0.45;
                }
                break;
            case "water":
                if (city.equals("Sofia")){
                    price = 0.80;
                } else if (city.equals("Plovdiv")) {
                    price = 0.70;
                } else if (city.equals("Varna")) {
                    price = 0.70;
                }
                break;
            case "beer":
                if (city.equals("Sofia")){
                    price = 1.20;
                } else if (city.equals("Plovdiv")) {
                    price = 1.15;
                } else if (city.equals("Varna")) {
                    price = 1.10;
                }
                break;
            case "sweets":
                if (city.equals("Sofia")){
                    price = 1.45;
                } else if (city.equals("Plovdiv")) {
                    price = 1.30;
                } else if (city.equals("Varna")) {
                    price = 1.35;
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")){
                    price = 1.60;
                } else if (city.equals("Plovdiv")) {
                    price = 1.50;
                } else if (city.equals("Varna")) {
                    price = 1.55;
                }
                break;
        }
        System.out.println(price*qt);
    }
}
