package radostin.selfThings.courses.courseSoftUni.WhileLoop.lab;

import java.util.Scanner;

public class Sequence2k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            int start = 1;

        while (start <= n){
            System.out.println(start);
            start = start * 2 + 1;
        }

        /*
        For loop way
        for (int i = 1; i <= n; i = i * 2 + 1) {
            System.out.println(i);
        }
         */

    }
}
