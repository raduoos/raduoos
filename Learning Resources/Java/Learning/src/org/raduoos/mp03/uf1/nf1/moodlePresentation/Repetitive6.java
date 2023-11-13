package org.raduoos.mp03.uf1.nf1.moodlePresentation;

public class Repetitive6 {
    public static void main(String[] args) {
        String text = "peck of pickled peppers";
        int numEsps = 0, numPs =0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='s'){
                numEsps++;
            } else {
                if (text.charAt(i)=='p'){
                    numPs++;
                }
            }
        }

        System.out.println("Spaces, p's founded: " + numEsps + numPs);
    }
}
