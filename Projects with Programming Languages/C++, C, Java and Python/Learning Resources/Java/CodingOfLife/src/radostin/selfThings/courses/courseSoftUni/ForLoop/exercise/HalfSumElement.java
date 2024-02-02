package radostin.selfThings.courses.courseSoftUni.ForLoop.exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= numCases ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;

            if (number>max){
                max=number;
            }
        }

        int SumMaxNum = sum - max;

        if (max == SumMaxNum){
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            int diff = Math.abs(max - SumMaxNum);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }

    }
}
