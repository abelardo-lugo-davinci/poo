package empleados;

public abstract class Empleado {

    // ATRIBUTOS
    private String dni;
    private String nombre;

    // CONSTRUCTORES
    public Empleado(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }

    // METODOS

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

}
