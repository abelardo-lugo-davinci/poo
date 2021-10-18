package problemarepaso.primerproblema;

public class Main {

    public static void main(String[] args) {

        Cliente primerCliente = new Cliente("Matías", 1);
        Cliente segundoCliente = new Cliente("José", 2);
        Cliente tercerCliente = new Cliente("Juan", 3);

        Empresa primeraEmpresa = new Empresa("Supermercado");

        System.out.println(primeraEmpresa.getClientes());
        primeraEmpresa.agregarClientes(primerCliente);
        primeraEmpresa.agregarClientes(segundoCliente);
        primeraEmpresa.agregarClientes(tercerCliente);
        System.out.println(primeraEmpresa.getClientes());

        primeraEmpresa.borrarClientes(2);
        System.out.println(primeraEmpresa.getClientes());

    }
}
