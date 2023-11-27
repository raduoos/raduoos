package org.raduoos.course.WhileLoop.exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int FreeSpace = width * length * height;

        int CurrentSpace = 0;

        String string = scanner.nextLine();
        while (!"Done".equals(string)){
            int numBoxes = Integer.parseInt(string);
            CurrentSpace += numBoxes;

            if (CurrentSpace >= FreeSpace ){
                break;
            }

            string = scanner.nextLine();
        }

        if (CurrentSpace >= FreeSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.", CurrentSpace - FreeSpace);
        } else {
            System.out.printf("%d Cubic meters left.", FreeSpace - CurrentSpace);
        }
    }
}
