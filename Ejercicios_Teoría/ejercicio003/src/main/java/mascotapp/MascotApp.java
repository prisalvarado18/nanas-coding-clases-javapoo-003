package mascotapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mascotapp.servicios.ServicioMascota;

public class MascotApp {

    public static void main(String[] args) {
        ServicioMascota servicio = new ServicioMascota();
        //servicio.fabricarPolis(10);
        servicio.fabricarMascotas(4);
        servicio.mostrarMascotas();
        System.out.println("Actualice la mascota 0");
        servicio.actualizarMascota2(0);
        servicio.mostrarMascotas();
        
        servicio.eliminarMascota(3);
        servicio.mostrarMascotas();
        
        servicio.actualizarMascotaPorNombre("c", "Poli");
        servicio.mostrarMascotas();
        
        servicio.eliminarMascotaPorNombre("b");
        servicio.mostrarMascotas();
        
        
        /*List<String> nombres = new ArrayList();
        nombres.add("Amanda");
        nombres.add("Alejandra");
        nombres.add("Svetlana");
        
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            //System.out.println(aux);
            if(aux.equals("Alejandra")){
                it.remove();
            }
        }*/

        /*for (String nombre : nombres) {
            //System.out.println(nombre);
            if (nombre.equals("Alejandra")) {
                nombres.remove(nombre);
            }
        }*/
        /*for (int i = 0; i < nombres.size(); i++) {
            //System.out.println(nombres.get(i));
            String persona = nombres.get(i);
            if (persona.equals("Alejandra")) {
                nombres.remove(persona);
            }
        }*/

        //nombres.forEach((e) -> System.out.println(e));

        //System.out.println(nombres.stream().count());
    }
}
