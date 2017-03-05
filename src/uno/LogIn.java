/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.awt.Image;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard
 */
public class LogIn extends javax.swing.JFrame {
    boolean valido = false;
    Empleados empleado = new Empleados();
    Empleados empleados[] = new Empleados[20];
    int indice = 0;
    int claves[] = empleado.getEmpleadoClaves();
    String nombres[] = empleado.getEmpleadoNombres();
    int id[] = empleado.getEmpleadoIDs();
    MenuPrincipal menu;
    LinkedList<ControlAsiento> lista;
    ImageIcon imagen ;
    
    public LogIn() {
        initComponents();
          listarInfoEmpleado();
          imagen = new ImageIcon(getClass().getResource(("logo cine.jpg")));
          fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT)));
          
    }
    public boolean valido1()
    {
     return  valido;
    }

    public void listarInfoEmpleado (){
      for (int i : id) {
          cbId.addItem(i);
      }
         
  }
    public void paso_paso(){
        
        this.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbEntrar = new javax.swing.JButton();
        tfClave = new javax.swing.JPasswordField();
        jlNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbId = new javax.swing.JComboBox();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 300));
        setMinimumSize(new java.awt.Dimension(360, 300));
        setPreferredSize(new java.awt.Dimension(360, 300));
        getContentPane().setLayout(null);

        jbEntrar.setText("Entrar");
        jbEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEntrarMouseClicked(evt);
            }
        });
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEntrar);
        jbEntrar.setBounds(101, 209, 131, 23);

        tfClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClaveActionPerformed(evt);
            }
        });
        getContentPane().add(tfClave);
        tfClave.setBounds(160, 160, 69, 20);

        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setText("...");
        getContentPane().add(jlNombre);
        jlNombre.setBounds(140, 120, 80, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Empleado:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(24, 19, 58, 14);

        jLabel3.setText("ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 80, 40, 14);

        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 120, 60, 14);

        jLabel5.setText("Clave:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 160, 50, 14);

        cbId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbIdItemStateChanged(evt);
            }
        });
        getContentPane().add(cbId);
        cbId.setBounds(161, 76, 53, 20);
        getContentPane().add(fondo);
        fondo.setBounds(4, 0, 360, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEntrarMouseClicked

    }//GEN-LAST:event_jbEntrarMouseClicked

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        try {
            
            if (indice < 20) {
                
                System.out.println(tfClave.getText());
                if (cbId.getSelectedItem().equals(1) && Integer.parseInt(tfClave.getText()) == claves[0]) {
                    empleados[indice] = new Empleados();
                    empleados[indice].setEmpleadoNombre(jlNombre.getText());
                    tfClave.setText(null);
                    valido=true;
                    paso_paso();
                }
                if (cbId.getSelectedItem().equals(2) && Integer.parseInt(tfClave.getText()) == claves[1]) {
                    empleados[indice] = new Empleados();
                    empleados[indice].setEmpleadoNombre(jlNombre.getText());
                    tfClave.setText(null);
                    valido = true;
                    paso_paso();
                }
                if (cbId.getSelectedItem().equals(3) && Integer.parseInt(tfClave.getText()) == claves[2]) {
                    empleados[indice] = new Empleados();
                    empleados[indice].setEmpleadoNombre(jlNombre.getText());
                    tfClave.setText(null);
                    valido = true;
                    paso_paso();
                }
                if (cbId.getSelectedItem().equals(4) && Integer.parseInt(tfClave.getText()) == claves[3]) {
                    empleados[indice] = new Empleados();
                    empleados[indice].setEmpleadoNombre(jlNombre.getText());
                    tfClave.setText(null);
                    valido = true;
                    paso_paso();
                }
                if (!valido) {
                    valido=false;
                    JOptionPane.showMessageDialog(this, "Informacion invalida ");
                }
            }
            else
            JOptionPane.showMessageDialog(this, "Memoria Llena");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, " Introduce clave");
        }
    }//GEN-LAST:event_jbEntrarActionPerformed

    private void tfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClaveActionPerformed

    private void cbIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbIdItemStateChanged
        jlNombre.setText(nombres[cbId.getSelectedIndex()]);
    }//GEN-LAST:event_cbIdItemStateChanged

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        }); */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbId;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JPasswordField tfClave;
    // End of variables declaration//GEN-END:variables
}
