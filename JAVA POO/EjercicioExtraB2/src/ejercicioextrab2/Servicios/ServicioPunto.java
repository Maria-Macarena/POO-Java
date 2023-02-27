package ejercicioextrab2.Servicios;

import ejercicioextrab2.Entidades.Punto;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class ServicioPunto {

    /*pide al usuario los dos números y los ingresa
en los atributos del objeto.*/
    //Metodo n°  1
    public void crearPuntos(Punto punto) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresar un valor para 'x': ");
        punto.setX(read.nextDouble());

        System.out.println("Ingresar un valor para 'x': ");
        punto.setX1(read.nextDouble());

        System.out.println("Ingresar un valor para 'x': ");
        punto.setY(read.nextDouble());

        System.out.println("Ingresar un valor para 'x': ");
        punto.setY1(read.nextDouble());

    }

    /*La distancia es igual a la Raiz cuadrada de la suma de la
    potencia cuadrada de la resta de x2 - x1, mas la
    potencia cuadrada de la resta de y2-y1: 
        d = √(x2-x1)^2+(y2-y1)^2 */
    public double calcularDistancia(Punto p) {
        
        double f1 = Math.pow((p.getX1() - p.getX()), 2)  ;
        double f2 = Math.pow((2+(p.getY1() - p.getY())), 2);

        double resultado =  Math.sqrt(f1 + f2) ;
        
        return resultado;
       
    }

}
