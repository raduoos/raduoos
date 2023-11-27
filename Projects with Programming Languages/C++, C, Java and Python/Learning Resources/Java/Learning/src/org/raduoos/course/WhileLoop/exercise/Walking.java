package org.raduoos.course.WhileLoop.exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepsGoal = 10000;


        while (stepsGoal > 0){
            String string = scanner.nextLine();
            if ("Going home".equals(string)){
                int currentStep = Integer.parseInt(scanner.nextLine());
                stepsGoal -= currentStep;
                break;
            }

            int currentSteps = Integer.parseInt(string);
            stepsGoal -= currentSteps;
        }

        if (stepsGoal <= 0){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", Math.abs(stepsGoal));
        } else {
            System.out.printf("%d more steps to reach goal.", stepsGoal);
        }
    }
}
