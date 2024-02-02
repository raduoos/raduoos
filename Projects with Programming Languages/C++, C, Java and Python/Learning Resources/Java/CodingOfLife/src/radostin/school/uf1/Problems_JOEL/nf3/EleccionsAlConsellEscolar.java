package radostin.school.uf1.Problems_JOEL.nf3;

import java.util.Scanner;

public class EleccionsAlConsellEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        char[][] matriz = new char[num][num];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==0 || i == matriz.length-1 || j==0 || j==matriz[i].length-1 || i==j || i+j == matriz.length-1){
                    matriz[i][j]='X';
                } else {
                    matriz[i][j]='.';
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }
}
