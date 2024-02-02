package radostin.selfThings.courses.courseSoftUni.ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class HotelRoom_HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceApartment = 0.0;
        double priceStudio = 0.0;

        switch (month){
            case "May":
            case "October":
                priceApartment = 65.00 * countNights;
                priceStudio = 50.00 * countNights;
                break;
            case "June":
            case "September":
                priceApartment = 68.70 * countNights;
                priceStudio = 75.20 * countNights;
                break;
            case "July":
            case "August":
                priceApartment = 77.00 * countNights;
                priceStudio = 76.00 * countNights;
                break;
        }

        if ((month.equals("May") || month.equals("October")) && (countNights < 14 && countNights > 7)){
            priceStudio *= 0.95;
        } else if ((month.equals("May") || month.equals("October")) && countNights > 14){
            priceStudio *= 0.70;
        } else if ((month.equals("June") || month.equals("September")) && countNights < 14 ){
            priceStudio *= 0.80;
        }

        if (countNights>14){
            priceApartment *= 0.90;
        }


        System.out.printf("Apartment: %.02f lv.", priceApartment);
        System.out.println();
        System.out.printf("Studio: %.02f lv.", priceStudio);

    }
}
