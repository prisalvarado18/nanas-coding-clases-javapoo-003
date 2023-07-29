
package ejercicio001;

import java.util.HashMap;

public class Ejercicio005 {
    public static void main(String[] args) {
        HashMap<Integer, String> personas = new HashMap();
        
        personas.put(1, "Hayley");
        personas.put(2, "Max");
        personas.put(3, "Susie");
        personas.put(4, "Toto");
        personas.put(5, "Oscar");
        
        System.out.println("HashMap antes de eliminar: " + personas);
        
        personas.remove(1);
        personas.remove(5);
        
        System.out.println("HasMap después de eliminar: " + personas);
    }
}
