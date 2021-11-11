package sensores;

public abstract class Sensor {

    // ATRIBUTOS
    private double presionLectura;

    // CONSTRUCTORES
    public Sensor(){}

    public Sensor(double presionLectura){
        this.presionLectura = presionLectura;
    }

    // METODOS

    // Setters
    public boolean setPresion(double presionLectura){
        if(presionLectura > 0){
            this.presionLectura = presionLectura;
            return true;
        } else{
            return false;
        }
    }

    // Getters
    public double getPresionLectura(){
        return presionLectura;
    }

}
