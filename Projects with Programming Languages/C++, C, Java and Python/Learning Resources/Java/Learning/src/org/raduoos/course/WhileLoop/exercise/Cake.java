package org.raduoos.course.WhileLoop.exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int lengthCake = Integer.parseInt(scanner.nextLine());
            int widthCake = Integer.parseInt(scanner.nextLine());
                int piecesOfCake = lengthCake * widthCake;

            String string = scanner.nextLine();

            while (!"STOP".equals(string)){
                int numOfPieces = Integer.parseInt(string);
                piecesOfCake -= numOfPieces;

                if (piecesOfCake <= 0){
                    break;
                }

                string = scanner.nextLine();
            }

            if (piecesOfCake <= 0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(piecesOfCake));
            } else {
                System.out.printf("%d pieces are left.", piecesOfCake);
            }
    }
}
