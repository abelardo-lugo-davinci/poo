package empleados;

public class EmpleadoTiempoParcial extends Empleado {

    // ATRIBUTOS
    private double pagoPorHora;

    // CONSTRUCTORES
    public EmpleadoTiempoParcial(String dni, String  nombre, double pagoPorHora){
        super(dni, nombre);
        this.pagoPorHora = pagoPorHora;
    }

    // METODOS

    // Setters
    public void setPagoPorHora(double pagoPorHora){
        this.pagoPorHora = pagoPorHora;
    }

    // Getters
    public double getPagoPorHora(){
        return pagoPorHora;
    }

    // Métodos
    public double calcularPagoSemanal(int horasTrabajadas){
        return pagoPorHora*horasTrabajadas;
    }

}
