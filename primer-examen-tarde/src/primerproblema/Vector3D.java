package primerproblema;

public class Vector3D {

    // ATRIBUTOS
    Punto3D puntoInicial;
    Punto3D puntoFinal;

    // CONSTRUCTORES

    public Vector3D(Punto3D puntoInicial, Punto3D puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }

    public Vector3D(Punto3D puntoFinal) {
        this.puntoInicial = new Punto3D();
        this.puntoFinal = puntoFinal;
    }

    // METODOS

    public double magnitudVector(){
        return Math.sqrt(Math.pow(puntoFinal.x-puntoInicial.x,2)+Math.pow(puntoFinal.y-puntoInicial.y,2)+Math.pow(puntoFinal.z-puntoInicial.z,2));
    }

    public void mostrarComponentes(){
        System.out.println(this.puntoFinal.x-this.puntoInicial.x);
        System.out.println(this.puntoFinal.y-this.puntoInicial.y);
        System.out.println(this.puntoFinal.z-this.puntoInicial.z);
    }

    // Método toString

    @Override
    public String toString() {
        return "El vector comienza en el punto " + this.puntoInicial + " y termina en el punto " + this.puntoFinal;
    }

}
