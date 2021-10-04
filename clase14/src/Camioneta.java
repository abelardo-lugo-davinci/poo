public class Camioneta extends Vehiculo {

    // ATRIBUTOS
    String carga;

    // CONSTRUCTORES

    public Camioneta(String color, int ruedas) {
        super(color, ruedas);
    }

    public Camioneta(String color, int ruedas, String carga) {
        // this(color, ruedas, carga);
        super(color, ruedas);
        this.carga = carga;
    }

}
