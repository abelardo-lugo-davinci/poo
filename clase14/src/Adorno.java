public class Adorno extends Producto {

    // Atributos: nombre, pvp.

    // CONSTRUCTORES
    public Adorno(String nombre, double pvp) {
        super(nombre, pvp);
    }

    // METODOS
    @Override
    public void rebajarPVP(double porcentaje) {
        System.out.println("Los adornos no tienen rebaja de pvp");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
