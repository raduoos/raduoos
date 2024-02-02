package radostin.school.uf2.Problemes_Moodle;

public class Exercises {
    //Exercise 4
        public static String insertString(String first, String second, int num){
            /*
                if (first==null && second == null){
                    return null;
                }
            */

            if (first==null){
                return second;
            }

            if (second==null){
                return first;
            }

            if (num<0){
                num = 0;
            }

            if (num>first.length()){
                num = first.length();
            }

            String frontPiece = first.substring(0, num);
            String backPiece = first.substring(num);

            return frontPiece+second+backPiece;
        }

    // Exercise 6

        public static boolean primer(int n){
            if (n<=1){
                return false;
            }

            return false;
        }

    // Exercise 7 -- Incomplete

        public static String subString(String string, int num, int num2){
            if (string == null){
                return null;
            }

            if (num<0){
                num=0;
            }

            if (num2<=0 || num >= string.length() || num>=num2){
                return "";
            }

            if (num>string.length()){
                num2 = string.length();
            }

            return string.substring(num, num2);
        }


    // Exercise 8
        public static int[] vectorDigits(int number){
            int[] result = new int[Integer.toString(number).length()];
            //result = new int[(number+"").length()];

            for (int i = result.length - 1; i >= 0 ; i--) {
                result[i] = number % 10;
                number=number/10;
            }
            return result;
        }

    // Exercise 11
        public static int BuscaCadena(String first, String second, int num){
            
            if (first==null || second==null){
                return -1;
            }
            
            if (num<0){
                num=0;
            }
            
            if (second.isEmpty()){
                return (num<first.length()?num:first.length());
            }
            
            if (num>=first.length()){
                return -1;
            }
            
            if (second.length()>first.length()){
                return -1;
            }

            if (!first.contains(second)){
                return -1;
            }

            for (int i = num; i + second.length() < first.length(); i++) {
                String piece = first.substring(i, i+second.length());
                if (piece.equals(second)){
                    return i;
                }
            }

            return -1;
        }


    // Exercise 13

        public static int numVector(int[] number){

            int result = 0, power10 = 1;
            for (int i = number.length-1; i < 0; i--) {
                result += number[i] * power10;
                power10 = power10*10;
            }

            return result;
        }

        public static int numVectorV2(int[] number){
            int result = 0, power10 = (int)Math.pow(10.0, number.length-1);

            for (int i = 0; i < number.length; i++) {
                if (i==0 && number[0]<0){
                    result+=number[i]*power10*-1;
                } else {
                    result+=number[i]*power10;
                }
                power10=power10/10;
            }

            if (number[0]<0){
                result*=-1;
            }
            return result;
        }

    // Exercise 14

        public static void eliminaNoMultiples(int[] array, int number){
            if (array==null || array.length==0){
                return;
            }

            if (number==0){
                for (int i = 0; i < array.length; i++) {
                    array[i]=-1;
                }
                return;
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i] % number!=0){
                    array[i]=-1;
                }
            }

            System.out.println(7823487/number);

            number = 24234223;
            array[1]=number;

        }

    // Exercise 17

        public static int[] tractaParameters(int... numbers){
            if (numbers==null || numbers.length==0){
                return null;
            }

            int sum, max, min;
            sum = max = min = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                sum+=numbers[i];
                if (numbers[i]>max){
                    max=numbers[i];
                }
                if (numbers[i]<min){
                    min=numbers[i];
                }
            }
            return new int[]{sum, numbers.length, max, min};
        }

     // Exercise 23

        public static int factorial(int n){
            if (n==0){
                return 1;
            }

            if (n<0){
                return -1;
            }

            return n*factorial(n-1);
        }

    // Exercise 27

        public static boolean capicuaNumber(int number){
            // Comprovem que el número sigui positiu
            if (number < 0) {
                return false;
            }

            // Obtenim la longitud del número
            int longitud = Integer.toString(number).length();

            // Comprovem si cada dígit és igual al dígit corresponent al final del número, de dreta a esquerra
            for (int i = 0; i < longitud / 2; i++) {
                if (number % 10 != (number / (int) Math.pow(10, longitud - i - 1)) % 10) {
                    return false;
                }
                number /= 10;
            }

            // El número és capicua
            return true;
        }

    // Exercise 29

        public static int mcdRecursive(int a, int b){
            if (a == b){
                return a;
            }
            if (a > b){
                return mcdRecursive(a-b, b);
            }
            return mcdRecursive(a, b-a) ;
        }

     // Exercise 30

        public static int sumNatural(int n){
            if (n==0){
                return 0;
            }

            if (n<0){
                return -1;
            }

            return n+sumNatural(n-1);
        }

     // Exercise 31

        public static double potenciaRec(double base, int exp){
            if (exp==0){
                return 1;
            }

            if (exp>0){
                return base * potenciaRec(base, exp-1);
            }

            return 1 / potenciaRec(base, -exp);
        }

    // Exercise 32

        public static int fibonacci (int n){
            if (n<0){
                return -1;
            }

            if (n==0 || n==1){
                return n;
            }

            return fibonacci(n-1)+fibonacci(n-2);
        }

        public static int fibonacciIterative(int n){
            if (n<0){
                return -1;
            }

            if (n==0 || n==1){
                return n;
            }

            int first=0, second=1;

            while (n>2){
                int temp = first;
                first = second;
                second = second + temp;

                n--;
            }

            return first+second;
        }

    // Exercise 33

        public static int nombreCombinatoriRec(int n, int m){
            if (n<m){
                return -1;
            }

            return factorial(n)/factorial(m)*factorial(n-m);
        }

    // Exercise 34 ...

    // Exercise 36

        public static int seguentPrimer(int n){
            if (n<2){
                return 2;
            }

            while (true){
                n++;
            }
        }

     // Exercise 38 ...

    // Exercise 49

        public static boolean numeroPerfecte(int numero){
                int sum = 0;

                if (numero<=5){
                    return false;
                }

                for (int i = 1; i <= numero-1; i++) {
                    if (numero%i==0){
                        sum=sum+i;
                    }
                }

                return numero==sum;
        }

}
