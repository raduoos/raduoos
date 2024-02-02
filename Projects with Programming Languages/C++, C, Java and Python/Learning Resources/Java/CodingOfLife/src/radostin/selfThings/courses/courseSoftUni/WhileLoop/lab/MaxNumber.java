package radostin.selfThings.courses.courseSoftUni.WhileLoop.lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            int maxNum = Integer.MIN_VALUE;

            while (!string.equals("Stop")){
                int num = Integer.parseInt(string);
                    if (num > maxNum){
                        maxNum = num;
                    }
                string = scanner.nextLine();
            }
        System.out.println(maxNum);
    }
}
