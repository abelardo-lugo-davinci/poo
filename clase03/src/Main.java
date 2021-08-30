public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuentaDeFranco = new CuentaBancaria("Franco", "Ahorro", 34_000);
        CuentaBancaria cuentaDeJose = new CuentaBancaria("Jose", 45_000);
        CuentaBancaria cuentaDePablo = new CuentaBancaria();

        Informador informador = new Informador();
        informador.mostrarPorPantalla(3);
        informador.mostrarPorPantalla(4.5);
        informador.mostrarPorPantalla("Hola");
        informador.mostrarPorPantalla("Hola", 4.5);
    }
}
