import java.util.ArrayList;

public class Profesor extends Usuario {

    // ATRIBUTOS
    private ArrayList<String> comisiones = new ArrayList<String>();

    // CONSTRUCTORES

    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }

    // MÉTODOS

    // Getters y Setters

    public ArrayList<String> getComisiones() {
        return comisiones;
    }

    public void setComisiones(ArrayList<String> comisiones) {
        this.comisiones = comisiones;
    }

    // Métodos abstractos
    // @Override
    // public void metodoAbstracto(){}

    // Métodos

    public void imprimirComisiones(){
        System.out.println("Comisiones");
        for (int i = 0; i < this.comisiones.size(); i++) {
            System.out.println(this.comisiones.get(i));
        }
    }

}
