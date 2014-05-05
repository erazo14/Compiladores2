/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package compiladores;
import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author Bochoa
 */

public class Simbolos implements java.io.Serializable{
    private String id;
    private int valor;
    private String tipo;
    private Hashtable <String, String> record= new Hashtable();
    private int direccion;
    private String returnFunction  = "";
    private Procedimiento procedimiento = new Procedimiento();
    private Type type = new Type();
    private int desplaza = 0;
    private String tipoDeDeclaracion = "";
 

    public String getTipoDeDeclaracion() {
        return tipoDeDeclaracion;
    }

    public void setTipoDeDeclaracion(String tipoDeDeclaracion) {
        this.tipoDeDeclaracion = tipoDeDeclaracion;
    }

    public int getDesplazamiento() {
        return desplaza;
    }

    public void setDesplazamiento(int despazamiento) {
        this.desplaza = despazamiento;
    }
 
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public Simbolos(){
        
    }
    
    public Procedimiento getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(Procedimiento procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Hashtable getRecord() {
        return record;
    }

    public void setRecord(Hashtable record) {
        this.record = record;
    }
     public Simbolos(String id , String tipo, Hashtable tabla, String retorno) {
        this.id  = id;
        this.valor = 0;
        this.tipo=tipo;
        this.returnFunction = retorno;
        this.record= tabla; 
        this.direccion=0;
    }
    //este se usa para los structure y los procedimientos sub
   public Simbolos(String id , String tipo, Hashtable tabla) {
        this.id = id;
        this.valor = 0;
        this.tipo=tipo;
        this.record= tabla; 
        this.direccion=0;
    }
    public Simbolos(String id , String tipo, int ambito) {
        this.id = id;
        this.valor = 0;
        this.tipo=tipo;
        this.direccion=0;
    }
     
    public Simbolos(String id, int valor, String tipo, int ambito, int direccion)
    {   this.id = id;
        this.valor = valor;
        this.tipo=tipo;
        this.direccion=direccion;
    }
    
    public String getReturnFunction() {
        return returnFunction;
    }

    public void setReturnFunction(String retornoFunction) {
        this.returnFunction = retornoFunction;
    }

  public String getid()
    {
        return this.id;
    }
    public void setid(String id)
    {
        this.id = id;
    }
    
    public String GetTipoRecord(String nombre ){
        
        return record.get(nombre).toString();
    }

      public void InsertarRecord(String nombre, String tipo){
        
         record.put(nombre,tipo);
    }

    public int getValor()
    {
        return this.valor;
    }
    public void setValor(int valor)
    {
        this.valor = valor;
    }
    public String getTipo()
    {
        return this.tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
  
     public int getDireccion()
    {
        return this.direccion;
    }
    public void setDireccion(int direccion)
    {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
  
}
