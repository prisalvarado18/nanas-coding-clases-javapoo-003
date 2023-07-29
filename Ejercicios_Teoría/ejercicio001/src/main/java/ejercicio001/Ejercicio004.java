
package ejercicio001;

import java.util.HashSet;

public class Ejercicio004 {
    public static void main(String[] args) {
        //Ya que los conjuntos no constan de índices, solo se puede borrar por 
        //elemento
        HashSet<Integer> numeros = new HashSet();
        int a = 1;
        numeros.add(a);
        numeros.add(2);
        numeros.add(3);
        
        numeros.remove(a);
        numeros.remove(2);
        
        System.out.println(numeros);
    }
}
