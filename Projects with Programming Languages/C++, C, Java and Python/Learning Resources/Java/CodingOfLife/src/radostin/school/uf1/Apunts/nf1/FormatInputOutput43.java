package radostin.school.uf1.Apunts.nf1;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class FormatInputOutput43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            NumberFormat fmt = NumberFormat.getNumberInstance(new Locale("es", "ES"));
            double d3 = fmt.parse(scanner.nextLine()).doubleValue();
            System.out.printf("d3: %.2f %n", d3);
        }
        catch (ParseException exception){
            //TODO
        }
    }
}
