package org.raduoos.mp03.uf1.nf1.moodlePresentation;

import java.util.Scanner;

public class Repetitive5 {
    public static void main(String[] args) {
        //Loops while we type a number less than 0 or equal to 0

        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Write a number");
            num = scanner.nextInt();
        } while (num<=0);
    }
}
