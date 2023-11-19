package org.raduoos.mp03.nf1.moodlePresentation;

import java.util.Scanner;

public class Conditional3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        switch(scanner.nextInt()) {
            case 1:
            case 2:
                System.out.println("You've put an 1 or 2.");
                break;
            default:
                System.out.println("You did not inputted 1 or 2");
        }
    }
}
