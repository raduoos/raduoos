package radostin.school.uf2.Problemes_Moodle;

import java.util.Scanner;
import static radostin.school.uf2.Problemes_Moodle.Exercise26_NotWorking.reverseNumber;
import static radostin.school.uf2.Problemes_Moodle.Exercises.capicuaNumber;


public class Exercise47 {

    //Variables to share between the methods
    static int number;


    public static void main(String[] args) {

        initializeVariable();
        treatFirstElement();
        while (!finalElement() && !found()){
            treatNextElement();
        }
        if (found()){
            TreatmentFound();
        } else {
            TreatmentNotFound();
        }

    }

    private static void TreatmentNotFound() {
        System.out.printf("%nAt the number %d, there is no capicua number found%n", number);
    }

    private static void TreatmentFound() {
        System.out.printf("%nThe number %d approves%n", number);
    }

    private static void treatNextElement() {
        treatFirstElement();
    }

    private static boolean found() {
        return capicuaNumber(number);
    }

    private static boolean finalElement() {
        return capicuaNumber(number) || number<0;
    }

    private static void treatFirstElement() {

        //We generate the first element of the sequence
        number = number + reverseNumber(number);
        System.out.println(number);
    }

    private static void initializeVariable() {
        Scanner scanner = new Scanner(System.in);

        //We demand one positive integer, forcing it.
        do {
            System.out.println("Introduce one positive integer (>0): ");
            number=scanner.nextInt();
            if (number >= 0){
                break;
            } else {
                System.out.println("It has to be bigger than 0!");
            }
        }while (true);
    }
}
