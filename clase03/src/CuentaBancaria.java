public class CuentaBancaria {

    String titular;
    String tipoDeCuenta;
    double saldo;

    CuentaBancaria(String titular, String tipoDeCuenta, double saldo){
        this.titular = titular;
        this.tipoDeCuenta= tipoDeCuenta;
        this.saldo = saldo;
    }

    void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    void retirarDinero(double cantidad) {
        saldo -= cantidad;
    }

    void cambiarTipoDeCuenta(String nuevoTipo) {
        tipoDeCuenta = nuevoTipo;
    }

    double consultarSaldo() {
        return saldo;
    }

}
