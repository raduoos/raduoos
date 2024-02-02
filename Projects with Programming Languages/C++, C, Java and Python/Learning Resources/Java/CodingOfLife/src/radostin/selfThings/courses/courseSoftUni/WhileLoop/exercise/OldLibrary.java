package radostin.selfThings.courses.courseSoftUni.WhileLoop.exercise;

import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameBook = scanner.nextLine();
        String string = scanner.nextLine();

        int count = 0;

        while (!"No More Books".equals(string)){

            if (nameBook.equals(string)){
                break;
            }

            ++count;
            string = scanner.nextLine();
        }

        if (nameBook.equals(string)){
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }
    }
}
