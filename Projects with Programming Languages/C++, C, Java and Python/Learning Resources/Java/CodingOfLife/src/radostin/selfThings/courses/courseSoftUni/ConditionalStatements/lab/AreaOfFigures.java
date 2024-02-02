package radostin.selfThings.courses.courseSoftUni.ConditionalStatements.lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            double resultSide = side * side;
            System.out.printf("%.3f", resultSide);
        } else if (figure.equals("rectangle")) {
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            double result = side1 * side2;
            System.out.printf("%.3f", result);
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double radiusResult = Math.PI * radius * radius;
            System.out.printf("%.3f", radiusResult);
        } else if (figure.equals("triangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double result = (length * height)/2;
            System.out.printf("%.3f", result);
        }
    }
}
