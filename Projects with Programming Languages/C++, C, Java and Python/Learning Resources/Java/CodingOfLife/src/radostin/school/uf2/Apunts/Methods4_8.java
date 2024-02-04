package radostin.school.uf2.Apunts;

public class Methods4_8 {
    public static void main(String[] args) {
        System.out.println(factorial(Integer.MAX_VALUE));
    }

    public static void recursive(int a){
        System.out.println(a);
        recursive(a-1);
    }

    public static void nonRecursive(int a){
        while(true){
            System.out.println(a);
            a=a-1;
        }
    }

    public static int factorial(int n){
        if(n==0) return 1;

        return n* factorial(n-1);

    }
}
