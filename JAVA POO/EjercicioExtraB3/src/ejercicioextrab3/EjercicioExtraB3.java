/*Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2do grado. 

Tendremos los 3 coeficientes como atributos, llamémosles a, b
y c. 

Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:

• Método discriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c

• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.

• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.

• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.

• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.

• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
caso de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b

NOTA:
a= 1                        1                       1
b= -5                       -2                      -6
c= 6                        1                       10
dos resultados 3 y 2        un resultado 1          no tiene solucion

*/
package ejercicioextrab3;

import ejercicioextrab3.Entidades.Raiz;
import ejercicioextrab3.Servicios.ServicioRaiz;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioExtraB3 {

    
    public static void main(String[] args) {
       
        
        Raiz r = new Raiz();
        
        ServicioRaiz sr = new ServicioRaiz();
        
        sr.crearRaices(r);
        
        //System.out.println("Discriminante: "+r.discriminante());
        
        //System.out.println("Tiene Raíces? "+sr.tieneRaices(r));
        
        //System.out.println("Tiene Raíz: "+sr.tieneRaiz(r));
        
        sr.obtenerRaices(r);
        
        sr.obtenerRaiz(r);
        
        
    }
    
}
