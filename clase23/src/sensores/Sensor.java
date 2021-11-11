package sensores;

public abstract class Sensor {

    // ATRIBUTOS
    private double presion;

    // CONSTRUCTORES
    public Sensor(){}

    public Sensor(double presion){
        this.presion = presion;
    }

    // METODOS

    // Setters
    public boolean setPresion(double presion){
        if (presion > 0){
            this.presion = presion;
            return true;
        } else {
            return false;
        }
    }

    // Getters
    public double getPresion(){
        return presion;
    }

}
