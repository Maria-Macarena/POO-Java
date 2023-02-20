package ejercicioa4.Entidades;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class Rectangulo {

    //atributos
    private int base;
    private int altura;

    //constructores
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //get y set
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
}
