package radostin.selfThings.courses.courseSoftUni.NestedLoops.exercise;

import java.util.Scanner;

public class CinemaTickets_NW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int standard = 0;
        int students = 0;
        int kid = 0;

        while (!"Finish".equals(input)){
            String movieName = input;
            int seats = Integer.parseInt(scanner.nextLine());
            int seatsSold = 0;

            String ticketsType = scanner.nextLine();
            while (!"End".equals(ticketsType)){
                ++seatsSold;

                switch (ticketsType){
                    case "student":
                        ++students;
                        break;
                    case "standard":
                        ++standard;
                        break;
                    case "kid":
                        ++kid;
                        break;
                }

                if (seats == seatsSold){
                    break;
                }

                ticketsType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%n full.", movieName, (double) seatsSold / seats * 100);
            input = scanner.nextLine();
        }

        int totalTickets = standard + students + kid;
        System.out.printf("Total tickets %d%n", totalTickets);
        System.out.printf("%.2f%%%n student tickets. %n", (double) students / totalTickets * 100);
        System.out.printf("%.2f%%%n standard tickets. %n", (double) standard / totalTickets * 100);
        System.out.printf("%.2f%%%n kids tickets. %n", (double) standard / totalTickets * 100);

    }
}
