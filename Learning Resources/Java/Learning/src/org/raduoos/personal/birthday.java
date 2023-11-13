package org.raduoos.personal;

import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the story viewers count > ");
        int storyViewers = scanner.nextInt();
        System.out.print("Type the wishes count > ");
        int wishes = scanner.nextInt();

        double result = (double) wishes / storyViewers * 100;
        System.out.println("The percentage is " + result + "%");
    }
}
