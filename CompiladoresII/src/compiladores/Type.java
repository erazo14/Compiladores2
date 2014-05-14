/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;
import java.util.*;
/**
 *
 * @author Bochoa
 */
public class Type {
    public String id ;
    public int tamano;
    public int desplaza = 0;
    ArrayList listaDeInstancias = new ArrayList();
    ArrayList tipoDeInstancias = new ArrayList();
    ArrayList <TipoParametro> listaDeParametros= new ArrayList();
    private final String nombre;

    public Type() {
        this.id = "";
        this.nombre ="";
        listaDeParametros = new ArrayList();
        tamano  = 0;
    }

    public Type(String id){
        this.nombre = id;
    }
    
    
}
