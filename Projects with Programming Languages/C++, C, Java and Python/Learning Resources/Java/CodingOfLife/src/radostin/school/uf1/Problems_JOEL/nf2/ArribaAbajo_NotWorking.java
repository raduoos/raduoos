package radostin.school.uf1.Problems_JOEL.nf2;

import java.util.Scanner;

public class ArribaAbajo_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int forwardN = scanner.nextInt();
        int behindN = scanner.nextInt();
        int forwardB = scanner.nextInt();
        int behindB = scanner.nextInt();
        int posN, posB, countStepsN, countStepsB;
            posN=posB=countStepsN=countStepsB=0;
        boolean walkForwardN = true, walkForwardB = true;

        int numSteps = scanner.nextInt();
        while (numSteps --> 0){
            if (walkForwardN){
                posN++;
                countStepsN++;
                if (countStepsN == forwardN){
                    walkForwardN = false;
                    countStepsN = 0;
                }
            } else {
                posN--;
                countStepsN++;
                if (countStepsN == behindN){
                    walkForwardN = true;
                    countStepsN = 0;
                }
            }

            if (walkForwardB){
                posB++;
                countStepsB++;
                if (countStepsB == forwardB){
                    walkForwardB = false;
                    countStepsB = 0;
                }
            } else {
                posB--;
                countStepsB++;
                if (countStepsB == behindB){
                    walkForwardB = true;
                    countStepsB = 0;
                }
            }
            if (posN>posB){
                System.out.println("Nikky");
            } else if (posN < posB) {
                System.out.println("Iron");
            } else {
                System.out.println("Tied");
            }
        }
    }
}
