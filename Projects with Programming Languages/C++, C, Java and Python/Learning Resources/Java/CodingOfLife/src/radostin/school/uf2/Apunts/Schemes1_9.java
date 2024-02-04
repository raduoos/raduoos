package radostin.school.uf2.Apunts;

public class Schemes1_9 {
    //Declaration of the variables.
    static int[] ages;
    static int index;
    static int countBiggerThan18;


    public static void main(String[] args) {
        initializeVariables();
        do{
            tractarElement();
        }while(noElementFinal());
        finalTreatment();
    }

    private static void finalTreatment() {
        System.out.printf("Hi ha %d alumnes majors d'edat d'un total de %d%n", countBiggerThan18, ages.length);
        System.out.println("Hi ha "+countBiggerThan18+" alumnes majors d'edat d'un total de "+ages.length+"\n");
    }

    private static void tractarElement() {

        //Mirar si l'edat de l'alumne actual és superior o igual a 18
        if(ages[index]>=18){
            countBiggerThan18++;
        }

        //Passem al següent alumne
        index++;
    }

    private static boolean noElementFinal() {
        return index<ages.length;
    }



    private static void initializeVariables() {
        ages=new int[]{18,20,16,14};
        index=0;
        countBiggerThan18 = 0;
    }
}
