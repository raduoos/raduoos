package radostin.school.uf2.Apunts;

public class Methods_7 {

    public static void main(String[] args) {
        char letter = 'p';
        float realNum = 1.5F;

        someParameters(7, letter, realNum);
        System.out.printf("Letter = %c; real = %.1f \n", letter, realNum);
    }

    public static void someParameters(int word1, char word2, float word3){
        word3 = word1 + word3;
        System.out.printf("Character %c; Sum %f\n", word2, word3);
    }
}
