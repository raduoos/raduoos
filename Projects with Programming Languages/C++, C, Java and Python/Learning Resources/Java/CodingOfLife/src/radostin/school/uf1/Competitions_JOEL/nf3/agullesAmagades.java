package radostin.school.uf1.Competitions_JOEL.nf3;

import java.util.Scanner;

public class agullesAmagades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.skip("[\r\n]*").nextInt();

        while (numCases-->0){
            //Tractament de cada cas
            String[] time = scanner.skip("[\r\n]*").nextLine().split(":");
            int hours = Integer.parseInt(time[0]);
            int minutes = Integer.parseInt(time[1]);

            if(minutes == (hours*5 + minutes/12)%60){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}