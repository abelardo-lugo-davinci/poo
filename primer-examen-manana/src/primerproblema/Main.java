package primerproblema;

public class Main {

    public static void main(String[] args) {

        Actor primerActor = new Actor("John", "Doe", "Argentina", 1985);
        Actor segundoActor = new Actor("John", "Doe", "Argentina", 1985);
        Actor tercerActor = new Actor("John", "Doe", "Argentina", 1985);
        Actor cuartoActor = new Actor("John", "Doe", "Argentina", 1985);

        Pelicula primeraPelicula = new Pelicula("Titanic", 120, 2000, "Romance");
        Pelicula segundaPelicula = new Pelicula("El Rey León", 120, 2000, "Infantil");

        Cine nuevoCine = new Cine("Nuevo Cine", "Buenos Aires");

        primeraPelicula.agregarActor(primerActor);
        primeraPelicula.agregarActor(segundoActor);
        segundaPelicula.agregarActor(tercerActor);
        segundaPelicula.agregarActor(cuartoActor);

        nuevoCine.agregarPelicula(primeraPelicula);
        nuevoCine.agregarPelicula(segundaPelicula);

        primeraPelicula.mostrarActores();
        segundaPelicula.mostrarActores();
        nuevoCine.mostrarPeliculas();

    }

}
