package ejercicioa1.Entidades;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class Libro {

    //atributos
    private int isbn;
    private String título;
    private String autor;
    private int numPag;

    
    //constructores
    public Libro() {
    }

    public Libro(int isbn, String título, String autor, int numPag) {
        this.isbn = isbn;
        this.título = título;
        this.autor = autor;
        this.numPag = numPag;
    }

    
    //get y set
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    
    //método para cargar los datos del libro
    public void cargarDatos() {
        
        Scanner read = new Scanner(System.in);

        System.out.println("Ingresá el número de ISBN: ");
        isbn = read.nextInt();

        System.out.println("");
        System.out.println("Ingresá el Título del libro: ");
        título = read.next().toUpperCase();

        System.out.println("");
        System.out.println("Ingresá el nombre del autor: ");
        autor = read.next();
        
        System.out.println("");
        System.out.println("Ingresá la cantidad de pág que tiene el libro: ");
        isbn = read.nextInt();
    }

}
