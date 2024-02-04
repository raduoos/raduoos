package radostin.school.uf2.Apunts;

import java.util.Arrays;

public class Methods2_6 {
    public static void main(String[] args) {
        int var=25;
        int[] vector={1,2,3,4,5};

        System.out.println(Arrays.toString(vector));
        passParameterObjective(vector);
        System.out.println(Arrays.toString(vector));
    }
    public static void passParameter(int i){
        i=i+1;
    }

    public static int[] passParameterObjective(int[] values){

        int[] copy=new int[values.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i]=values[i];
        }

        for (int i = 0; i < values.length; i++) {
            copy[i]=copy[i]+1;

        }
        return copy;
    }

}
