package cuentas;

/**
 * La clase Main contiene el método principal (main) que se utiliza 
 * para probar la funcionalidad de la clase CCuenta.
 * 
 * @author Broz
 */
public class Main {

    /**
     * El método principal (main) crea una instancia de la clase CCuenta, 
     * realiza algunas operaciones con ella y muestra el saldo actual.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Declaración de variables
        CCuenta cuenta1;
        double saldoActual;

        // Crear una nueva instancia de la clase CCuenta
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        // Obtener el saldo actual de la cuenta y mostrarlo
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: " + saldoActual);

        // Realizar operaciones en la cuenta utilizando el método operativa_cuenta
        operativa_cuenta(cuenta1, 0);
    }

    /**
     * El método operativa_cuenta realiza operaciones de retiro e ingreso en la cuenta.
     * 
     * @param cuenta1   La cuenta en la que se realizarán las operaciones.
     * @param cantidad  La cantidad a ingresar en la cuenta.
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            // Intentar retirar una cantidad de la cuenta
            cuenta1.retirar(2300);
        } catch (Exception e) {
            // Capturar y mostrar cualquier excepción ocurrida durante el retiro
            System.out.print("Fallo al retirar");
        }
        try {
            // Intentar ingresar una cantidad en la cuenta
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            // Capturar y mostrar cualquier excepción ocurrida durante el ingreso
            System.out.print("Fallo al ingresar");
        }
    }
}
