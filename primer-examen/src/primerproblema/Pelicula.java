package primerproblema;

import java.util.ArrayList;

public class Pelicula {

    // ATRIBUTOS
    String titulo;
    int duracion;
    int anio;
    String categoria;
    ArrayList<Actor> actores = new ArrayList<Actor>();

    // CONSTRUCTORES

    public Pelicula(String titulo, int duracion, int anio, String categoria) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.anio = anio;
        this.categoria = categoria;
    }

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    // METODOS

    public void agregarActor(Actor actor){
        this.actores.add(actor);
    }

    public void removerActor(Actor actor){
        this.actores.remove(actor);
    }

    public void mostrarActores(){
        System.out.println("Actores de la pelicula " + this.titulo);
        for (int i = 0; i < this.actores.size(); i++) {
            System.out.println(this.actores.get(i));
        }
    }

    // Sobreescritura del método toString

    @Override
    public String toString() {
        return "Pelicula: " + this.titulo + " (" + this.anio + ")";
    }

}
