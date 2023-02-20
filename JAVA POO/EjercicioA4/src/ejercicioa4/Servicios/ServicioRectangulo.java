
package ejercicioa4.Servicios;

import ejercicioa4.Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class ServicioRectangulo {
    
    
    Rectangulo r = new Rectangulo();
    
    //metodo n°1 pide los al usuario datos para crear el rectangulo
    public void crearReactangulo() {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresar la base del rectangulo: ");
        r.setBase(read.nextInt()); 

        System.out.println("Ingresar la altura del rectangulo: ");
        r.setAltura(read.nextInt()); 
    }

    //metodo n°2 calcula la superficie
    public int calcularSuperficie() {

        int seperficie = r.getBase() * r.getAltura();
        
        return seperficie;

    }

    //metodo n°3 calcula el perimetro
    public int calcularPerimetro() {

        int perimetro = (r.getBase()+ r.getAltura()) * 2;
        
        return perimetro;

    }

    //metodo n°4 dibuja un rectangulo con asteristicos tomando la base y altura
    public void dibujarRectangulo() {

        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {

                if (j == 0 || j == (r.getBase() - 1) || i == 0 || i == (r.getAltura() - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
}
