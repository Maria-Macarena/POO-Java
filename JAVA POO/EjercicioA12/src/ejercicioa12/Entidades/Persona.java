
package ejercicioa12.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Macarena Cardozo.-
 */
public class Persona {
    
    //atributos
    private String nombre;
    private LocalDate fechaNacimiento;
    
    //constructores

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
    
    
}
