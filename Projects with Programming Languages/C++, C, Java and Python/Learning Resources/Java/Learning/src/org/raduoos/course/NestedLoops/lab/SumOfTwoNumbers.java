package org.raduoos.course.NestedLoops.lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int start = Integer.parseInt(scanner.nextLine());
            int end = Integer.parseInt(scanner.nextLine());
            int magic = Integer.parseInt(scanner.nextLine());
            int count = 0;

        for (int x1 = start; x1 <= end; x1++) {
            for (int x2 = start; x2 <= end; x2++) {
                count++;
                int sum = x1 + x2;

                if (sum == magic){
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, x1, x2, magic);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", count, magic);
    }
}
