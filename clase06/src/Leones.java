public class Leones extends Enemigo {

    public Leones(int puntosDeVida, int posicionX, int posicionY) {
        super(puntosDeVida, posicionX, posicionY);
    }

    public Leones() {
    }

    @Override
    public void mensaje() {
        System.out.println("Gggggrrrrrr");;
    }

}
