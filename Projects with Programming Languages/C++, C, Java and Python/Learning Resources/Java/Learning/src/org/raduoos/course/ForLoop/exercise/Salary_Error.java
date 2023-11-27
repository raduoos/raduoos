package org.raduoos.course.ForLoop.exercise;

import java.util.Scanner;

public class Salary_Error {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int browserTab = 1; browserTab < tabs; browserTab++) {
            String socialMedia = scanner.nextLine();

            switch (socialMedia){
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

            if (salary <= 0){
                break;
            }
        }
        if (salary <= 0){
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
