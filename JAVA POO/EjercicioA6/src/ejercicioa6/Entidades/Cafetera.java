package ejercicioa6.Entidades;

/**
 *
 * @author Macarena Cardozo.
 */
public class Cafetera {

    //atributos
    private int capMax;
    private int capActual;

    //constructores
    public Cafetera() {
    }

    public Cafetera(int capMax, int capActual) {
        this.capMax = capMax;
        this.capActual = capActual;
    }

    //get y set
    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCapActual() {
        return capActual;
    }

    public void setCapActual(int capActual) {
        this.capActual = capActual;
    }

    //metodo n°1: hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera() {

        capActual = capMax;

        System.out.println("¡Cafetera Llena!");
    }

    //metodo n°2: se pide el tamaño de una taza vacía, el método recibe el
    //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    //cuanto quedó la taza. 
    public void servirTaza(int cantidad) {

        if (capActual == 0) {
            System.out.println("¡No hay café!");
        }

        if (cantidad <= capActual) {

            capActual -= cantidad;

            System.out.println("¡La taza se llenó exitosamente!");
            
        } else if (cantidad > capActual && capActual != 0) {

            System.out.println("¡La taza no pudo llenarse! La cantidad de "
                    + " cafe servido es: " + capActual+" ml.");
            capActual = 0;

        }

    }
    
    //metodo n°3: pone la cantidad de café actual en cero.
    public void vaciarCafetera(){
        
        capActual=0;
        
        System.out.println("¡Cafetera vacía!");
        
    }

    
    //metodo n°4: se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada. Verifico 
    //que no supere la capMax y si lo supera se rechaza y se informa la capacidad
    //limite de cafe que puede ingresar
    public void agregarCafe(int agregar){
        
        int check= capMax-capActual;
        
        
        
        if(agregar <= check){
            capActual +=agregar;
            System.out.println("¡Cantidad agregada exitosamente!");
        }else{
            System.out.println("La cantidad de café ingresada es superior "
                    + " a la capacidad máxima de la cafetera.");
            System.out.println("La cantidad límite que puedes ingresar es "
                    + " de "+check+" ml.");
        }
        
    }
    
    //metodo n°5: muestra los datos de la cap actual
    public void consultarCapActual(){
        System.out.println("La capacidad actual de la cafetera es "+capActual+" ml.");
    }
    
    
}
