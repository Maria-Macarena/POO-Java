package ejercicioa8.Servicios;

import ejercicioa8.Entidades.Cadena;

/**
 *
 * @author Macarena Cardozo.
 */
public class ServicioCadena {

    /*
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
     */
    //Metodo n°1
    public void mostrarVocales(String frase) {

        int count = 0;

        frase.trim();

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e'
                    || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
                    || frase.charAt(i) == 'u') {

                count++;

            }
        }

        System.out.println("La frase " + frase + " tiene: " + count + " vocales");

    }

    //Metodo n°1 Bis -- Los dos metodos muestran el mismo resultado 
    //pero resuelto de diferentes formas
    public void vocal(Cadena cadena) {

        int count = 0;

        String frase = cadena.getFrase();

        for (int i = 0; i < frase.length(); i++) {

            if (frase.substring(i, i + 1).equals("a")
                    || frase.substring(i, i + 1).equals("e")
                    || frase.substring(i, i + 1).equals("i")
                    || frase.substring(i, i + 1).equals("o")
                    || frase.substring(i, i + 1).equals("u")) {

                count++;

            }

        }

        System.out.println("La frase " + frase + " tiene: " + count + " vocales");

    }

    /*
    Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    //Metodo n°2
    public void invertirFrase(Cadena cadena) {

        String frase = cadena.getFrase();

        String invertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {

            invertida += frase.charAt(i);

        }

        System.out.println("Frase Invertida: "+invertida);

    }

    //Metodo n°2 Bis -- Los dos metodos muestran el mismo resultado 
    //pero resuelto de diferentes formas
    public void invertida(Cadena cadena) {

        String frase = cadena.getFrase();

        StringBuilder s = new StringBuilder(frase);

        String invertida = s.reverse().toString();
        
        
        System.out.println( "Frase Invertida: "+invertida);

    }
    
    /*
    Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    */
    //Metodo n°3
    public void vecesRepetido(String letra,Cadena cadena){
        
        String frase= cadena.getFrase();
        int count=0;
        
        for(int i=0;i<frase.length();i++){
            
            
            if(frase.substring(i, i+1).equals(letra)){
                count++;
            }
            
            
        }
        
        System.out.println("La letra "+letra+" se repite: "+count+" veces");
        
        
    }
    
    
   /*
    Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
    */
    //Metodo n°4
    public boolean compararLongitud(String newFrase, Cadena cadena){
        
        boolean check=false;
        
        
        if(newFrase.length() == cadena.getLongitud()){
            check=true;
        }
        
        return check;
    }
    
    
    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    */
    //Metodo n°5
    public void unirFrases(String oracion, Cadena cadena){
        
        String union = cadena.getFrase() + oracion;
        
        System.out.println("Frase unida: "+cadena.getFrase().concat(oracion));//modo 1
        
        System.out.println("Frase unida: "+union);//modo 2 - cualquiera de los dos es correcto
        
    }
    
    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
    */
    //Metodo n°6
    public void reemplazar(String caracter, Cadena cadena){
        
        String reemplazo = cadena.getFrase().replace("a", caracter);
        
        System.out.println("Reemplazamos la letra 'a' por '"+caracter+"' y "
                + " el resultado es: "+reemplazo );
        
    }
    
    /*
    Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */
    //Metodo n° 7
    public boolean contiene(String elemento, Cadena cadena){
        
        boolean check=false;
        
        if(cadena.getFrase().contains(elemento)){
            check=true;
        }
        
        return check;
    }
    

}
