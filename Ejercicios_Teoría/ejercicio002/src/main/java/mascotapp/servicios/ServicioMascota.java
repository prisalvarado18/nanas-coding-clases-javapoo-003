
package mascotapp.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {
    private Scanner leer;
    private List<String> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }    
    
    public void crearMascota(){
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        
        System.out.println("Ingrese el apodo: ");
        String apodo = leer.next();
        
        System.out.println("Introduzca el tipo: ");
        String tipo = leer.next();
        
        String mascota = nombre + " " + apodo + " " + tipo;
        
        mascotas.add(mascota);
    }
    
    public void mostrarMascotas(){
        System.out.println("Lista actual de mascotas: ");
        for(String mascota: mascotas){
            System.out.println(mascota);
        }
        System.out.println("Cantidad: " + mascotas.size());
    }
}
