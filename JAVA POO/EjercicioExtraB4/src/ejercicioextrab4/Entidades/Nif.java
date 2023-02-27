package ejercicioextrab4.Entidades;

/**
 *
 * @author Macarena Cardozo.
 */
public class Nif {
    
    //atributos
    private long numDni;
    private char letra;
    
    //constructor
    public Nif() {
    }

    public Nif(long numDni, char letra) {
        this.numDni = numDni;
        this.letra = letra;
    }
    
    
    //get y set
    public long getNumDni() {
        return numDni;
    }

    public void setNumDni(long numDni) {
        this.numDni = numDni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
    
    
}
