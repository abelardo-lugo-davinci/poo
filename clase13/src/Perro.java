public class Perro {

    // ATRIBUTOS
    String nombre;
    String raza;
    int edad;
    String color;

    // CONSTRUCTORES

    public Perro(String nombre, String raza, int edad, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    public Perro() {
    }

    // METODOS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Este Perro se llama " + nombre +" y es un " + raza + " y tiene " + edad + " años.";
    }

    public static void main(String[] args) {

    Perro vigilante = new Perro("Vigilante","Pastor Alemán", 4,"Marrón");

        System.out.println(vigilante.toString());

    }
}
