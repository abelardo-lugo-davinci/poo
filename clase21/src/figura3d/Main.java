package figura3d;

public class Main {

    public static void main(String[] args) {

        System.out.println(FiguraTridimensional.DIMENSIONES);
        System.out.println(Ortoedro.DIMENSIONES);
        System.out.println(Ortoedro.CARAS);

        Ortoedro ortoedro = new Ortoedro(1, 2, 3);
        System.out.println(ortoedro);
        System.out.println(ortoedro.calcularVolumen());
        System.out.println(ortoedro.calcularArea());

        Cubo primerCubo = new Cubo(2);
        System.out.println(primerCubo);
        System.out.println(primerCubo.calcularVolumen());
        System.out.println(primerCubo.calcularArea());

        TetraedroRegular tetraedroRegular = new TetraedroRegular(3);
        System.out.println(tetraedroRegular);
        System.out.println(tetraedroRegular.calcularVolumen());
        System.out.println(tetraedroRegular.calcularArea());

        System.out.println(Math.PI);
        System.out.println(Math.sqrt(64));

        Cubo segundoCubo = new Cubo(12);

        System.out.println(Cubo.CARAS);
        System.out.println(primerCubo.CARAS);
        System.out.println(segundoCubo.CARAS);

    }

}
