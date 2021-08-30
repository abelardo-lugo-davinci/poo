public class CuentaBancaria {

    String titular;
    String tipoDeCuenta;
    double saldo;

    /*
    public static final String TIPO_AHORRO = "ahorro";
    public static final String TIPO_NOMINA = "nómina";
    */

    CuentaBancaria(String titular, String tipoDeCuenta, double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }

    CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = "Ahorro";
        this.saldo = saldo;
    }

    CuentaBancaria() {
        this.tipoDeCuenta = "Ahorro";
    }

    void sacarDinero(double cantidad) {
        if (cantidad < 0) {
            return;
        }
        if (cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    double obtenerSaldo() {
        return saldo;
    }

}
