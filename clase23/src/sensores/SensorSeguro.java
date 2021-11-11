package sensores;

public class SensorSeguro extends Sensor {

    // ATRIBUTO
    private double maximo;

    // CONSTRUCTORES
    public SensorSeguro(double maximo){
        super();
        this.maximo = maximo;
    }

    public SensorSeguro(double maximo, double presion){
        super(presion);
        this.maximo = maximo;
    }

    // METODOS

    // Setters
    public boolean setPresionLectura(double presion){
        if (presion < maximo){
            setPresion(presion);
            return true;
        } else {
            return false;
        }
    }

    // Getters
    public double getMaximo(){
        return maximo;
    }

}
