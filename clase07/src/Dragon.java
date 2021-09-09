public class Dragon extends Enemigo {

    public Dragon(int puntosDeVida, int posicionX, int posicionY) {
        super(puntosDeVida, posicionX, posicionY);
    }

    @Override
    public void mensaje() {
        System.out.println("Ggggrrrrr");
    }

}
