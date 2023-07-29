
package ejercicio001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio002 {
    public static void main(String[] args) {
        //Listas
        //Lista de tipo Integer
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);//Agregamos el #20 a la lista, en la posición 0
        System.out.println(numerosA);

        //Conjuntos
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        numerosB.add(y);
        System.out.println(numerosB);
        
        //Mapas
        HashMap<Integer, String> alumnas = new HashMap();
        int ci = 1783759395;
        String nombreAlumna = "Hailey";
        alumnas.put(ci, nombreAlumna);//Agregamos la llave y el valor
        System.out.println(alumnas);
    }
}
