package radostin.selfThings.courses.courseSoftUni.WhileLoop.lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;

        while (!string.equals("Stop")){
            int num = Integer.parseInt(string);
            if (num < minNum){
                minNum = num;
            }
            string = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}
