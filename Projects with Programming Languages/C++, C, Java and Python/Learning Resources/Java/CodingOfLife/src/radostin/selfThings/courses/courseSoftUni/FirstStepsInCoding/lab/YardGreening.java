package radostin.selfThings.courses.courseSoftUni.FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cMeters = Double.parseDouble(scanner.nextLine());

        double price = cMeters * 7.61;
        double discount = 0.18 * price;
        double calculate = price - discount;

        System.out.printf("The final price is: %f lv.%n", calculate);
        System.out.printf("The discount is: %f lv.%n", discount);
    }
}
