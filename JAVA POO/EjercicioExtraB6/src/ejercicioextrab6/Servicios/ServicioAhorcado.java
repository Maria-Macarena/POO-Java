
package ejercicioextrab6.Servicios;

import ejercicioextrab6.Entidades.Ahorcado;
import java.util.Scanner;



/**
 *
 * @author Macarena Cardozo.
 */
public class ServicioAhorcado {
    
   
    
    private static char[] mostrar = new char[40];
    
    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
    palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
    el valor que ingresó el usuario y encontradas en 0.*/
    //Metodo n°1
    public Ahorcado crearJuego(){
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresar la palabra: ");
        String palabra = read.next().toUpperCase();
        
        int longitud = palabra.length();
     
        char [] letras = palabra.toCharArray();//lo convierto en un array de caracteres
        
        for(int i=0;i<letras.length;i++){
            mostrar [i] = '-';
        }
        
        System.out.println("Dime la cantidad de jugadas máximas: ");
        int jugadasMax = read.nextInt();
        
        int encontradas = 0;
        
        return new Ahorcado (letras,encontradas,longitud,jugadasMax);
        
    }
    
    
    
    
    
    /*Método longitud(): muestra la longitud de la palabra que se debe encontrar*/
    //Metodo n°2
    public static void longitud(Ahorcado a){
        
        System.out.println("La longitud de la palabra a adivinar es: "+a.getLongitud());
        
    }
    
    /*Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
    //Metodo n°3
    public static boolean buscar( Ahorcado a, char letra){
        
        
        
        for(int i=0;i<a.getPalabra().length;i++){
            
            if(a.getPalabra()[i] == letra){
                return true;
            }
            
        }
        
        return false;
        
    }
    
    
    /* Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.*/
    //Metodo n°4
    public static void encontradas(Ahorcado a){
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        int encontradas = a.getLetrasEncontradas();
        int intentos = a.getJugadasMaximas();
        
         System.out.println("Ingresa la letra a buscar");
        char letra = read.next().toUpperCase().charAt(0);
        
        if(buscar(a,letra)){
            
            
            System.out.println("La letra ingresada SI se encuentra");
            
            for(int i=0;i < a.getPalabra().length;i++){
                if (letra == a.getPalabra()[i]) {
                    encontradas++;
                    mostrar[i] = letra;//asigno la letra al vector mostrar
                }
            }
            encontradas += a.getLetrasEncontradas();
            a.setLetrasEncontradas(encontradas);
            
        }else{
            System.out.println("La letra ingresada NO se encuentra");
            intentos --;
            a.setJugadasMaximas(intentos);
        }
        
        for(int i=0;i<a.getPalabra().length;i++){
            System.out.print(mostrar[i]);
        }
        
        System.out.println("");
    }
    
    /*Método intentos(): para mostrar cuantas oportunidades le queda al jugador.*/
    //Metodo n°5
    public void intentos(Ahorcado a){
         
        System.out.println("Intentos: "+a.getJugadasMaximas());
    }
    
    
    /*Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos.*/
    //Metodo n°6
    public void juego(Ahorcado a){
        
         while (a.getJugadasMaximas() > 0) {
            encontradas(a);
            longitud(a);
            intentos(a);
            if (a.getJugadasMaximas() > 1 && a.getLetrasEncontradas() == a.getPalabra().length) {
                System.out.println("MUY BIEN Ganaste!");
                break;
            }
            if (a.getJugadasMaximas() == 0) {
                System.out.println("Ahorcado!");
                break;
            }

        }
        
        
        
        
    }
}
