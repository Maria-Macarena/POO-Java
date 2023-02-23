/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
*/
package ejercicioa10;


import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioA10 {

   
    public static void main(String[] args) {
        
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        
        double a [] = new double [50];
        double b [] = new double [20];
        
        
        llenarVectorA(a);
        
        System.out.println("Vector A");
        
        imprimirVector(a);
        
        System.out.println("");
        System.out.println("");
        
        
        ordenarVector(a);
        
        System.out.println("Vector A - Ordenado");
        
        imprimirVector(a);
        
        System.out.println("");
        System.out.println("");
        
        llenarArregloBPrimeraParte(a, b);
        
        System.out.println("Vector B - Primera Parte");
        
        imprimirVector(b);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Vector B - Segunda Parte");
        
        llenarArregloBSegundaParte(b);
        
        imprimirVector(b);
        
    }
    
    //Metodo n°1
    public static void llenarVectorA(double [] vector){
        
        for(int i=0;i<vector.length;i++){
            
            vector[i] = Math.round((Math.random()) *50);
        }
    }
    
    //Metodo n°2
    public static void imprimirVector(double [] vector){
        
        for(int i=0;i<vector.length;i++){
            
            System.out.print("[ "+vector[i]+" ]");
        }
        
    }
    
    //Metodo n°3
    public static void ordenarVector(double [] vector){
        
        Arrays.sort(vector);
        
    }
    
    public static void llenarArregloBPrimeraParte(double [] a, double [] b){
        
        
        //System.arraycopy(arregloOrigen - posInicial del arregloOrigen - arregloDestino -posInicial 
        //del arregloDestino - cantidad de elementos a copiar);
        System.arraycopy(a, 0, b, 0, 10);
        
        
    }
    
    public static void llenarArregloBSegundaParte(double [] b){
        
        
        Arrays.fill(b, 10, 20, 0.5);
        
    }
    
    
    
    
    
}
