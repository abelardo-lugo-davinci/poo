public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuentaDePablo = new CuentaBancaria("Pablo Hernández", "Ahorro", 35_000);

        /*
        cuentaDePablo.titular = "Pablo Hernández";
        cuentaDePablo.tipoDeCuenta = "Ahorro";
        cuentaDePablo.saldo = 35_000;
        */

        System.out.println(cuentaDePablo.titular);
        System.out.println(cuentaDePablo.tipoDeCuenta);
        System.out.println(cuentaDePablo.saldo);

        /*
        cuentaDePablo.ingresarDinero(50_000);
        System.out.println(cuentaDePablo.saldo);

        cuentaDePablo.retirarDinero(20_000);
        System.out.println(cuentaDePablo.saldo);

        cuentaDePablo.cambiarTipoDeCuenta("Nómina");
        System.out.println(cuentaDePablo.tipoDeCuenta);

        System.out.println(cuentaDePablo.consultarSaldo());
        */
        /*
        int numero1 = 34;
        int numero2 = numero1;

        System.out.println(numero1);
        System.out.println(numero2);

        numero2 = 76;

        System.out.println(numero1);
        System.out.println(numero2);


        CuentaBancaria cuentaDeJuan = new CuentaBancaria();
        cuentaDeJuan.titular = "Juan Picapiedra";
        cuentaDeJuan.tipoDeCuenta = "Nómina";
        cuentaDeJuan.saldo = cuentaDePablo.saldo;

        System.out.println(cuentaDePablo.saldo);
        System.out.println(cuentaDeJuan.saldo);

        cuentaDePablo.saldo = 50_000;

        System.out.println(cuentaDePablo.saldo);
        System.out.println(cuentaDeJuan.saldo);
        */


        /*
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcularAreaCirculo(5));

        double areaRectangulo = calculadora.calcularAreaRectangulo(3,4);
        System.out.println((areaRectangulo));

        double resultadoPromedio = calculadora.promedio();
        System.out.println(resultadoPromedio);
        */
        // Comentario de una línea
        /*
            Comentario multilínea
         */

    }
}
