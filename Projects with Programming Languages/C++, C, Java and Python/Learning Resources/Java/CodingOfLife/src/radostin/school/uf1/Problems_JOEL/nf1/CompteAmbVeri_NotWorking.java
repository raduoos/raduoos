package radostin.school.uf1.Problems_JOEL.nf1;

import java.util.Scanner;

public class CompteAmbVeri_NotWorking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCasos = input.nextInt();

        while (numCasos-->0){
            //Tractament de cada cas dins del bucle
            int hp = input.nextInt();
            int attack = input.nextInt();
            int veri = input.nextInt();
            int rounds = 1;

            while (true){
                hp = hp - attack;
                if(hp < 0){
                    System.out.format("%s %d %n", "RAMMUS", rounds);
                    break;
                } else {
                    hp = hp-veri;
                    if (hp <= 0){
                        System.out.format("%s %d %n", "TWITCH", rounds);
                        break;
                    }
                }
                rounds++;
            }
        }
    }
}
