package radostin.school.uf1.Problems_JOEL.nf2;

import java.util.Scanner;

public class Minecraft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numCases = scanner.skip("[\r\n]*").nextInt();

        while(numCases-->0){
            int numLines = scanner.nextInt();
            int diamondCount = 0;

            while (numLines-->0){
                String line = scanner.skip("[\r\n]*").nextLine();

                int i = 0;
                while (true){
                    int j = line.indexOf("{}",i);

                    if (j == -1){
                        break;
                    } else {
                        diamondCount++;
                        i=j+1;
                    }
                }
            }

            System.out.println(diamondCount);
        }
    }
}
