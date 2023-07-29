package mascotapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import mascotapp.entidades.Mascota;
import mascotapp.utilidades.Comparadores;

public class MascotApp {

    public static void main(String[] args) {
        /*ServicioMascota servicio = new ServicioMascota();
        //servicio.fabricarPolis(10);
        servicio.fabricarMascotas(2);
        servicio.mostrarMascotas();*/
        /*ArrayList<Mascota> mascotas = new ArrayList();
        mascotas.add(new Mascota("Manchas","Manchis","Gato"));
        mascotas.add(new Mascota("Sasha","Sash","Perro"));
        
        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
        //Collections.shuffle(mascotas);
        
        for(Mascota mascota: mascotas){
            System.out.println(mascota);
        }*/
        
        Set<Mascota> mascotas = new HashSet();
        mascotas.add(new Mascota("Manchas","Manchis","Gato"));
        mascotas.add(new Mascota("Manchas","Manchis","Gato"));
        mascotas.add(new Mascota("Manchas","Manchis","Gato"));
        
        for(Mascota mascota: mascotas){
            System.out.println(mascota);
        }
    }
}
