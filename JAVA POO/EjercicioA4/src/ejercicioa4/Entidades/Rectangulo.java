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

    //metodo n°1 pide los al usuario datos para crear el rectangulo
    public void crearReactangulo() {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresar la base del rectangulo: ");
        base = read.nextInt();

        System.out.println("Ingresar la altura del rectangulo: ");
        altura = read.nextInt();
    }

    //metodo n°2 calcula la superficie
    public int calcularSuperficie() {

        int seperficie = base * altura;
        
        return seperficie;

    }

    //metodo n°3 calcula el perimetro
    public int calcularPerimetro() {

        int perimetro = (base + altura) * 2;
        
        return perimetro;

    }

    //metodo n°4 dibuja un rectangulo con asteristicos tomando la base y altura
    public void dibujarRectangulo() {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {

                if (j == 0 || j == (base - 1) || i == 0 || i == (altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
