package primerexamen.tercerproblema;

public class Alimento extends Producto {

    // Atributos: nombre, pvp, productor, distribuidor.
    String productor;
    String distribuidor;

    // CONSTRUCTOR
    public Alimento(String nombre, double pvp, String productor, String distribuidor) {
        super(nombre, pvp);
        this.productor = productor;
        this.distribuidor = distribuidor;
    }

    // METODOS
    @Override
    public void rebajarPVP(double porcentaje) {
        super.rebajarPVP(porcentaje);
    }

    @Override
    public String toString() {
        return "El artículo " + this.nombre + " y su distribuidor es " + this.distribuidor;
    }

}
