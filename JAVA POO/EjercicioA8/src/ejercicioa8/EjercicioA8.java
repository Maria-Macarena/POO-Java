/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/
package ejercicioa8;

import ejercicioa8.Entidades.Cadena;
import ejercicioa8.Servicios.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioA8 {

    public static void main(String[] args) {
      
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        Cadena c = new Cadena();
        
        ServicioCadena sc = new ServicioCadena();
        
        
        System.out.println("Ingresa una frase: ");
        String frase = read.next().toLowerCase();
        
        c.setFrase(frase);
        
        c.setLongitud(frase.length());
        
        sc.mostrarVocales(frase);
        
        sc.vocal(c);
        
        sc.invertirFrase(c);
        
        System.out.println("ingresa una letra para ver si se repite: ");
        String letra= read.next().toLowerCase();
        
        sc.vecesRepetido(letra, c);
        
        System.out.println("Ingresa una nueva frase para comparar la longitud: ");
        String newFrase = read.next().toLowerCase();
        
        System.out.println("son iguales? "+sc.compararLongitud(newFrase, c));
        
        System.out.println("Ingresa una nueva frase para concatenar: ");
        String oracion = read.next().toLowerCase();
        
        sc.unirFrases(oracion, c);
        
        System.out.println("Ingresa un caracter para reemplazar: ");
        String caracter = read.next().toLowerCase();
        
        sc.reemplazar(caracter, c);
        
        System.out.println("Ingresar una letra para buscarla dentro de la frase: ");
        String elemento= read.next().toLowerCase();
        
        System.out.println("Se encuentra la letra dentro de la frase? "+sc.contiene(elemento, c));
    }
    
}
