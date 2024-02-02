package radostin.selfThings.courses.courseSoftUni.NestedLoops.exercise;

import java.util.Scanner;

public class NumberPyramidII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;

        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= row; i++) {
                if (num > n){
                    break;
                }

                System.out.print(num + " ");
                ++num;
            }
            System.out.println();
        }
    }
}
