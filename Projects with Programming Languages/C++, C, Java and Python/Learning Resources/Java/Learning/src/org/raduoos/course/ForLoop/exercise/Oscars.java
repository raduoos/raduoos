package org.raduoos.course.ForLoop.exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double academicPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String nName = scanner.nextLine();
            double nPoints = Double.parseDouble(scanner.nextLine());
            nPoints = (nName.length() * nPoints) / 2;
            academicPoints += nPoints;

            if (academicPoints >= 1250.5){
                break;
            }
        }
        if (academicPoints >= 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, academicPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - academicPoints);
        }
    }
}
