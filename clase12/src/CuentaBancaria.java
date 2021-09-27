public class CuentaBancaria {

    // ATRIBUTOS
    private String titular;
    private String tipoDeCuenta;
    private double saldo;

    // CONSTRUCTORES

    public CuentaBancaria(String titular, String tipoDeCuenta, double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular, double saldo) {
        // this(titular, "Ahorro",saldo);
        this.titular = titular;
        this.tipoDeCuenta = "Ahorro";
        this.saldo = saldo;
    }

    public CuentaBancaria() {
        // this(null,"Ahorro", 0);M
        this.tipoDeCuenta = "Ahorro";
        this.saldo = 0;
    }

    // METODOS

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarPorPantalla() {
        System.out.println("Hola " + this.titular + "\nTu saldo es: " + this.saldo);
    }

    public void mostrarPorPantalla(String palabra) {
        System.out.println("La cuenta de ese titular no existe.");
    }

    public void ingresarDinero(Double cantidad) {
        this.saldo += cantidad;
    }

    public void retirarDinero(Double cantidad) {
        this.saldo -= cantidad;
    }

    public Double obtenerSaldo() {
        return this.saldo;
    }

}
