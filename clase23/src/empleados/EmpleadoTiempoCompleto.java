package empleados;

public class EmpleadoTiempoCompleto extends Empleado {

    // ATRIBUTOS
    private double salarioAnual;

    // CONSTRUCTORES
    public EmpleadoTiempoCompleto(String dni, String nombre, double salarioAnual){
        super(dni, nombre);
        this.salarioAnual = salarioAnual;
    }

    // METODOS

    // Setters
    public void setSalarioAnual(double salarioAnual){
        this.salarioAnual = salarioAnual;
    }

    // Getters
    public double getSalarioAnual(){
        return salarioAnual;
    }

    // Métodos
    public double calcularPagoMensual(){
        return salarioAnual/12;
    }

}
