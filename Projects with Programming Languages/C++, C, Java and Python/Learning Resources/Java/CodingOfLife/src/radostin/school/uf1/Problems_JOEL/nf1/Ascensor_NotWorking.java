package radostin.school.uf1.Problems_JOEL.nf1;

import java.util.Scanner;

public class Ascensor_NotWorking {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);

        int moves = 0, floor_num = 0;
        int lowest = num.nextInt();
        int highest = num.nextInt();
        int actual = num.nextInt();

        boolean incorrect = false;

        while (true){
            String casee = num.nextLine();
            if (casee.equals("X")){
                break;
            }
            int floor = Integer.parseInt(casee);

            if (floor<lowest || floor>highest){
                incorrect = true;
                continue;
            }

            if (floor != actual){
                moves++;

                if(floor>actual){
                    floor_num = floor_num + floor - actual;
                }

                if(floor!=actual){

                } else {
                    floor_num += actual-floor;
                }

                actual = floor;
            }


        }
        System.out.printf("%d %d %d %s", moves, floor_num, actual, (incorrect?"E":""));
    }
}
