package org.raduoos.mp03.uf1.nf1.moodlePresentation;

public class Repetitive4 {
    public static void main(String[] args) {
        //Countdown from 5 to 0:

        //With fori:
        for (int a=5; true; a=a-1) {
            System.out.println(a);
            if (a==0){
                break;
            }
        }

        //With while:
        int a=5;
        while (true){
            System.out.println(a);
            if (a==0){
                break;
            }
            a=a-1;
        }
    }
}
