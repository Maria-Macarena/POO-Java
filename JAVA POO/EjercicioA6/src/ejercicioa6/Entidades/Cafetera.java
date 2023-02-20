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

    
}
