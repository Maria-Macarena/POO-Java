/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicioa6;

import ejercicioa6.Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioA6 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        Cafetera c = new Cafetera();
        int cantidad, op, agregar;

        System.out.println("Ingresa la cantidad máxima de la cafetera");
        c.setCapMax(read.nextInt());

        System.out.println("Ingresa la cantidad actual de la cafetera");
        c.setCapActual(read.nextInt());

        do {

            System.out.println("MENÚ DE NESPRESSO");
            System.out.println("1 - LLENAR CAFETERA");
            System.out.println("2 - SERVIR CAFÉ");
            System.out.println("3 - AGREGAR CAFÉ");
            System.out.println("4 - VACIAR CAFETERA");
            System.out.println("5 - MOSTRAR LA CANTIDAD DE CAFÉ ACTUAL");
            System.out.println("6 - SALIR");
            op = read.nextInt();

            if (op != 1 && op != 2 && op != 3 && op != 4 && op != 5 && op !=6) {

                System.out.println("¡Eror! Opción incorrecta, elige una "
                        + " opción");
                op = read.nextInt();
            }

            switch (op) {
                case 1:
                    System.out.println("***************************************");
                    System.out.println("");
                    c.llenarCafetera();
                    break;
                case 2:
                    System.out.println("***************************************");
                    System.out.println("");
                    System.out.println("Ingresa la cantidad que quieres servir: ");
                    cantidad = read.nextInt();

                    c.servirTaza(cantidad);
                    break;
                case 3:
                    System.out.println("***************************************");
                    System.out.println("");
                    System.out.println("Ingresa la cantidad de café que quieres agregar");
                    agregar = read.nextInt();

                    c.agregarCafe(agregar);
                    break;
                case 4:
                    System.out.println("***************************************");
                    System.out.println("");
                    c.vaciarCafetera();                   
                    break;
                case 5:   
                    System.out.println("***************************************");
                    System.out.println("");
                    
                    c.consultarCapActual();
                    break;

            }

        } while (op != 6);

    }

}
