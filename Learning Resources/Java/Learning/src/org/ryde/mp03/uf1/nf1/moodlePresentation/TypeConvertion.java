package org.ryde.mp03.uf1.nf1.moodlePresentation;

public class TypeConvertion {
    public static void main(String[] args) {
        //Error > int a String:
        //Error > String five = 5;

        String five = Integer.toString(5);
        String five2 = "" + 5;

        System.out.println(five);
        System.out.println(five2);

        //Error > String a int:
        //Error > int foo = "18";
        //Error > int foo = Integer.parseInt("18");
    }
}
