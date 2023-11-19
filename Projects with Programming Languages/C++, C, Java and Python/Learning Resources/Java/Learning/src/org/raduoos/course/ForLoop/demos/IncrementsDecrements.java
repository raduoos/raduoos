package org.raduoos.course.ForLoop.demos;

public class IncrementsDecrements {
    public static void main(String[] args) {
        int a = 1;
        //Pre-increment
        System.out.println(++a); //2
        System.out.println(a); //2
            System.out.println();

        int b = 1;
        //Post-increment
        System.out.println(b++); //1
        System.out.println(b);  //1
            System.out.println();

        //Pre-decrement
        int c = 1;
        System.out.println(--c);
        System.out.println(c);
            System.out.println();

        //Post-decrement
        int d = 1;
        System.out.println(d--);
        System.out.println(d);
    }
}
