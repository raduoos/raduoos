package radostin.school.uf1.Problems_JOEL.nf2;

import java.util.Scanner;

public class SevenSegments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] segments={6,2,5,5,4,5,6,3,7,6};
        final int segment_cost = 15;
        final int colon_cost = 10;
        // String time = "10:59";
        // String[] parts = time.split(":");
        // int hour = Integer.parseInt(parts[0]);
        // int minute = Integer.parseInt(parts[1]);

        while (true){
            String line = scanner.nextLine().trim();
            if (line.equals("99:99 0")){
                break;
            }

            String[] data = line.split(" ");
            String time = data[0];

            int minutes = Integer.parseInt(data[1]);
            int cost = 0;

            for (int i = 0; i < time.length(); i++) {
                if (time.charAt(i)==':'){
                    cost += colon_cost;
                } else {
                    cost += segments[Integer.parseInt(time.charAt(i)+"")]*segment_cost;
                }
            }

            while (minutes-->0){
                String[] parts = time.split(":");
                int hour = Integer.parseInt(parts[0]);
                int minute = Integer.parseInt(parts[1]);

                if (minute != 59){
                    minute++;
                } else {
                    minute = 0;
                    if (hour != 23){
                        hour++;
                    } else {
                        hour = 0;
                    }
                }
                time = (hour<9?"0":"") + hour + ":" + (minute<=9?"0":"") + minute;

                for (int i = 0; i < time.length(); i++) {
                    if (time.charAt(i)==':'){
                        cost += colon_cost;
                    } else {
                        cost += segments[Integer.parseInt(time.charAt(i)+"")]*segment_cost;
                    }
                }
            }
            System.out.println(cost);
        }

        //if (minute != 59){
        //    minute++;
        //} else {
        //    minute = 0;
        //    if (hour != 23){
        //        hour++;
        //    } else {
        //        hour = 0;
        //    }
        //}

        //time = (hour<9?"0":"") + hour + ":" + (minute<=9?"0":"") + minute;
        //System.out.println(time);

       //int cost = 0;

       //for (int i = 0; i < time.length(); i++) {
       //    if (time.charAt(i)==':'){
       //        cost += colon_cost;
       //    } else {
       //        cost += segments[Integer.parseInt(time.charAt(i)+"")]*segment_cost;
       //    }
       //}
       //System.out.println(cost);

        //Scanner scanner = new Scanner(System.in);
        //int numCases = scanner.nextInt();
        //
        //while (numCases-->0){
        //  TODO
        //}
    }
}
