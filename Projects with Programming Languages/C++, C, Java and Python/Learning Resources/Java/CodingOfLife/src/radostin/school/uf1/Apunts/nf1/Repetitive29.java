package radostin.school.uf1.Apunts.nf1;

public class Repetitive29 {
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
