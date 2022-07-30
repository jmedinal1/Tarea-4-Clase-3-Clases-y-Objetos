package Banco;

public class Test {
    public static void main(String[] args) {

        Cuentahabiente cuenta1 = new Cuentahabiente("Julio", "25252525",5000.00);
        System.out.println(cuenta1.mostrarDatos());
        System.out.println("Estado de cuenta: "+cuenta1.getActualizarSaldo()+"\n");
        System.out.println("---------------------------------------------------------------------------");

        Cuentahabiente cuenta2 = new Cuentahabiente("Juan", "26262626",1000.00);
        System.out.println(cuenta2.mostrarDatos());
        System.out.println("Estado de cuenta: "+cuenta2.getActualizarSaldo()+"\n");
        System.out.println("---------------------------------------------------------------------------");

        Cuentahabiente cuenta3 = new Cuentahabiente("William", "27272727",30000.00);
        System.out.println(cuenta3.mostrarDatos());
        System.out.println("Estado de cuenta: "+cuenta3.getActualizarSaldo()+"\n");
    }
}