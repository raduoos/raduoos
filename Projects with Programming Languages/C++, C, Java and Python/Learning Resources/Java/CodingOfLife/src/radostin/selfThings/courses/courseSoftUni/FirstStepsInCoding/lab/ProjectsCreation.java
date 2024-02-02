package radostin.selfThings.courses.courseSoftUni.FirstStepsInCoding.lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namePerson = scanner.nextLine();
        int numProjects = Integer.parseInt(scanner.nextLine());
        int time = numProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", namePerson, time, numProjects);
    }
}
