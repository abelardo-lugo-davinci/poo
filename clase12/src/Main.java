public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuentaDeJose = new CuentaBancaria("José", "Ahorro", 45_000);

        System.out.println(cuentaDeJose.getTitular());
        System.out.println(cuentaDeJose.getTipoDeCuenta());
        System.out.println(cuentaDeJose.getSaldo());
        System.out.println();

        cuentaDeJose.setTitular("José");
        cuentaDeJose.setTipoDeCuenta("Nómina");
        cuentaDeJose.setSaldo(50_000);

        System.out.println(cuentaDeJose.getTitular());
        System.out.println(cuentaDeJose.getTipoDeCuenta());
        System.out.println(cuentaDeJose.getSaldo());
        System.out.println();

        CuentaBancaria cuentaDePablo = new CuentaBancaria("Pablo", 60_000);

        System.out.println(cuentaDePablo.getTitular());
        System.out.println(cuentaDePablo.getTipoDeCuenta());
        System.out.println(cuentaDePablo.getSaldo());
        System.out.println();

        CuentaBancaria cuentaDeDavid = new CuentaBancaria();

        System.out.println(cuentaDeDavid.getTitular());
        System.out.println(cuentaDeDavid.getTipoDeCuenta());
        System.out.println(cuentaDeDavid.getSaldo());
        System.out.println();

        cuentaDeDavid.setTitular("David");

        System.out.println(cuentaDeDavid.getTitular());
        System.out.println(cuentaDeDavid.getTipoDeCuenta());
        System.out.println(cuentaDeDavid.getSaldo());
        System.out.println();

        cuentaDeJose.mostrarPorPantalla();
        System.out.println();

        cuentaDeJose.mostrarPorPantalla("David");

        Pantalla.mostrarPantalla(5);
        Pantalla.mostrarPantalla("Hola");

    }
}
