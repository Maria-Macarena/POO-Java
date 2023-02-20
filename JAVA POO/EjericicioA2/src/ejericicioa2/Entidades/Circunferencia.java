/*


d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/
package ejericicioa2.Entidades;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class Circunferencia {
    
    //atributos
    private double radio;

    
    //constructores
    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    
    //get y set 
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    //metodo n°1 para ingresar el radio
    public void crearCircunferencia(double valor){
        
        setRadio(valor);
    }
    
    
    //método n° 2 para calcular el area
    public void calcularArea(double radio){
        
        Scanner read = new Scanner(System.in);
        
        Double area;
        
        area = Math.PI * Math.pow(radio,2);
        
        System.out.printf("El Área de la circunferencia es: %.2f",area);
        
    }
    
    
    //método n° 3 para calcular el el perimetro
    public void calcularPerimetro(double radio){
        
        Scanner read = new Scanner(System.in);
        
        Double perimetro;
        
        perimetro = 2 * Math.PI * radio;
        
        System.out.printf("El Perímetro de la circunferencia es: %.2f",perimetro);
        
    }
    
    
    
}
