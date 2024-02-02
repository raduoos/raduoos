package radostin.school.uf1.Apunts.nf2;

public class StringOfCharacters15 {
    public static void main(String[] args) {
        System.out.println("Hello World".indexOf('W'));
        System.out.println("Hello World".indexOf('j'));
            System.out.println();
        System.out.println("Hello".indexOf('e', 3));
        System.out.println("Hello".indexOf('e',4));
            System.out.println();
        System.out.println("Hello World".indexOf("lo"));
        System.out.println("Hello World".indexOf("loW"));
            System.out.println();
        System.out.println("Hello World".lastIndexOf("lo"));
        System.out.println("Hello World".lastIndexOf("lo", 0));
            System.out.println();
        System.out.println("Hello".substring(2));
        System.out.println("World".substring(2, 5));
            System.out.println();
        System.out.println("CamAroT".toLowerCase());
        System.out.println("CamAroT".toUpperCase());

    }
}
