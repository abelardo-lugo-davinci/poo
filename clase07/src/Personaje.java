public class Personaje {

    // ATRIBUTOS DE LA CLASE PERSONAJE
    int puntosDeVida;
    int posicionX;
    int posicionY;

    // CONSTRUCTORES DE LA CLASE PERSONAJE

    public Personaje(int puntosDeVida, int posicionX, int posicionY) {
        this.puntosDeVida = puntosDeVida;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public Personaje(int posicionX, int posicionY) {
        this(100, posicionX, posicionY);
    }

    public Personaje() {
        this(100, 0, 0);
    }

    // MÉTODOS DE LA CLASE PERSONAJE

    public void aumentarPuntosDeVida(int puntos) {
        puntosDeVida += puntos;
    }

    public void moverPosicionX(int pasos) {
        posicionX += pasos;
    }

    public void moverPosicionY(int pasos) {
        posicionY += pasos;
    }

    public void mensaje() {
        System.out.println("Estamos en una guerra");
    }

}
