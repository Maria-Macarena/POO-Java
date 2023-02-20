package ejercicioa7.Servicios;

import ejercicioa7.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class ServicioPersona {

    //metodo n°1: crear persona
    public Persona crearPersona() {
        
        Persona p = new Persona();
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Nombre de la perosna");
        p.setNombre(read.next().toLowerCase());
        Character sexoMay = ' ';

        do {
            System.out.println("Sexo: Femenino 'f' - Masculino 'M' - Otro 'O' ");
            Character sexo = read.next().charAt(0);

            sexoMay = Character.toUpperCase(sexo);
            
            

            if (!sexoMay.equals('F') && !sexoMay.equals('M') && !sexoMay.equals('O')) {
                System.out.println("ERROR ! Opción incorrecta, intenta nuevamente");
                System.out.println("Sexo: Femenino 'f' - Masculino 'M' - Otro 'O' ");
                sexo = read.next().charAt(0);

                sexoMay = Character.toUpperCase(sexo);

            }

        } while (!sexoMay.equals('F') && !sexoMay.equals('M') && !sexoMay.equals('O'));

        
        p.setSexo(sexoMay);
        
        System.out.println("Peso: ");
        p.setPeso(read.nextDouble());  

        System.out.println("Altura: ");
        p.setAltura(read.nextDouble()); 
        
        System.out.println("Edad: ");
        p.setEdad(read.nextInt()); 

        return p;

    }

    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. 
    
     */
    public int calcularIMC(Persona p) {
        
        int pesoIdeal=0, bajoPeso=-1, sobrePeso = 1;

        double imc = p.getPeso() / (Math.pow(p.getAltura(), 2));

        System.out.println("imc : " + imc);

        if (imc< 20) {
            return bajoPeso;
        } else if (imc >= 20 && imc <= 25) {
            return pesoIdeal;
        } else {
            return sobrePeso;
        }

    }
    
    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
    */
   
    
    public boolean esMayorDeEdad(Persona p){
        
        boolean mayor;
        
        if(p.getEdad() >= 18){
            mayor= true;
            
        }else{
            mayor=false;
        }
        
        return mayor;
    }
    
    
    
      public void mostrarPersona(Persona p){
        System.out.println(" ");
        System.out.println("nombre: "+p.getNombre());
        System.out.println("edad: "+p.getEdad());
        System.out.println("sexo: "+p.getSexo());
        System.out.println("peso: "+p.getPeso());
        System.out.println("altura: "+p.getAltura());
        System.out.println(" ");
        
    }

}
