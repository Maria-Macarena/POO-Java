/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. 
Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. 
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
*/
package ejercicioa7;

import ejercicioa7.Entidades.Persona;
import ejercicioa7.Servicios.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioA7 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ServicioPersona sp = new ServicioPersona();
        int pesoIdeal = 0;
        int pesoAlto = 0;
        int pesoBajo = 0;
        int esMayor = 0;
        int esMenor = 0;
        double porcentajePesoIdeal;
        double porcentajePesoAlto;
        double porcentajePesoBajo;
        double porcentajeEsMayor;
        double porcentajeEsMenor; 
        
        Persona p1 =  sp.crearPersona();
        Persona p2 =  sp.crearPersona();
        Persona p3 =  sp.crearPersona();
        Persona p4 =  sp.crearPersona();
        
        System.out.println("****************************************************");
        System.out.println("");
        sp.mostrarPersona(p1);
        
        System.out.println("");
        System.out.println("****************************************************");
        sp.mostrarPersona(p2);
        
        System.out.println("");
        System.out.println("****************************************************");
        sp.mostrarPersona(p3);
        
        System.out.println("");
        System.out.println("****************************************************");
        sp.mostrarPersona(p4);
        
        int[] vectorImc = new int[4];
        vectorImc[0] = sp.calcularIMC(p1);
        vectorImc[1] = sp.calcularIMC(p2);
        vectorImc[2] = sp.calcularIMC(p3);
        vectorImc[3] = sp.calcularIMC(p4);
        
        
       boolean[] vectorEsMayor = new boolean[4];  
        vectorEsMayor[0] = sp.esMayorDeEdad(p1);
        vectorEsMayor[1] = sp.esMayorDeEdad(p2);
        vectorEsMayor[2] = sp.esMayorDeEdad(p3);
        vectorEsMayor[3] = sp.esMayorDeEdad(p4);
        
        
        for (int i=0; i<4; i++){
            switch (vectorImc[i]){
                case -1: pesoIdeal = pesoIdeal + 1;
                break;
                case 0: pesoBajo = pesoBajo + 1;
                break;
                case 1: pesoAlto = pesoAlto + 1;
                break;                   
            }
        }
        
        
        porcentajePesoIdeal = (pesoIdeal * 100)/ 4;
        porcentajePesoAlto = (pesoAlto * 100)/ 4;
        porcentajePesoBajo = (pesoBajo * 100)/ 4;
        
        
        
        for (int i=0; i<4; i++){
            if(vectorEsMayor[i]==true){
                esMayor = esMayor + 1;
                              
            }else esMenor = esMenor + 1;
        }
        
        porcentajeEsMayor = (esMayor * 100)/ 4;
        porcentajeEsMenor = (esMenor * 100)/ 4;
        
        System.out.println("EL PORCENTAJE DE PERSONAS CON PESO IDEAL ES: "+porcentajePesoIdeal+"%");
        System.out.println("EL PORCENTAJE DE PERSONAS CON PESO ALTO ES: "+porcentajePesoAlto+"%");
        System.out.println("EL PORCENTAJE DE PERSONAS CON PESO BAJO ES: "+porcentajePesoBajo+"%");
        System.out.println("EL PORCENTAJE DE PERSONAS MAYORES: "+porcentajeEsMayor+"%");
        System.out.println("EL PORCENTAJE DE PERSONAS MENORES: "+porcentajeEsMenor+"%");
    
    }
    
}
