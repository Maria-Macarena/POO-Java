/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/
package ejericicioa2;

import ejericicioa2.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjericicioA2 {

  
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        Circunferencia cir = new Circunferencia();
        
        
        
        System.out.println("Ingresá el valor del radio: ");
        double radio = read.nextDouble();
        
        
        cir.crearCircunferencia(radio);
        
        System.out.println("");
        cir.calcularArea(radio);
        
        System.out.println("");
        cir.calcularPerimetro(radio);
        
        System.out.println("");
        
        
    }
    
}
