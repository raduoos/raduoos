package radostin.selfThings.courses.courseSoftUni.ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (typeProjection){
            case "Premiere":
                price = rows * columns * 12;
                System.out.printf("%.2f leva.", price);
                break;
            case "Normal":
                price = rows * columns * 7.50;
                System.out.printf("%.2f leva.", price);
                break;
            case "Discount":
                price = rows * columns * 5;
                System.out.printf("%.2f leva.", price);
                break;
        }
    }
}
