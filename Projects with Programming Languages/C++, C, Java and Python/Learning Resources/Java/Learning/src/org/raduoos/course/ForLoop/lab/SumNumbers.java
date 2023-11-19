package org.raduoos.course.ForLoop.lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int small = Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < small){
                small = num;
            } else if (num > big) {
                big = num;
            }
        }

        System.out.println(big + small);
    }
}
