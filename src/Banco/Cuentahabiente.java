/*
    La clase debe contar con los siguientes comportamientos (métodos):

    1. Constructor por defecto y constructor con DPI, saldo e interés
    2. Métodos Get y Set para cada atributo, excepto para el número de cuenta no tendrá método Set.
    3. actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés diario (interés anual dividido entre 365 aplicado al saldo actual).
    4. ingresar(double): permitirá realizar un crédito de una cantidad en la cuenta.
    5. retirar(double): permitirá realizar un débito de una cantidad de la cuenta (si y solo si tiene el saldo suficiente por lo que debe incluirlo).
    6. Método que nos permita mostrar todos los datos de la cuenta.

    Tomar en cuenta que el número de cuenta se asignará de forma correlativa a partir de 100001 desde el Constructor.

    Para probar este programa, deberá crear una Clase Test que tendrá un método main, en este método debe crear tres cuentas diferentes,
    a cada una le realizará una combinación diferente de ingresos y retiros, por último acutalizará el saldo y por último mostrará los datos de cada cuenta.
    Para esta tarea NO será necesario crear un menu para interactuar con el usuario.
 */

package Banco;

public class Cuentahabiente {

    //Atributos
    private static int no_cuenta = 100000;
    private String nombre;
    private String dpi;
    private double saldo;
    private static double interes = 0.20;

    //Métodos

    //Método constructor por defecto
    public Cuentahabiente(String nombre, String dpi, double saldo) {
        this.no_cuenta++;
        this.nombre = nombre;
        this.dpi = dpi;
        this.saldo = saldo;
        this.interes = interes;
    }

    //Método constructor DPI, saldo e interés

    public Cuentahabiente(String dpi, Double saldo, Double interes) {
        this.dpi = dpi;
        this.saldo = saldo;
        this.interes = interes;
    }

    //Método para obtener actualizacion de saldo con interés diario
    public double getActualizarSaldo(){
        double actualizarSaldo = saldo + ((0.05/365) * saldo);
        return actualizarSaldo;
    }

    //Método para realizar crédito a la cuenta
    public void setIngresarCredito(){
        double cantidad = 1000;
        double ingresarCredito = cantidad + getActualizarSaldo();
    }

    //Método para realizar débito a la cuenta
    public void setRetirarCredito(){
        double cantidad = 500;
        double retirarCredito = getActualizarSaldo() - cantidad;
    }

    //Método para mostrar datos
    public String mostrarDatos(){
        return "No. Cuenta: "+no_cuenta+"\nNombre: "+nombre+"\nDPI: "+dpi+"\nSaldo: "+saldo;
    }


    //Metodos GET y SET para cada atributo, excepto número de cuenta

    public int getNo_cuenta() {
        return no_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

}
