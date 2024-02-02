package radostin.school.uf1.Competitions_JOEL.nf2;

import java.util.Scanner;

public class aparcament_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Math.PI ; i++) {
            int carLongitude = scanner.nextInt();
            int startSizeStreet = scanner.nextInt();
            int finishSizeStreet = scanner.nextInt();

            if (carLongitude <= startSizeStreet && carLongitude <= finishSizeStreet){
                System.out.println("SI");
            } else if (carLongitude > startSizeStreet && carLongitude > finishSizeStreet) {
                System.out.println("NO");
            }
        }
    }
}
