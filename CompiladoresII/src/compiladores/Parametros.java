/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;

/**
 *
 * @author Bochoa
 */
public class Parametros implements java.io.Serializable{
    public int tipo ;
    public String id;
    public boolean ReferenciaTipo;

    public Parametros(int t, String i, boolean ref){
        tipo = t;
        id = i;
        ReferenciaTipo = ref;
    }
    
    public int gettipo() {
        return tipo;
    }

    public String getid() {
        return id;
    }

    public boolean isReferenciaTipo() {
        return ReferenciaTipo;
    }
}
