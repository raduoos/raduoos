package radostin.school.uf2.Apunts;

import java.util.Arrays;
import java.util.Scanner;
public class Methods1_5 {
    public static void main(String[] args) {

        int num = nextInteger("Write a number:");
        String[] noms = divide("Ana Pere Antoni"," ");
        System.out.println(Arrays.toString(noms));

        notReturnNothing(67);
    }

    public static String[] divide(String text, String separator){

        return text.split(separator);
    }

    public static int nextInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int nextInteger(String question){
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void notReturnNothing(int number){
        int value=nextInteger("Input an Integer number:");
        System.out.println(number+value);
    }
}
