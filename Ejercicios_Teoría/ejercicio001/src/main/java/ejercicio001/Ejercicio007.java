package ejercicio001;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio007 {

    public static void main(String[] args) {
        //Iterar sobre Mapas
        HashMap<Integer, String> dias = new HashMap();
        dias.put(1, "Lunes");
        dias.put(2, "Martes");
        dias.put(3, "Miércoles");
        dias.put(4, "Jueves");
        dias.put(5, "Viernes");

        for (Map.Entry<Integer, String> dia : dias.entrySet()) {
            System.out.println(dia.getKey() + " , " + dia.getValue());
        }
        
        //Mostrar solo las llaves
        for (Integer clave : dias.keySet()) {
            System.out.println(clave);
        }
        //Mostrar solo los nombres de los días
        for (String nombre : dias.values()) {
            System.out.println(nombre);
        }
    }
}
