
package ejercicioa7.Entidades;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class Persona {
   
    //atributos
    
    private String nombre;
    private char Sexo;
    private double peso;
    private double altura;
    private int edad;
    
    
    //constructores

    public Persona() {
    }

    public Persona(String nombre, char Sexo, double peso, double altura,int edad) {
        this.nombre = nombre;
        this.Sexo = Sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    
    
    
    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    
    
    
}
