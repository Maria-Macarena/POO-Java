package ejercicioa5.Entidades;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class Cuenta {

    //atributos  
    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    //constructores
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    //get y set
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    //metodo n°1 pide los datos al usuario para crear la cuenta
    public void crearCuenta() {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresar el número de cuenta: ");
        numeroCuenta = read.nextInt();

        System.out.println("Ingresar el número de D.N.I. del titular: ");
        dni = read.nextLong();

        System.out.println("Ingresar el saldo actual: ");
        saldoActual = read.nextDouble();

    }
    
    //metodo n°2 le suma al saldo actual un monto nuevo
    public void ingresar(double ingreso){
         saldoActual +=ingreso;
         System.out.println("Operación exitosa!");
    }

    //metodo n°3 retiro de dinero de la cuenta 
    public void retirar(double retiro){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String op="";
        
        if(retiro > saldoActual){
            
            do{
                
            
            
            System.out.println("La cantidad ingresada excede el "
                    + " límite de tu cuenta");
            System.out.println(" Tu saldo es: $"+saldoActual);
            System.out.println("Para retirar el monto actual ingresa"
                    + " 'S' para salir ingresa 'N': ");
            op = read.next().toUpperCase();
            
            if(op.equals("S")){
                saldoActual = 0;
                System.out.println("Operación exitosa!");
                break;
            }else if(!op.equals("N") && !op.equals("S")){
                System.out.println("Ingresa una opción correcta");
                op = read.next().toUpperCase();
            }
            
            } while(!op.equals("N"));
        }
        
        
        
            
        }
    //metodo n°4 permitirá sacar solo un 20% del saldo
        public void extraccionRapida(double monto){
            
            Scanner read = new Scanner(System.in).useDelimiter("\n");
            double check=(20*saldoActual/100);
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
                      saldoActual-= monto;
                      System.out.println("Operación exitosa");
                      break;
                 }
                
                }while(!op.equals("N"));
                
            }else{
                saldoActual-= monto;
                System.out.println("Operación exitosa");
            }
                
    }
      
    
    //metodo n°5 consulta el saldo de al cuenta
    public void consultarSaldo(){
        System.out.println("Saldo Disponible: $"+saldoActual);
        System.out.println("Operación exitosa");
    }
        
    //metodo n°5 consulta los datos de la cuenta
    public void consultarDatos() {
        
        System.out.println("Número de cuenta: "+numeroCuenta);
        System.out.println("Número de D.N.I del titular: "+dni);
        System.out.println("Saldo actual: $ "+saldoActual);
        System.out.println("Operación exitosa");
    }
}


