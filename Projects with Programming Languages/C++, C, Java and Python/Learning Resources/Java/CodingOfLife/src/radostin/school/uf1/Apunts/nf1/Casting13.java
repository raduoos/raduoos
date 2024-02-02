package radostin.school.uf1.Apunts.nf1;

public class Casting13 {
    public static void main(String[] args) {
        //Error:
            /*
            int a String:
            String five = 5;
            */

        //Correct:
            /*
            String five = Integer.toString(5);
            OR
            String five = "" + 5; // five = 5;
             */

        //////

        //Error:
            /*
            String a int:
            int foo = "18";
            int foo = Integer.parseInt("18");
             */
    }
}
