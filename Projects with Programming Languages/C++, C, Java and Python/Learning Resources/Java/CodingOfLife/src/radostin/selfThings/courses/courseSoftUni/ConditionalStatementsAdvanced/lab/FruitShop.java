package radostin.selfThings.courses.courseSoftUni.ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double qt = Double.parseDouble(scanner.nextLine());
        
        double price = 0.00;

        boolean b = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday");

        switch (fruit){
            case "banana":
                if (b){
                    price = 2.50;
                    System.out.printf("%.2f", price*qt);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 2.70;
                    System.out.printf("%.2f", price*qt);
                }
                break;
            case "apple":
                if (b){
                    price = 1.20;
                    System.out.printf("%.2f", price*qt);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 1.25;
                    System.out.printf("%.2f", price*qt);
                }
                break;
            case "orange":
                if (b){
                    price = 0.85;
                    System.out.printf("%.2f", price*qt);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 0.90;
                    System.out.printf("%.2f", price*qt);
                }
                break;
            case "grapefruit":
                if (b){
                    price = 1.45;
                    System.out.printf("%.2f", price*qt);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 1.60;
                    System.out.printf("%.2f", price*qt);
                }
                break;
            case "kiwi":
                if (b){
                    price = 2.70;
                    System.out.printf("%.2f", price*qt);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 3.00;
                    System.out.printf("%.2f", price*qt);
                }
                break;
            case "pineapple":
                if (b){
                    price = 5.50;
                    System.out.printf("%.2f", price*qt);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 5.60;
                    System.out.printf("%.2f", price*qt);
                }
                break;
            case "grapes":
                if (b){
                    price = 3.85;
                    System.out.printf("%.2f", price*qt);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 4.20;
                    System.out.printf("%.2f", price*qt);
                }
                break;
            default:
                if (!b){
                    System.out.println("error");
                }
                break;
        }
    }
}
