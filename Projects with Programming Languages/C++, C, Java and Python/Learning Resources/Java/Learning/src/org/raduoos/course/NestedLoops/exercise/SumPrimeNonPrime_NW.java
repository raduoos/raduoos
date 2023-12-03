package org.raduoos.course.NestedLoops.exercise;

import java.util.Scanner;

public class SumPrimeNonPrime_NW {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!"stop".equals(string)){
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 0){
                System.out.println("Number is negative.");
                string = scanner.nextLine();
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                primeSum += num;
            } else {
                nonPrimeSum += num;
            }

            string = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is " + primeSum);
        System.out.println("Sum of all non prime numbers is " + nonPrimeSum);
    }
}
