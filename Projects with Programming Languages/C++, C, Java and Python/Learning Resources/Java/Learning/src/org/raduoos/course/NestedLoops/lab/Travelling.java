package org.raduoos.course.NestedLoops.lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double savedMoney = Double.parseDouble(scanner.nextLine());

            while (savedMoney < neededMoney){
                double sum = Double.parseDouble(scanner.nextLine());
                savedMoney += sum;
            }

            System.out.println("Going to " + destination + "!");

            destination = scanner.nextLine();

        }
    }
}
