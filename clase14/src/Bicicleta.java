public class Bicicleta extends Vehiculo {

    // ATRIBUTOS
    String tipo;
    // TipoDeBicicleta tipo;

    // CONSTRUCTORES
    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }
}
