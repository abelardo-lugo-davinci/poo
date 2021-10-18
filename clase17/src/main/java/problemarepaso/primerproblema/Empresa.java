package problemarepaso.primerproblema;

import java.util.ArrayList;

public class Empresa {

    // ATRIBUTOS
    private String nombre;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    // CONSTRUCTORES

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    // METODOS

    public void agregarClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void borrarClientes(Cliente cliente) {
        for (int i = 0; i < this.clientes.size(); i++) {
            if (cliente.getDni() == this.clientes.get(i).getDni()) {
                this.clientes.remove(i);
            }
        }

    }

    public void borrarClientes(double dni) {
        for (int i = 0; i < this.clientes.size(); i++) {
            if (dni == this.clientes.get(i).getDni()) {
                this.clientes.remove(i);
            }
        }
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

}
