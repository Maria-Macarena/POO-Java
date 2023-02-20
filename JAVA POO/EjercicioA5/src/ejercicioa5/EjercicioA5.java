/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicioa5;

import ejercicioa5.Entidades.Cuenta;
import ejercicioa5.Servicios.ServicioCuenta;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioA5 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        Cuenta cuenta = new Cuenta();
        
        ServicioCuenta c = new ServicioCuenta();
        
        double ingreso,retiro, monto;
        int op;

        
        System.out.println("BIENVENIDOS AL BANCO BERILO ROJO");
        System.out.println("");
        
        c.crearCuenta(cuenta);
        System.out.println("");

        do {
            
            System.out.println("");
            System.out.println("************************************************");
            System.out.println("SELECCIONAR UNA OPCIÓN DEL MENÚ");
            System.out.println("");
            System.out.println("1 - INGRESAR DINERO");
            System.out.println("2 - RETIRAR DINERO");
            System.out.println("3 - EXTRACCIÓN RÁPIDA");
            System.out.println("4 - CONSULTAR SALDO");
            System.out.println("5 - CONSULTAR DATOS DE LA CUENTA");
            System.out.println("6 - SALIR");
            op = read.nextInt();

            if (op != 1 && op != 2 && op != 3 && op != 4 && op != 5 && op != 6) {
                System.out.println("Error!!! Ingresa una opción correcta");
                System.out.println("1 - INGRESAR DINERO");
                System.out.println("2 - RETIRAR DINERO");
                System.out.println("3 - EXTRACCIÓN RÁPIDA");
                System.out.println("4 - CONSULTAR SALDO");
                System.out.println("5 - CONSULTAR DATOS DE LA CUENTA");
                System.out.println("6 - SALIR");
                op = read.nextInt();
            }
            
            

            switch (op) {
                case 1:
                    System.out.println("************************************************");
                    System.out.println("INGRESO DE DINERO");
                    System.out.println("Indica el monto que deseas ingresar: ");
                    ingreso = read.nextDouble();
                    c.ingresar(ingreso, cuenta);
                    break;
                case 2:
                    System.out.println("************************************************");
                    System.out.println("RETIRO DE DINERO");
                    System.out.println("Ingresa el monto que deseas retirar: ");
                    retiro = read.nextDouble();
                    c.retirar(retiro,cuenta);
                    break;
                case 3:
                    System.out.println("************************************************");
                    System.out.println("EXTRACCIÓN RÁPIDA");
                    System.out.println("Indica el monto que deseas retirar: ");
                    monto = read.nextDouble();
                    c.extraccionRapida(monto,cuenta);
                    break;
                case 4:
                    System.out.println("************************************************");
                    System.out.println("CONSULTAR SALDO");
                    c.consultarSaldo(cuenta);
                    break;
                case 5:
                    System.out.println("************************************************");
                    System.out.println("CONSULTAR DATOS DE LA CUENTA");
                    c.consultarDatos(cuenta);
                    break;
            }

        } while (op != 6);

        
        System.out.println("");

        
    }

}
