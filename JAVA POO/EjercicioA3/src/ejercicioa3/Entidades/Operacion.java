package ejercicioa3.Entidades;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class Operacion {

    //atributos
    private int num1;
    private int num2;

    //constructores
    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //get y set
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //metodo n°1 pedir y guardar los numeros
    public void crearOperacion(){

        Scanner read = new Scanner(System.in);

        System.out.println("Teclea el primer número:");
        num1 = read.nextInt();

        System.out.println("Teclea el segundo número:");
        num2 = read.nextInt();
    }

    
    //metodo n°2 suma dos numeros
    public int sumar(){
        
         int resultado = (num1+num2);
         
        
        return resultado;
    }
    
    public int restar(){
        
         int resultado = (num1-num2);
        
        return resultado;
    }
    
    public int multiplicar(){
        
         int resultado=0;
         
         if(num1 == 0 || num2 == 0){
             resultado=0;
             System.out.println("ERROR.!Uno de los números ingresados es un Cero.");
             return resultado;
         }else{
             resultado = num1*num2;
         }
         
        return resultado;
    }
    
    public int dividir(){
        
         int resultado=0;
         
         if(num1 == 0 || num2 == 0){
             resultado=0;
             System.out.println("ERROR.!Uno de los números ingresados es un Cero. ");
             return resultado;
         }else{
             resultado = num1/num2;
         }
         
        return resultado;
    }
}
