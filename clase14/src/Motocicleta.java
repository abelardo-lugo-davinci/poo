public class Motocicleta extends Vehiculo {

    // ATRIBUTOS
    double velocidad;
    int cilindrada;

    // CONSTRUCTORES
    public Motocicleta(String color, int ruedas, double velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

}
