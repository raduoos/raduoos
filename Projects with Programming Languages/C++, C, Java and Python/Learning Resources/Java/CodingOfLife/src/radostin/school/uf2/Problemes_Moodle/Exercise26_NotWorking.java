package radostin.school.uf2.Problemes_Moodle;

import java.util.Arrays;

public class Exercise26_NotWorking {

    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseNumber(number);
        System.out.println(reversed);
    }

    public static int numVector(int[] number) {
        int result = 0;
        for (int i = 0; i < number.length; i++) {
            result += number[i] * Math.pow(10, number.length - i - 1);
        }
        return result;
    }

    public static int[] vectorDigits(int number) {
        int[] digits = new int[0];
        while (number > 0) {
            digits = Arrays.copyOf(digits, digits.length + 1);
            digits[digits.length - 1] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int reverseNumber(int number){
        //El reves d'un números d'un sol dígit és ell mateix
        if (number>=-9 && number<=9){
            return number;
        }

        // Tractament dels números de més d'un dígit
        int[] vector=vectorDigits(number);

        //Girem el vector
        int[] reversed = new int[vector.length]; //instanciem vector d'igual dimensió que el que volem girar

        for (int i = 0; i < vector.length; i++) {
            reversed[vector.length-i-1]=vector[i];
        }

        //Retornem el resultat usant el mètode numVector

        return numVector(reversed);
    }
}
