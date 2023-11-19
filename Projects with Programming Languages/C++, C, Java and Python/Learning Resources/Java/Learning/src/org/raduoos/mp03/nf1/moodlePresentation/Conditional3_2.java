package org.raduoos.mp03.nf1.moodlePresentation;

import java.util.Scanner;

public class Conditional3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        switch(scanner.nextInt()) {
            case 0:
                System.out.println("You've put an 0.");
                break;
            case 1:
                System.out.println("You've put an 1.");
                break;
            case 2:
                System.out.println("You've put an 2.");
                break;
            case 3:
                System.out.println("You've put an 3");
                break;
        }
    }
}
