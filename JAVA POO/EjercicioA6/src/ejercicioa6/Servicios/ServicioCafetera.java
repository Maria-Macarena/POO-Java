
package ejercicioa6.Servicios;

import ejercicioa6.Entidades.Cafetera;

/**
 *
 * @author Macarena Cardozo.
 */
public class ServicioCafetera {
    
    
    
    
    
 //metodo n°1: hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(Cafetera c) {

        c.setCapActual( c.getCapMax());
        

        System.out.println("¡Cafetera Llena!");
    }

    //metodo n°2: se pide el tamaño de una taza vacía, el método recibe el
    //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    //cuanto quedó la taza. 
    public void servirTaza(int cantidad, Cafetera c) {

        if (c.getCapActual() == 0) {
            System.out.println("¡No hay café!");
        }

        if (cantidad <= c.getCapActual()) {

            int servir = c.getCapActual() - cantidad;
            c.setCapActual(servir);

            System.out.println("¡La taza se llenó exitosamente!");
            
        } else if (cantidad > c.getCapActual() && c.getCapActual() != 0) {

            System.out.println("¡La taza no pudo llenarse! La cantidad de "
                    + " cafe servido es: " + c.getCapActual()+" ml.");
            c.setCapActual(0); 

        }

    }
    
    //metodo n°3: pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera c){
        
       c.setCapActual(0);
        
        System.out.println("¡Cafetera vacía!");
        
    }

    
    //metodo n°4: se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada. Verifico 
    //que no supere la capMax y si lo supera se rechaza y se informa la capacidad
    //limite de cafe que puede ingresar
    public void agregarCafe(int agregar, Cafetera c){
        
        int check= c.getCapMax()-c.getCapActual();
        
        
        
        if(agregar <= check){
          int a =  c.getCapActual() + agregar;
          c.setCapActual(a);
            System.out.println("¡Cantidad agregada exitosamente!");
        }else{
            System.out.println("La cantidad de café ingresada es superior "
                    + " a la capacidad máxima de la cafetera.");
            System.out.println("La cantidad límite que puedes ingresar es "
                    + " de "+check+" ml.");
        }
        
    }
    
    //metodo n°5: muestra los datos de la cap actual
    public void consultarCapActual(Cafetera c){
        System.out.println("La capacidad actual de la cafetera es "+c.getCapActual()+" ml.");
    }
    
       
    
    
    
    
    
    
    
}
