package org.raduoos.mp03.nf1.moodlePresentation;

public class CastingConvertion {
    public static void main(String[] args) {
        int a = 2;  // a = 2
        double b = 2; // a = 2.0

        //Error > int c = 18.7;
        int d = (int) 18.7; // d = 18 per casting

        double e = 2/3; // e = 0.0
        double f = (double) 2/3; // f = 0.6666... per casting

        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}
