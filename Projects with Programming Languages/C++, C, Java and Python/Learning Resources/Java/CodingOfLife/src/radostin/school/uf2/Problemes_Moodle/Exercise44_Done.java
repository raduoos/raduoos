package radostin.school.uf2.Problemes_Moodle;

import java.util.Scanner;

import static radostin.school.uf2.Problemes_Moodle.Exercise43_Done.buscaParaula;

public class Exercise44_Done {
    //Variables a compartir entre els mètodes
    static String text, paraula;
    static int posicio, comptador;

    public static void main(String[] args) {

        //Esquema de recorregut d'una seqüència de paraules sense tractament diferent de l'element inicial
        inicialitzarVariables();
        do{
            tractarElement();
        }while(!elementFinal());
        tractamentFinal();
    }

    private static void tractamentFinal() {
        System.out.printf("S'ha trobat la paraula \"%s\" %d vegades.", paraula, comptador);

    }

    private static boolean elementFinal() {
        //Com hem sumat la longitud del text més 1 a la posicio per saber si no havime trobat la paraula ara hem de
        // restar esta suma
        return posicio-( paraula.length()+1 )==-1;
    }

    private static void tractarElement() {
        //Anem a buscar la paraula dins del text a partir de la posició
        posicio=buscaParaula(text,paraula,posicio);

        //Mirem si hem trobat la paraula i incrementem lo comptador
        if(posicio!=-1) comptador++;

        //Modifiquem posicio per evitar un bucle infinit
        posicio=posicio+paraula.length()+1;
    }

    private static void inicialitzarVariables() {
        //variables locals
        Scanner ent = new Scanner(System.in);

        //Posem la posició a 0, per començar a buscar a l'inici del text
        posicio=0;
        //Posem el comptador de paraules trobades a 0
        comptador=0;

        //Demanem a l'usuari un text acabat en punt
        System.out.println("Introduix un text acabat en punt:");
        text="";
        do{
            String linia=ent.nextLine().trim();
            text=text+linia;
            if(linia.endsWith(".")){
                break;
            }else{
                text=text+" ";
            }
        }while(true);

        //Demanem a l'usuari una paraula no buida --> s'hauria de comprovar que és una sola paraula, però ho dixem com a
        // exercici
        System.out.println("Introduix una paraula no buida:");
        do{
            paraula= ent.nextLine().trim();
            if(paraula.isEmpty()) System.out.println("Ha de ser una paraula no buida!!");
            else break;
        }while(true);

    }
}
