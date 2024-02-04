package radostin.school.uf2.Apunts;

public class Methods3_7 {
    public static void main(String[] args) {
        methods();
        methods(null);
    }

    public static void methods(int... param){
        if(param==null){
            System.out.println("Has passat un null");
            return;
        }

        System.out.println("M'has passat "+param.length+" paràmetres");
        for (int i = 0; i < param.length; i++) {
            System.out.println(param[i]);
        }
    }

    public static void method2(float i, int f, char c, double d, String s, int[] v, int... j){


    }
}
