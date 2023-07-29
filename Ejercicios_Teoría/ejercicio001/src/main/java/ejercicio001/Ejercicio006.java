package ejercicio001;

import java.util.ArrayList;
import java.util.HashSet;

public class Ejercicio006 {

    public static void main(String[] args) {
        //ArrayList(Listas)
        ArrayList<String> meses = new ArrayList();
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");

        for (String mes : meses) {
            System.out.println(mes);
        }
        
        //HashSet(Conjuntos)
        HashSet<Integer> edades = new HashSet();
        edades.add(20);
        edades.add(30);
        edades.add(40);
        
        for(Integer edad: edades){
            System.out.println(edad);
        }
    }
}
