
package ejercicioextrab4.Servicios;

import ejercicioextrab4.Entidades.Nif;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class ServicioNif {
    
    
    /*étodo crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
    corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
    resultado del calculo.*/
    //Metodo n°1
    public void crearNif(Nif n){
      
      Scanner read = new Scanner(System.in).useDelimiter("\n");
      
      System.out.println("Ingresa el número de DNI: ");
      n.setNumDni(read.nextLong()); 
      n.setLetra(calcular(n.getNumDni()));
      
      
    } 
    
    
    
    /*calcular la letra se toma el resto de dividir el
    número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
    buscar en un array (vector) de caracteres la posición que corresponda al resto de la
    división para obtener la letra correspondiente*/
    //Metodo n°2
    public static char calcular(long n){
        
       int indicadorLetra = (int) n % 23;
       
       char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z',
                         'S','Q','V','H','L','C','K','E'};
       
      
       return letras[indicadorLetra];
        
    }
    
    /*Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
    en mayúscula; por ejemplo: 00395469-F)*/
    //Metodo n°3
    public void mostrar(Nif n){
       
       System.out.println("NIF: "+n.getNumDni()+"-"+n.getLetra());
       
    } 
    
}
