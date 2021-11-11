package sensores;

public class SensorSeguro extends Sensor {

    // ATRIBUTO
    private double presionMaxima;

    // CONSTRUCTORES
    public SensorSeguro(double presionMaxima){
        this.presionMaxima = presionMaxima;
    }

    public SensorSeguro(double presionMaxima, double presionLectura){
        super(presionLectura);
        this.presionMaxima = presionMaxima;
    }

    // METODOS

    // Setters
    public boolean setPresionLectura(double presionLectura){
        if (presionLectura < presionMaxima){
            setPresion(presionLectura);
            return true;
        } else {
            return false;
        }
    }

    // Getters
    public double getPresionMaxima(){
        return presionMaxima;
    }

}
