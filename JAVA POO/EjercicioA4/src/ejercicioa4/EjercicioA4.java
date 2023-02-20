/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
package ejercicioa4;

import ejercicioa4.Entidades.Rectangulo;
import ejercicioa4.Servicios.ServicioRectangulo;


/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioA4 {

    
    public static void main(String[] args) {
       
        
        
        ServicioRectangulo sr = new ServicioRectangulo();
        
        Rectangulo rec = new Rectangulo();
        
        sr.crearReactangulo();
        System.out.println("");
        
        System.out.println("La Superficie del rectángulo es: "+sr.calcularSuperficie());
        System.out.println("");
        
        System.out.println("El perímetro del rectángulo es: "+sr.calcularPerimetro());
        System.out.println("");
        
        sr.dibujarRectangulo();
        System.out.println("");
        
   
    }
}
    
