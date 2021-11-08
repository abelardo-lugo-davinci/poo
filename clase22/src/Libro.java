public class Libro extends Producto{

    // ATRIBUTOS
    String isbn;

    // CONSTRUCTORES
    public Libro(String nombre, double precio, String isbn){
        super(nombre, precio);
        // this.nombre = nombre;
        // this.precio = precio;
        this.isbn = isbn;
    }

    // Getters y Setters

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // METODOS

    //Método Abstracto
    @Override
    public void rebajarPrecio(double porcentaje){
        this.precio *= (1 - porcentaje/100);
    }

}
