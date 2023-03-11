/*Vamos a trabajar solo conla clase Date. En este ejercicio deberemos instanciar en 
el main, una fecha usando la clase Date, para esto vamos a tener que crear 3 variables, 
dia, mes y anio que se le pedirán al usuario para poner el constructor del objeto Date. 
Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay 
entre esa fecha y la fecha actual, que se puede conseguir instanciando un objeto Date 
con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/
package ejercicioa11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.-
 */
public class EjercicioA11 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un día (2 digitos): ");   
        byte diaI = read.nextByte();
        System.out.println("Ingrese un mes (2 digitos): ");   
        byte mesI = read.nextByte();
        System.out.println("Ingrese un año (4 digitos): ");   
        int anioI = read.nextInt();
        
        
        // Para cargar fecha
        LocalDate fechaI= LocalDate.of(anioI, mesI, diaI);        
        
        
        //Para conocer cuanto tiempo paso 
        LocalDate fechaHoy = LocalDate.now();
        
        Period periodoT = Period.between(fechaI, fechaHoy);
         
        System.out.println("\n Tiempo trasncurrido desde su fecha ingresada a HOY: " +fechaHoy+
                           "\n Años transcurridos: " + periodoT.getYears()) ;
        
        
        
        
        
        
        
        
    }
    
}
