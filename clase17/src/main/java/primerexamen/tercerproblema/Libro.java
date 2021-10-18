package primerexamen.tercerproblema;

public class Libro extends Producto {

    // Atributos: nombre, pvp, isbn.
    int isbn;

    // CONSTRUCTORES
    public Libro(String nombre, double pvp, int isbn) {
        super(nombre, pvp);
        this.isbn = isbn;
    }

    // METODOS
    @Override
    public void rebajarPVP(double porcentaje) {
        super.rebajarPVP(porcentaje);
    }

    @Override
    public String toString() {
        return "El " + this.getClass().getSimpleName() + " se llama " + this.nombre + " y su isbn es: " + this.isbn;
    }

}
