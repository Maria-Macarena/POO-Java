
package ejercicioa9.Servicios;

import ejercicioa9.Entidades.Matematica;

/**
 *
 * @author Macarena Cardozo.
 */
public class ServicioMatematica {
    
    
    /*
    Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
    */
    //Metodo n°1
    public double devolverMayor(double num1, double num2){
        
        double numMayor = Math.max(num1, num2);
        
        return numMayor;
        
    }
    
    /*
    Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
    */
    //Metodo n°2
    public void calcularPotencia(Matematica mate){
        
        double numMayor = Math.max(mate.getNum1(), mate.getNum2());
        double numMenor = Math.min(mate.getNum1(), mate.getNum2());
        
        double mayor= Math.round(numMayor);
        double menor= Math.round(numMenor);
        
        double resultado = Math.pow(mayor, menor);
        
        System.out.println(mayor+" elevado a "+menor+" es igual a: "+resultado);
    }
    
    /*
     Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    //Metoda n°3
    public void calculaRaiz(Matematica mate){
        
        double valor = Math.min(mate.getNum1(), mate.getNum2());
        
        double num = Math.abs(valor);
        
        double resultado = Math.pow(num, 2);
        
        System.out.println("La raíz cuadrada de "+valor+" es igual a: "+resultado);
        
    }
    
}
