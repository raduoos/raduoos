package radostin.school.uf1.Problems_JOEL.nf3;

import java.util.Arrays;
import java.util.Scanner;

public class BassouMeOdia_NotWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = scanner.skip("[\r\n]").nextInt();
        String[] names = new String[students];
        int count = 0;

        for (int i = 0; i < students; i++) {
            String name = scanner.skip("[\r\n]").nextLine();
            if (names[i]!=null && names[i].equals("Bassou")){
                count++;
                names[i]=name;
            }
        }

        System.out.println(Arrays.toString(names));
    }
}
