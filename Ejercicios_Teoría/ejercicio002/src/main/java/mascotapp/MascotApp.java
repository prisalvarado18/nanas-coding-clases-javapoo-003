
package mascotapp;

import mascotapp.servicios.ServicioMascota;

public class MascotApp {

    public static void main(String[] args) {
        ServicioMascota servicio = new ServicioMascota();
        
        servicio.crearMascota();
        servicio.crearMascota();
        
        servicio.mostrarMascotas();
    }
}
