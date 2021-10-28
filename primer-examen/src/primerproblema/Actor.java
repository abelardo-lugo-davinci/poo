package primerproblema;

public class Actor {

    // ATRIBUTOS
    String nombre;
    String apellido;
    String pais;
    int anioNacimiento;

    // CONSTRUCTORES

    public Actor(String nombre, String apellido, String pais, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.anioNacimiento = anioNacimiento;
    }

    // METODOS

    public int calcularEdad(int anioActual){
        return anioActual - this.anioNacimiento;
    }

    // Sobreescritura del método toString

    @Override
    public String toString() {
        return "Actor: " + this.nombre + " " + this.apellido + " (" +this.pais + ")";
    }

}
