package org.raduoos.mp03.nf1.moodlePresentation;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Your number is " + num + ".");
    }
}
