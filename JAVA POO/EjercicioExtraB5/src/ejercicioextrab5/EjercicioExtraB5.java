/*Crea un metodo donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!*/
package ejercicioextrab5;

import java.util.Scanner;

/**
 * @author Macarena Cardozo.
 */
public class EjercicioExtraB5 {

    public static void main(String[] args) {

        Adivinador();

    }

    public static void Adivinador() {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        int salir;

        do {
            
            String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO",
            "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        int indice = (int) (Math.random() * 12);
            System.out.println("ADIVINANDO MESES");

            System.out.println("prueba: " + meses[indice]);
            System.out.println("Ingresa el nombre de un mes y veamos que pasa: ");
            String opcion = read.next().toUpperCase();

            if (meses[indice].equals(opcion)) {
                System.out.println("Acertaste .!!!!!!");
            } else {
                System.out.println("Ohh, no es la opción correcta! Vuelve a intentarlo!!");

            }

            System.out.println("Si deseas salir del juego introduce el número 1, de lo "
                    + " contrario ingresa 2");
            salir = read.nextInt();

        } while (salir != 1);

    }

}
