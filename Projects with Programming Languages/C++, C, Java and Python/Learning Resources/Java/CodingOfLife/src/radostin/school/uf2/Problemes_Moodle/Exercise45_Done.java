package radostin.school.uf2.Problemes_Moodle;

import java.util.Scanner;

public class Exercise45_Done {

    //Variables of the program
    static int num1, num2, counter;

    public static void main(String[] args) {

        initializeVariable();

        do{
            treatElement();
        } while (!finalElement());

        finalTreatment();
    }

    private static void finalTreatment() {
        System.out.printf("%nHas introduit %d parelles.%n", counter);
    }

    private static boolean finalElement() {

        return num1==num2 || num1==0 || num2==0;
    }

    private static void treatElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix una parella de números enters (iguals entre ells o iguals a 0 per acabar): ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        //We increment the counter
        counter++;
    }

    private static void initializeVariable() {
        // We put the counter at 0
        counter = 0;
    }
}
