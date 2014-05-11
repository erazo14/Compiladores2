/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Bochoa
 */
public class TabladeSimbolos {
    public static Hashtable<String, Simbolos> TS= new Hashtable();
    public static int IndiceVar=0;
   public TabladeSimbolos(){
   
   }
    
   public TabladeSimbolos(Hashtable tabla){
      this.TS = tabla;
   }
   
public static String getTipos(String var,int ambito){

                Enumeration e = TabladeSimbolos.TS.keys();  
                Simbolos sim=new Simbolos(); 
                String obj;
                   while (e.hasMoreElements()) {  
                      obj = e.nextElement().toString();  
                      sim=TabladeSimbolos.TS.get(obj);
                      if (var.toString().equalsIgnoreCase(sim.getid()) &&  sim.getAmbito() == ambito){
                         return sim.getTipos(); 
                          
                      }
                     if (var.toString().equalsIgnoreCase(sim.getid()) &&  sim.getAmbito() == 0){
                         return sim.getTipos(); 
                          
                      }
                }    
return "No hay ningun Tipo Espeficicado";
}    
     
public static boolean VarGoblal(String var){

                Enumeration e = TabladeSimbolos.TS.keys();  
                Simbolos sim=new Simbolos(); 
                String obj;
                   while (e.hasMoreElements()) {  
                      obj = e.nextElement().toString();  
                      sim=TabladeSimbolos.TS.get(obj);
                      if (var.toString().equalsIgnoreCase(sim.getid()) &&  sim.getAmbito() == 0){
                          return true; 
                          
                      }
                     
                }    
return false;
}


  

 
   
}
