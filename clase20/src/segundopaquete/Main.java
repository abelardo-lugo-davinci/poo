package segundopaquete;

// import primerpaquete.Cubo;
// import primerpaquete.Ortoedro;
// import primerpaquete.TetraedroRegular;

import primerpaquete.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cubo nuevoCubo = new Cubo(4);

        nuevoCubo.arista = 6;

        System.out.println(nuevoCubo);

        Ortoedro nuevoOrtoedro = new Ortoedro(1, 2, 3);

        TetraedroRegular nuevoTetraedro = new TetraedroRegular(6);

        ArrayList <Integer> numeros = new ArrayList<Integer>();

        System.out.println();

    }

}
