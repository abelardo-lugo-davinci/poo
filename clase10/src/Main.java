import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tablero primerTablero = new Tablero();

        primerTablero.imprimirTablero();

        String palabra = "Hola";
        ArrayList<String> palabras = new ArrayList<String>();

        Double numeroReales = 4.6;
        ArrayList<Double> numerosReales = new ArrayList<Double>();

        int numeroCinco = 5;
        ArrayList<Integer> numeros = new ArrayList<Integer>();


        System.out.println(numeros);

        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        System.out.println(numeros);

        EstadoDelJuego estadoDelJuego = EstadoDelJuego.ACTIVO;
        System.out.println(estadoDelJuego);

    }
}
