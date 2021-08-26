public class Main {
    public static void main(String[] args) {

        /*
        CuentaBancaria cuentaDePablo = new CuentaBancaria();
        cuentaDePablo.titular = "Pablo Hernández";
        cuentaDePablo.tipoDeCuenta = "Ahorro";
        cuentaDePablo.saldo = 35_000;
        */

        CuentaBancaria cuentaDePablo = new CuentaBancaria("Pablo Hernández", "Ahorro", 35_000);

        System.out.println("El titular de la cuenta es: " + cuentaDePablo.titular);
        System.out.println("El tipo de cuenta es de: " + cuentaDePablo.tipoDeCuenta);
        System.out.println("El saldo de la cuenta es: " + cuentaDePablo.saldo);

        /*

        CuentaBancaria cuentaDeJose = cuentaDePablo;
        cuentaDeJose.titular = "José Pérez";

        System.out.println("El titular de la cuenta es: " + cuentaDeJose.titular);
        System.out.println("El tipo de cuenta es de: " + cuentaDeJose.tipoDeCuenta);
        System.out.println("El saldo de la cuenta es: " + cuentaDeJose.saldo);
        System.out.println(cuentaDePablo.titular);


        System.out.println(cuentaDePablo.saldo);
        cuentaDePablo.ingresarDinero(20_000);
        System.out.println(cuentaDePablo.saldo);
        cuentaDePablo.retirarDinero(5000);
        System.out.println(cuentaDePablo.saldo);

        double saldoConsultado = cuentaDePablo.consultarSaldo();
        System.out.println(saldoConsultado);

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.areaCirculo(5));
        System.out.println(calculadora.areaRectangulo(3,4));
        System.out.println(calculadora.promedio());

         */

    }
}
