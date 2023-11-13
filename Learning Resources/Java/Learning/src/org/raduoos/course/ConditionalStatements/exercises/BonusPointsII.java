package org.raduoos.course.ConditionalStatements.exercises;

import java.util.Scanner;

public class BonusPointsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double points = 0;

        if (num<=100){
            points = 5;
        } else if (num<1000) {
            points = (num * 20) / 100.0;
        } else {
            points = (num * 10) / 100.0;
        }

        if (num % 2 == 0){
            points = points + 1;
        }

        if (num % 10 == 5){
            points = points + 2;
        }

        System.out.println(points);
        System.out.println(num + points);

    }
}
