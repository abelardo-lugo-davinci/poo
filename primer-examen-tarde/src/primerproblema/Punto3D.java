package primerproblema;

public class Punto3D {

    // ATRIBUTOS
    double x;
    double y;
    double z;

    // CONSTRUCTORES

    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Punto3D(double w) {
        // this(w,w,w);
        this.x = w;
        this.y = w;
        this.z = w;
    }

    public Punto3D() {
        // this(0,0,0);
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // METODOS

    public double distanciaDesdeOrigen(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2));
    }

    public double distanciaDesdeOtroPunto(double x, double y, double z){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)+Math.pow(this.z-z,2));
    }

    public double distanciaDesdeOtroPunto(Punto3D otroPunto){
        return Math.sqrt(Math.pow(this.x-otroPunto.x,2)+Math.pow(this.y-otroPunto.y,2)+Math.pow(this.z-otroPunto.z,2));
    }

    // Método toString

    @Override
    public String toString() {
        return "("+ this.x + ";"+this.y + ";" + this.z +")";
    }

}
