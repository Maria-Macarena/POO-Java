
/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos
*/
package ejercicioextrab2;

import ejercicioextrab2.Entidades.Punto;
import ejercicioextrab2.Servicios.ServicioPunto;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioExtraB2 {

    
    public static void main(String[] args) {
        
        
        
        Punto p = new Punto();
        
        ServicioPunto sp = new ServicioPunto();
        
        sp.crearPuntos(p);
        
        System.out.printf("Distancia: %.2f",sp.calcularDistancia(p));
        
        
    }
    
}
