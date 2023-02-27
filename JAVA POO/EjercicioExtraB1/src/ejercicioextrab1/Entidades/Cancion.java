/*

*/
package ejercicioextrab1.Entidades;

/**
 *
 * @author Macarena Cardozo.
 */
public class Cancion {
    
    //Atributos
   private String titulo;
   private String autor;
    
    //constructor

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
   
    //get y set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
}
