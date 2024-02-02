package radostin.school.uf1.Apunts.nf2;

import java.text.Normalizer;

public class StringOfCharacters17 {
    public static void main(String[] args) {
        String s = "AEIou";
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", " ");
        System.out.println(s);
    }
}
