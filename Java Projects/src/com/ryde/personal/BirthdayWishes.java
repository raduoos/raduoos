package com.ryde.personal;

import java.util.Scanner;

public class BirthdayWishes {
    public static void main(String[] args) {
        // Radu, an IT Student,
        // has been struggling to gain traction on his Instagram.
        // Despite his creative and engaging content, he consistently receives very few views and interactions.
        // This has led many to speculate that Radu has no friends in Spain.
        // Radu has almost no followers.

        // In a recent attempt to boost his online presence, Radu posted a story celebrating his birthday.
        // Out of the 31 people who viewed his story, only 6 wished him a happy birthday.
        // This dismal turnout further fueled the notion that Radu has no friends in Spain.

        // Write a Java program, that will calculate the percentage of people who wished him.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the story viewers count > ");
        int storyViewers = Integer.parseInt(scanner.nextLine());
        System.out.print("Type the wishes he received > ");
        int wishes = Integer.parseInt(scanner.nextLine());

        double result = (double) wishes / storyViewers * 100;
        System.out.printf("%.2f", result);
    }
}
