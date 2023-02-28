
package ejercicioextrab6.Entidades;

/**
 *
 * @author Macarena Cardozo.
 */
public class Ahorcado {
    
    //atributos
    private int  longitud;
    private char [] palabra = new char[longitud];
    private int letrasEncontradas;
    private int jugadasMaximas;
    
    
    
    //constructores
    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas,int longitud, int jugadasMaximas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.longitud= longitud;
        this.jugadasMaximas = jugadasMaximas;
    }
    
    //get y set
    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    
    
    
}
