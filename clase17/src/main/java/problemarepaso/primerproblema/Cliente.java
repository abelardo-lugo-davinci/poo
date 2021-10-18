package problemarepaso.primerproblema;

public class Cliente {

    // ATRIBUTOS
    private String nombre;
    private double dni;

    // CONSTRUCTRES

    public Cliente(String nombre, double dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Cliente() {
    }

    // METODOS

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
