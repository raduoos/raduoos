package radostin.selfThings.courses.courseSoftUni.ConditionalStatements.lab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String CorrectPassword = "s3cr3t!P@ssw0rd";
        String InputPassword = scanner.nextLine();

        if (InputPassword.equals(CorrectPassword)){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
