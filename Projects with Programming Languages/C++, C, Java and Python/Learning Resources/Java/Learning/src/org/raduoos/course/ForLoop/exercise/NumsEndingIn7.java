package org.raduoos.course.ForLoop.exercise;

public class NumsEndingIn7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 997; i++) {
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
