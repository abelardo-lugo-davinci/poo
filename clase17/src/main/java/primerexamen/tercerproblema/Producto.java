package primerexamen.tercerproblema;

public abstract class Producto {

    // Atributos: nombre, pvp.
    protected String nombre;
    protected double pvp;

    // CONSTRUCTORES
    public Producto(String nombre, double pvp) {
        this.nombre = nombre;
        this.pvp = pvp;
    }

    // METODOS
    public void rebajarPVP (double porcentaje) {
        this.pvp *= (1-porcentaje/100);
    }

    @Override
    public String toString() {
        return "Este producto es un " + this.nombre + " y su pvp es: " + this.pvp;
    }

}
