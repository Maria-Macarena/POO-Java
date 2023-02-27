
package ejercicioextrab3.Entidades;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class Raiz {
   
    //atributos    
    private double a;
    private double b;
    private double c;
    
    // constructores
    public Raiz() {
    }

    public Raiz(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    //get y set

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    /*Método discriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c */
    //Metodo n° 1 
    public double discriminante(){
        
        double discriminante = (Math.pow(b, 2)) - 4 * a * c ;
        
        return discriminante;
    }
    
    
}
