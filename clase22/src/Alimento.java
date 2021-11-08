public class Alimento extends Producto{

    // ATRIBUTOS
    private String productor;
    private String distribuidor;

    // CONSTRUCTORES
    public Alimento(String nombre, double precio, String productor, String distribuidor){
        super(nombre, precio);
        this.productor = productor;
        this.distribuidor = distribuidor;
    }

    // Getters y Setters

    public String getProductor(){
        return productor;
    }

    public void setProductor(String productor){
        this.productor = productor;
    }

    public String getDistribuidor(){
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor){
        this.distribuidor = distribuidor;
    }

    // Métodos abstractos
    @Override
    public void rebajarPrecio(double porcentaje){
        this.precio *= 1 - porcentaje/100;
    }

    // Método toString
    @Override
    public String toString(){
        return "Este producto se llama " + this.nombre + ", su precio es " + this.precio + " y es distribuido por " + this.distribuidor;
    }

}
