package radostin.school.uf1.Problems_JOEL.nf2;

import java.util.Arrays;
import java.util.Scanner;

public class ElCistellDeLaCompra_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numCases = Integer.parseInt(scanner.next());

        String[] names = new String[numCases];
        double[] prices = new double[numCases];

        while (numCases-->0){
            names[numCases] = scanner.next();
            prices[numCases] = Double.parseDouble(scanner.next());
        }

        int select = Integer.parseInt(scanner.next());

        String[] namesCopy = new String[names.length];
        double[] pricesCopy = new double[prices.length];
        for (int i = 0; i < names.length; i++) {
            namesCopy[i] = names[i];
            pricesCopy[i] = prices[i];
        }

        Arrays.sort(pricesCopy);

        double cheaperPrice = pricesCopy[0];
        double higherPrice = pricesCopy[pricesCopy.length-1];
        double selectedPrice = pricesCopy[pricesCopy.length-select];
        String cheaperProduct = null;
        String higherProduct = null;
        String moreSelectedProduct = null;


        int countFound = 0;
        for (int i = 0; i < prices.length && countFound<3; i++) {
            if (prices[i]==cheaperPrice){
                cheaperProduct = names[i];
                countFound++;
            }
                if (prices[i]==higherPrice){
                    higherProduct = names[i];
                    countFound++;
                }
                    if (prices[i]==selectedPrice){
                        moreSelectedProduct = names[i];
                        countFound++;
                    }
        }

        System.out.println("EL MES CAR: " + higherProduct + " " + higherPrice);
        System.out.println("EL MES CAR: " + cheaperProduct + " " + cheaperPrice);
        System.out.println("EL BUSCAT: " + moreSelectedProduct + " " + selectedPrice);

    }
}
