public class Coche extends Vehiculo {

    // ATRIBUTOS
    double velocidad;
    int cilindrada;

    // CONSTRUCTORES

    public Coche(String color, int ruedas, double velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }
}
