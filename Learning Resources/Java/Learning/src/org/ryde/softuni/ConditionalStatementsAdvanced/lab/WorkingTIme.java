package org.ryde.softuni.ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class WorkingTIme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        String dayOfW = scanner.nextLine();

        if (time>=10 && time<=18){
            if (dayOfW.equals("Monday")){
                System.out.println("open");
            } else if (dayOfW.equals("Tuesday")) {
                System.out.println("open");
            } else if (dayOfW.equals("Wednesday")){
                System.out.println("open");
            } else if (dayOfW.equals("Thursday")) {
                System.out.println("open");
            } else if (dayOfW.equals("Friday")) {
                System.out.println("open");
            } else if (dayOfW.equals("Saturday")) {
                System.out.println("open");
            }
        } else {
            System.out.println("closed");
        }
    }
}
