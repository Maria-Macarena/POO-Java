
package ejercicioa5.Servicios;

import ejercicioa5.Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class ServicioCuenta {
 
    
    //metodo n°1 pide los datos al usuario para crear la cuenta
    public void crearCuenta(Cuenta cuenta) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresar el número de cuenta: ");
        cuenta.setNumeroCuenta(read.nextInt());  

        System.out.println("Ingresar el número de D.N.I. del titular: ");
        cuenta.setDni(read.nextLong()); 

        System.out.println("Ingresar el saldo actual: ");
        cuenta.setSaldoActual(read.nextDouble()); 
        
       
        
        

    }
    
    //metodo n°2 le suma al saldo actual un monto nuevo
    public void ingresar(double ingreso, Cuenta cuenta){
         cuenta.setSaldoActual(cuenta.getSaldoActual() +ingreso); 
         System.out.println("Operación exitosa!");
    }

    //metodo n°3 retiro de dinero de la cuenta 
    public void retirar(double retiro, Cuenta cuenta){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String op="";
        
        if(retiro > cuenta.getSaldoActual() ){
            
            do{
                
            
            
            System.out.println("La cantidad ingresada excede el "
                    + " límite de tu cuenta");
            System.out.println(" Tu saldo es: $"+cuenta.getSaldoActual());
            System.out.println("Para retirar el monto actual ingresa"
                    + " 'S' para salir ingresa 'N': ");
            op = read.next().toUpperCase();
            
            if(op.equals("S")){
                cuenta.setSaldoActual(0); 
                
                System.out.println("Operación exitosa!");
                break;
            }else if(!op.equals("N") && !op.equals("S")){
                System.out.println("Ingresa una opción correcta");
                op = read.next().toUpperCase();
            }
            
            } while(!op.equals("N"));
        } else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
            System.out.println("Operación exitosa");
        }
        
        
        
            
        }
    //metodo n°4 permitirá sacar solo un 20% del saldo
        public void extraccionRapida(double monto, Cuenta cuenta){
            
            Scanner read = new Scanner(System.in).useDelimiter("\n");
            
            double check= (20*cuenta.getSaldoActual()/100);
            double resultado;
            
            
            
            String op="";
            if(monto > check){
               
                do{
                    
                
                System.out.println("El monto ingresado supera el límite para retirar"
                        + " dinero con extracción rápida");
                System.out.println("Puedes retirar hasta $ "+check);
                System.out.println("¿Deseas retirar el monto sugerido? "
                        + " Ingresa 'S' para realizar la extracción o 'N' para volver"
                        + " al menú");
                op = read.next().toUpperCase();
                
                if(!op.equals("N") && !op.equals("S")){
                System.out.println("Ingresa una opción correcta");
                op = read.next().toUpperCase();
                }
                
                 if(op.equals("S")){
                    resultado = cuenta.getSaldoActual()-check; 
                    cuenta.setSaldoActual(resultado);
                      System.out.println("Operación exitosa");
                      break;
                 }
                
                }while(!op.equals("N"));
                
            }else{
                resultado =  cuenta.getSaldoActual()-monto; 
                    cuenta.setSaldoActual(resultado);
                System.out.println("Operación exitosa");
            }
                
    }
      
    
    //metodo n°5 consulta el saldo de al cuenta
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("Saldo Disponible: $"+ cuenta.getSaldoActual());
        System.out.println("Operación exitosa");
    }
        
    //metodo n°5 consulta los datos de la cuenta
    public void consultarDatos(Cuenta cuenta) {
        
        System.out.println("Número de cuenta: "+cuenta.getNumeroCuenta());
        System.out.println("Número de D.N.I del titular: "+cuenta.getDni());
        System.out.println("Saldo actual: $ "+cuenta.getSaldoActual());
        System.out.println("Operación exitosa");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
