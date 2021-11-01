package primerpaquete;

public class Main {

    public static void main(String[] args) {

        FiguraTridimensional figuraTridimensional = new FiguraTridimensional();
        // System.out.println(figuraTridimensional.dimensiones);

        Cubo primerCubo = new Cubo(2);
        System.out.println(primerCubo);
        // System.out.println(primerCubo.dimensiones);

        primerCubo.arista = 4;
        System.out.println(primerCubo);


    }

}
