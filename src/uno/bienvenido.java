/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uno;

import com.sun.awt.AWTUtilities;
import java.awt.Image;

import javax.swing.ImageIcon;

/**
 *
 * @author David
 */
public class bienvenido extends javax.swing.JFrame {
    LogIn l ;
    MenuPrincipal taquilla;
    MenuDulceria dulceria;
    boolean vandera = false;
    ImageIcon imagen ;
    ImageIcon imagen1 ;
    ImageIcon imagen2 ;
    ImageIcon imagen3 ;
    
    /**
     * Creates new form bienvenido
     */
    public bienvenido() {
        initComponents();
        //jPanel1.setVisible(false);
        dulce.setVisible(false);
            taqui.setVisible(false);
         taquilla= new MenuPrincipal();
         dulceria = new MenuDulceria();
         imagen = new ImageIcon(getClass().getResource(("fondo.jpg")));
          fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT)));
          
          fondo1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT)));
          imagen1 = new ImageIcon(getClass().getResource(("user.jpg")));
          Sesion.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(Sesion.getWidth(), Sesion.getHeight(), Image.SCALE_DEFAULT)));
          
          imagen2 = new ImageIcon(getClass().getResource(("TAQUILLA.png")));
          taqui.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(taqui.getWidth(), taqui.getHeight(), Image.SCALE_DEFAULT)));
          imagen3 = new ImageIcon(getClass().getResource(("dulce3.png")));
          dulce.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(dulce.getWidth(), dulce.getHeight(), Image.SCALE_DEFAULT)));
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dulce = new javax.swing.JButton();
        taqui = new javax.swing.JButton();
        fondo1 = new javax.swing.JLabel();
        Sesion = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(490, 370));
        setMinimumSize(new java.awt.Dimension(490, 370));
        setPreferredSize(new java.awt.Dimension(490, 370));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(480, 230));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(null);

        dulce.setText("Dulceria");
        dulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dulceActionPerformed(evt);
            }
        });
        jPanel1.add(dulce);
        dulce.setBounds(10, 80, 200, 100);

        taqui.setText("taquella");
        taqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taquiActionPerformed(evt);
            }
        });
        jPanel1.add(taqui);
        taqui.setBounds(230, 80, 230, 110);
        jPanel1.add(fondo1);
        fondo1.setBounds(4, 4, 480, 230);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 230);

        Sesion.setText("Usuario");
        Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SesionActionPerformed(evt);
            }
        });
        getContentPane().add(Sesion);
        Sesion.setBounds(160, 240, 140, 110);
        getContentPane().add(fondo);
        fondo.setBounds(0, -6, 560, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SesionActionPerformed
        // TODO add your handling code here:
        l = new LogIn();
        l.setVisible(true);
        
        if(vandera =l.valido1())
        {
            System.out.println("verdadero");
            dulce.setVisible(true);
            taqui.setVisible(true);
        }
        else
        {
         dulce.setVisible(false);
            taqui.setVisible(false);   
        }
    }//GEN-LAST:event_SesionActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
       try{
        if(vandera =l.valido1())
        {
            System.out.println("verdadero");
            dulce.setVisible(true);
            taqui.setVisible(true);
        }
        else
        {
         dulce.setVisible(false);
            taqui.setVisible(false);   
        }
       }catch(Exception e){
           
       }
    }//GEN-LAST:event_jPanel1MouseEntered

    private void taquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taquiActionPerformed
        // TODO add your handling code here:
        
        taquilla.setVisible(true);
    }//GEN-LAST:event_taquiActionPerformed

    private void dulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dulceActionPerformed
        // TODO add your handling code here:
        dulceria.setVisible(true);
    }//GEN-LAST:event_dulceActionPerformed

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
            java.util.logging.Logger.getLogger(bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bienvenido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sesion;
    private javax.swing.JButton dulce;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton taqui;
    // End of variables declaration//GEN-END:variables
}
