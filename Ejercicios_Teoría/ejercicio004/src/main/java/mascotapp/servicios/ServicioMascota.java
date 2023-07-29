package mascotapp.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {

    private Scanner leer;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public Mascota crearMascota() {
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();

        System.out.println("Ingrese el apodo: ");
        String apodo = leer.next();

        System.out.println("Introduzca el tipo: ");
        String tipo = leer.next();

        Mascota mascota = new Mascota(nombre, apodo, tipo);
        mascotas.add(mascota);
        return mascota;
    }

    public void mostrarMascotas() {
        System.out.println("Lista actual de mascotas: ");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota.toString());
        }
        System.out.println("Cantidad: " + mascotas.size());
    }

    /**
     * Crea Mascotas, todos Polis
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la
     * lista
     */
    public void fabricarPolis(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Poly", "Poly", "Runa"));
        }
    }
    
    /**
     * Crea Mascotas solicitando datos por teclado
     * @param cantidad
     */
    public void fabricarMascotas(int cantidad){
        for(int i =0; i < cantidad; i++){
            Mascota mascotaCreada = crearMascota();
            System.out.println(mascotaCreada.toString());
        }
    }
}











