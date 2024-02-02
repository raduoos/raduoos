package radostin.selfThings.courses.courseSoftUni.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class USDtoBGNII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine()) * 1.79549;
        System.out.println(usd);
    }
}
