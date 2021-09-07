public class Personaje {

    protected int puntosDeVida = 100;
    protected int posicionX = 0;
    protected int posicionY = 0;

    public Personaje(int puntosDeVida, int posicionX, int posicionY) {
        this.puntosDeVida = puntosDeVida;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public Personaje() {
    }

    public void aumentarPuntosDeVida(int puntos) {
        puntosDeVida += puntos;
    }

    public void moverX (int pasos) {
        posicionX += pasos;
    }

    public void moverY (int pasos) {
        posicionY += pasos;
    }

    public void mensaje() {
        System.out.println("Estamos en guerra");
    }

}
