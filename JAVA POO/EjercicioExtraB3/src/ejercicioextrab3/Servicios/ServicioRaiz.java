package ejercicioextrab3.Servicios;

import ejercicioextrab3.Entidades.Raiz;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class ServicioRaiz {

    //Metodo n° 1 
    public void crearRaices(Raiz r) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresar el Primer valor: ");
        r.setA(read.nextDouble());

        System.out.println("Ingresar el Segundo valor: ");
        r.setB(read.nextDouble());

        System.out.println("Ingresar el Tercer valor: ");
        r.setC(read.nextDouble());
    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0. */
    //Metodo n° 2
    public static boolean tieneRaices(Raiz r) {

        boolean check = false;

        if (r.discriminante() > 0) {
            check = true;
        }

        return check;

    }


    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
    para que esto ocurra, el discriminante debe ser igual que 0.*/
    //Metodo n° 3
    public static boolean tieneRaiz(Raiz r) {

        boolean check = false;

        if (r.discriminante() == 0) {
            check = true;
        }

        return check;

    }
    
    
    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
    posibles soluciones.*/
    //Metodo n° 4
    public  void obtenerRaices(Raiz r){
        
        //Formula: (-b±√((b^2)-(4*a*c)))/(2*a)
        
        if(tieneRaices(r)== true){
            
            double resultado1 = (-r.getB() + Math.sqrt(r.discriminante())) / 2 * r.getA();
            double resultado2 = (-r.getB() - Math.sqrt(r.discriminante())) / 2 * r.getA();
            
            System.out.println("Solución n°1: "+resultado1);
            System.out.println("Solución n°2: "+resultado2);
            
        }
        
        
    }
    
    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    Es en el caso en que se tenga una única solución posible.*/
    //Metodo n° 5
    public void obtenerRaiz(Raiz r){
        
        if(tieneRaiz(r) == true){
            double resultado = (-r.getB() + Math.sqrt(r.discriminante())) / 2 * r.getA();
            System.out.println("Solución: "+resultado);
        }
        
        
    }    
    
    
    
    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
    pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
    caso de no existir solución, se mostrará un mensaje.
    Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
    delante de -b*/
    //Metodo n° 6
    public void calcular(Raiz r){
        
        if (tieneRaices(r) == true) {
            obtenerRaices(r);
        } else if (tieneRaiz(r) == true) {
            obtenerRaiz(r);
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }
        
        
        
    }
    
    
}
