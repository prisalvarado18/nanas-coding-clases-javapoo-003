
package ejercicio001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Ejercicio001 {

    public static void main(String[] args) {
        //Corrige el siguiente código
        //Array<int> listado = new ArrayList;
        //TreeSet<String> = TreeSet();
        //HashMap<Integer> personas = new HashMap<>;
        
        // Corrección 1: Utilizar la interfaz en lugar de la clase concreta
        List<Integer> listado = new ArrayList<>();

        // Corrección 2: Declarar e inicializar correctamente el TreeSet
        TreeSet<String> otroListado = new TreeSet<>();

        // Corrección 3: Especificar los tipos de datos tanto para la clave como para el valor en el HashMap
        HashMap<Integer, String> personas = new HashMap<>();

    }
}
