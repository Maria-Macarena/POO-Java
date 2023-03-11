package ejercicioa12.Servicios;

import ejercicioa12.Entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.-
 */
public class ServicioPersona {

    /*Agregar un método de creación del objeto que respete la siguiente firma:
    crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
    al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
    que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
    public void crearPersona(Persona p){
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre: ");
        p.setNombre(read.next().toUpperCase());
        
        System.out.println("Ingresa la fecha de nacimiento en el siguiente formato");
        System.out.println("Día (Dos dígitos): ");
        int dia = read.nextInt();
        
        System.out.println("Mes (Dos dígitos): ");
        int mes = read.nextInt();
        
        System.out.println("Año (Cuatro dígitos): ");
        int anio = read.nextInt();
        
        LocalDate fechaNac= LocalDate.of(anio, mes, dia); 
        
        p.setFechaNacimiento(fechaNac);
    }
            
    /*Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
    Tener en cuenta que para conocer la edad de la persona también se debe
    conocer la fecha actual.*/
    public static int calcularEdad(Persona p){
        
        LocalDate fechaHoy = LocalDate.now();
        
        Period edad = Period.between(p.getFechaNacimiento(), fechaHoy);
         
        System.out.println("\nLa edad de la persona es: " + edad.getYears()) ;
        
        int edadCalculada = edad.getYears();
        
        return edadCalculada;
         
    }
    
    /*Agregar a la clase el método menorQue(int edad) que recibe como parámetro
    otra edad y retorna true en caso de que el receptor tenga menor edad que la
    persona que se recibe como parámetro, o false en caso contrario.*/
    public boolean menorQue(Persona p, Persona m){
        
        boolean check=false;
        
        if(calcularEdad(p) > calcularEdad(m)){
            check = true;
        }
        
        return check;
    }
    
    
}
