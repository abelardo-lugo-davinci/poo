import java.util.Scanner;

public class Juego {

    private int puntoDeJuego = 0;

    public int obtenerPuntuacion() {
        return puntoDeJuego;
    }

    public void mostrarPorPantalla () { System.out.println(puntoDeJuego); }

    public class Contador {

        void incrementarPuntuacion( int puntos) {
            puntoDeJuego += puntos;
        }

        void decrementarPuntuacion(int puntos) {
            puntoDeJuego -= puntos;
        }

        void resetearPuntuacion() {
            puntoDeJuego = 0;
        }

    }

}
