package radostin.selfThings.courses.courseSoftUni.WhileLoop.lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int num1 = Integer.parseInt(scanner.nextLine());
            int sum = 0;

            while (sum < num1){
                int num = Integer.parseInt(scanner.nextLine());
                sum += num;
            }
        System.out.println(sum);
    }
}
