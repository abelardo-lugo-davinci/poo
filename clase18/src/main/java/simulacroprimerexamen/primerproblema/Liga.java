package simulacroprimerexamen.primerproblema;

import java.util.ArrayList;

public class Liga {

    // ATRIBUTOS
    String nombre;
    String deporte;
    ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    // CONSTRUCTORES
    public Liga(String nombre, String deporte){
        this.nombre = nombre;
        this.deporte = deporte;
    }

    // METODOS

    public void agregarEquipo(Equipo equipo){
        this.equipos.add(equipo);
    }

    public void removerEquipo(Equipo equipo){
        this.equipos.remove(equipo);
    }

    public void imprimirNombreEquipo(){
        for (int i = 0; i < this.equipos.size(); i++) {
            System.out.println(this.equipos.get(i).nombreEquipo);
        }
    }

}
