package radostin.school.uf1.Apunts.nf1;

public class Repetitive28 {
    public static void main(String[] args) {

        //Fori way
        for (int i=10, j=-10; i>0 || j<0; i=i-1, j=j+1) {
            System.out.println(i*j);
        }

        //While way
        int i=10;
        int j=-10;

        while (i>0 || j<0){
            System.out.println(i*j);
            i=i-1;
            j=j+1;
        }

    }
}
