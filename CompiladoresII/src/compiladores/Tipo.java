/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;

/**
 *
 * @author Bochoa
 */
public class Tipo {
    private String tipo;
    private int Tamaño;

    
    // aqui solo puse el tamano que tendria erazo
    public Tipo(String tipo){
        this.tipo=tipo;
        if (tipo.equalsIgnoreCase("integer")){
            Tamaño = 4;
        }
        else{
            if (tipo.equalsIgnoreCase("char")||tipo.equalsIgnoreCase("boolean")){
                Tamaño = 1;
            }
            else{
                if(tipo.contains("string")){
                    Tamaño=Integer.parseInt(tipo.substring(7));                    
               }
            }
       }
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
}