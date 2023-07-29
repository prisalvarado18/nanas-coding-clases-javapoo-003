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

        return new Mascota(nombre, apodo, tipo);
    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
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
     *
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
     *
     * @param cantidad
     */
    public void fabricarMascotas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            agregarMascota(mascotaCreada);
            System.out.println(mascotaCreada.toString());
        }
    }

    //TODO: Añadir try and catch
    //En referencia al obj
    public void actualizarMascota(int index) {
        Mascota m = mascotas.get(index);
        m.setApodo("Roberto");
    }

    public void actualizarMascota2(int index) {
        if (index <= (mascotas.size() - 1)) {
            System.out.println("");
            System.out.println("Actualizar mascota");

            Mascota m = crearMascota();
            mascotas.set(index, m);
        } else {
            System.out.println("Fallo al actualizar: el índice ingresado es incorrecto");
        }
    }

    public void eliminarMascota(int index) {

        if (index <= (mascotas.size() - 1)) {
            mascotas.remove(index);
        } else {
            System.out.println("Fallo al eliminar: el índice ingresado es incorrecto");
        }
    }

    public void eliminarMascotaPorNombre(String nombre) {
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombre)) {
                mascotas.remove(m);
            }
        }
    }
    
    public void actualizarMascotaPorNombre(String nombreAntes, String nombreDespues){
        for(int i = 0; i < mascotas.size(); i++){
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombreAntes)){
                m.setNombre(nombreDespues);
            }
        }
    }
}
