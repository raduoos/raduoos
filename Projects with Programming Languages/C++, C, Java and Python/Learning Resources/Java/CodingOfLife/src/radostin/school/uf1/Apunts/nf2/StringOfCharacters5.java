package radostin.school.uf1.Apunts.nf2;

public class StringOfCharacters5 {
    public static void main(String[] args) {
        String string = "Hello, World!";
        for (int i = 0; i < string.length(); i++) {
            System.out.printf("\n%d character %c", i, string.charAt(i));
        }
    }
}
