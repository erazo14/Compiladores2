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
    ArrayList <TipoParametro> listaDeParametros= new ArrayList();

    public Type() {
        this.id = "";
        listaDeParametros = new ArrayList();
        tamano  = 0;
    }
    
    
}
