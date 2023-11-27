package org.raduoos.course.ForLoop.lab;

import java.util.Scanner;

public class NumSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTimes = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 1; i <= numTimes; i++) {
            int numInput = Integer.parseInt(scanner.nextLine());

            if (numInput > maxNum){
                maxNum = numInput;
            }

            if (numInput < minNum) {
                minNum = numInput;
            }
        }
        System.out.println("Max number: " + maxNum);
        System.out.println("Min number: " + minNum);

    }
}
