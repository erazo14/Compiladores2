/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


public class VisualForm extends javax.swing.JFrame {
     JFileChooser MI_ARCHIVO = null;
     File ABRIR = null;
    
    public VisualForm() {    
        initComponents();
        this.setTitle("Visual Basic 6.0  Compiler");
        this.jtxtcodigo.setLineWrap(true);
        LTN ltn = new LTN(this.jtxtcodigo);
        this.jScrollPane1.setRowHeaderView(ltn);
        jtxtcodigo.setBackground(Color.LIGHT_GRAY);
        jtxtcompilado.setBackground(Color.GRAY);
        jtxtcodigo.setForeground(Color.BLUE);
        jtxtcompilado.setForeground(Color.WHITE);
       
       
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtcodigo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtcompilado = new javax.swing.JTextArea();
        jbtnabrir = new javax.swing.JButton();
        jbtnguardar = new javax.swing.JButton();
        jbtncompilar = new javax.swing.JButton();
        jbtnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtcodigo.setColumns(20);
        jtxtcodigo.setFont(new java.awt.Font("Myriad Pro Light SemiExt", 0, 13)); // NOI18N
        jtxtcodigo.setRows(5);
        jScrollPane1.setViewportView(jtxtcodigo);

        jtxtcompilado.setColumns(20);
        jtxtcompilado.setFont(new java.awt.Font("Myriad Pro Light SemiExt", 0, 13)); // NOI18N
        jtxtcompilado.setRows(5);
        jScrollPane2.setViewportView(jtxtcompilado);

        jbtnabrir.setText("ABRIR");
        jbtnabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnabrirActionPerformed(evt);
            }
        });

        jbtnguardar.setText("GUARDAR");
        jbtnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarActionPerformed(evt);
            }
        });

        jbtncompilar.setText("COMPILAR");
        jbtncompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncompilarActionPerformed(evt);
            }
        });

        jbtnsalir.setText("SALIR");
        jbtnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnabrir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtncompilar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnabrir)
                    .addComponent(jbtnguardar)
                    .addComponent(jbtncompilar)
                    .addComponent(jbtnsalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed
       PrintWriter pw = null;

            BufferedWriter TextOut;
            BufferedWriter bw = null;
        try {
            if (ABRIR == null){
            MI_ARCHIVO= new JFileChooser(System.getProperty("user.dir"));   
            MI_ARCHIVO.showOpenDialog(this);    
            ABRIR=MI_ARCHIVO.getSelectedFile();
            bw = new BufferedWriter(new FileWriter(ABRIR));}
            else
            bw = new BufferedWriter(new FileWriter(ABRIR));
        } catch (IOException ex) {
            Logger.getLogger(VisualForm.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
            
      
        try {
            String texto = jtxtcodigo.getText().replace("\n","\r\n");
            bw.write(texto);
        } catch (IOException ex) {
            Logger.getLogger(VisualForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(VisualForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        jtxtcodigo.setText("");
        try { 
           this.jtxtcodigo.setText("");
           String nombre="";
           String TEXTO;
                if(ABRIR != null) {     
                nombre=ABRIR.getName(); 
            
            this.jtxtcodigo.setText("");    
            FileReader FICHERO = null;     
               try {
                   FICHERO = new FileReader(ABRIR);
               } catch (FileNotFoundException ex) {
                   Logger.getLogger(VisualForm.class.getName()).log(Level.SEVERE, null, ex);
               }
               //<editor-fold defaultstate="collapsed" desc="tiene que abrir el archivo">
               try  {
                   
                   BufferedReader LEER = new BufferedReader(FICHERO);
                   while((TEXTO=LEER.readLine()) != null) {
                       this.jtxtcodigo.append(TEXTO+ "\n");
                   }
               }  catch(FileNotFoundException exp){
                   System.out.println("No abre Archivo");
               }
            }   
        } catch(FileNotFoundException exp) {    
                //JOptionPane.showMessageDialog(rootPane, "El archivo no existe o no se encuentra en esta carpeta.");  
            System.out.println("Archivo no existe");
                
        } catch(Exception exp) { System.out.println(exp);   }
        
        
        
        
    }//GEN-LAST:event_jbtnguardarActionPerformed

    private void jbtnabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnabrirActionPerformed
try { 
           this.jtxtcodigo.setText("");
           String nombre="";
           String TEXTO;
            MI_ARCHIVO= new JFileChooser(System.getProperty("user.dir"));   
            MI_ARCHIVO.showOpenDialog(this);    
            ABRIR=MI_ARCHIVO.getSelectedFile();  
            if(ABRIR != null) {
                nombre=MI_ARCHIVO.getSelectedFile().getName(); 
                this.jtxtcodigo.setText("");    
                FileReader FICHERO = null;     
               try {
                   FICHERO = new FileReader(ABRIR);
               } catch (FileNotFoundException ex) {
                   Logger.getLogger(VisualForm.class.getName()).log(Level.SEVERE, null, ex);
               }
               try  {
                   BufferedReader LEER = new BufferedReader(FICHERO);
                   while((TEXTO=LEER.readLine()) != null) {
                       this.jtxtcodigo.append(TEXTO+ "\n");
                   }
               }catch (FileNotFoundException exp){
                   System.out.println("");
               }   
            }   
        } catch(FileNotFoundException exp) {    
                //JOptionPane.showMessageDialog(rootPane, "El archivo no existe o no se encuentra en esta carpeta.");  
            System.out.println("Archivo no existe");
            
                
        } catch(Exception exp) {     System.out.println(exp);   }
    }//GEN-LAST:event_jbtnabrirActionPerformed

    private void jbtncompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncompilarActionPerformed
        // TODO add your handling code here:
         //this.jbtnguardarActionPerformed(evt);
        if(ABRIR != null){
         this.jbtnguardarActionPerformed(evt);
        } 
         Analizador p =  null;
        lexer l = null;
        String errores = "";
        ArrayList<Visual_Error> errores_totales = new ArrayList<Visual_Error>();
        try {
            l = new lexer(new java.io.StringReader(this.jtxtcodigo.getText()));
	    p = new Analizador(l);
	    System.out.println("Iniciando parseo");
	    p.parse();
	} catch (Exception e) {
		e.printStackTrace();
	}
        if(!l.erroresLexicos.isEmpty()){                     
                errores_totales.addAll(l.erroresLexicos);
        }
        if(!p.erroresSintacticos.isEmpty()){
            errores_totales.addAll(p.erroresSintacticos);
        }
        if(!p.action_obj.erroresSintacticos2.isEmpty()){
            errores_totales.addAll(p.action_obj.erroresSintacticos2);
        }
        Collections.sort(errores_totales);
        if(errores_totales.isEmpty()){
            System.out.println("Exito");
            errores =  errores.concat("Compilación exitosa");
        }else{
            errores = errores.concat("Atención: Errores encontradoes: ");
            for (Visual_Error Visual_Error : errores_totales) {
                errores = errores.concat(Visual_Error.error + "\n");
            }
        }
        System.out.println(errores);
        this.jtxtcompilado.setText(errores);
        
        
    }//GEN-LAST:event_jbtncompilarActionPerformed

    private void jbtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jbtnsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnabrir;
    private javax.swing.JButton jbtncompilar;
    private javax.swing.JButton jbtnguardar;
    private javax.swing.JButton jbtnsalir;
    private javax.swing.JTextArea jtxtcodigo;
    private javax.swing.JTextArea jtxtcompilado;
    // End of variables declaration//GEN-END:variables
}
