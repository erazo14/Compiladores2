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
public class Procedimiento implements java.io.Serializable{

    public String id;
    public String retorno;
    public int desplaza = 0 ;
    public ArrayList<Parametros> listParametros = new ArrayList();
    
   public Procedimiento (){}
   
   public Procedimiento(String a, String b, int c){
       this.id = a;
       this.retorno = b;
       this.desplaza = c;
       this.listParametros = new ArrayList();
       
               
   }
   
}
