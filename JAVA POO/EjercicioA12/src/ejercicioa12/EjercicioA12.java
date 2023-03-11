/*Implemente la clase Persona. Una persona tiene un nombre y una fecha denacimiento (Tipo Date), 
constructor vacío, constructor parametrizado, get y set. Y los siguientes métodos:
Ejemplo Date como atributo: DateAtributo
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
package ejercicioa12;

import ejercicioa12.Entidades.Persona;
import ejercicioa12.Servicios.ServicioPersona;

/**
 *
 * @author Macarena Cardozo.-
 */
public class EjercicioA12 {

    public static void main(String[] args) {
       
        Persona p = new Persona();
        
        Persona m = new Persona();
        
        ServicioPersona sp = new ServicioPersona();
        
        sp.crearPersona(p);
        sp.crearPersona(m);
        
        System.out.println("");
        
        System.out.println(p.getNombre()+" Es mayor que "+m.getNombre()+"?: "+sp.menorQue(p, m));
       
        System.out.println("");
        
    }
    
}
