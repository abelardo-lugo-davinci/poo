public abstract class Producto {

    // ATRIBUTOS
    protected String nombre;
    protected double precio;

    // CONSTANTES
    static final double IVA = 0.15;

    // CONSTRUCTORES

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    // METODOS

    public static double getIVA() {
        return IVA;
    }

    public void mostrarIVA(){
        System.out.println("El IVA de los productos es " + IVA);
    }

    // METODO ABSTRACTO

    public abstract void rebajarPrecio(double porcentaje);

}
