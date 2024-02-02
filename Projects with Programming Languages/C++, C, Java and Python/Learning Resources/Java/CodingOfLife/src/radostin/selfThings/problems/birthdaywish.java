package radostin.selfThings.problems;

import java.util.Scanner;

public class birthdaywish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wishes = scanner.nextInt();
        int storyViewers = scanner.nextInt();

        double percentage = (double) wishes / storyViewers * 100;
        System.out.println("Percentage of people who wished you a birthday: " + percentage + "%");

        //Current: 5
    }
}
