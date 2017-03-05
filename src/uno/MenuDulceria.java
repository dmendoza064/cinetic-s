/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uno;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class MenuDulceria extends javax.swing.JFrame {
Dulceria[] inventario;
ArrayList lista=new ArrayList();
int posision;
boolean encontrado=false;
    DefaultTableModel modelo =new DefaultTableModel();
    
    /**
     * Creates new form MenuDulceria
     */
    public MenuDulceria() {
        initComponents();
        inventario = new Dulceria[12];
        agregarDulces();
        jPanel1.setVisible(false);
        modelo.addColumn("descripcion");
        modelo.addColumn("precio");
        modelo.addColumn("cantidad");
        jTable1.setModel(modelo);
    }
     public void agregarDulces()
     {
         inventario[0]=new Dulceria( "Refresco", "Refresco Grande", 50.00f,new ImageIcon(getClass().getResource("vaso.jpg")));
         inventario[1]=new Dulceria( "Refresco", "Refresco Mediano", 25.00f,new ImageIcon(getClass().getResource("vaso.jpg")));
         inventario[2]=new Dulceria( "Refresco", "Refresco Chico", 15.50f,new ImageIcon(getClass().getResource("vaso.jpg")));
         inventario[3]=new Dulceria( "Palomitas", "Palomitas Grande", 38.00f,new ImageIcon(getClass().getResource("Palomitas.png")));
         inventario[4]=new Dulceria( "Palomitas", "Palomitas Mediana", 28.00f,new ImageIcon(getClass().getResource("Palomitas.png")));
         inventario[5]=new Dulceria( "Palomitas", "Palomitas Chica", 18.50f,new ImageIcon(getClass().getResource("Palomitas.png")));
         inventario[6]=new Dulceria( "Nachos", "Nachos Grandes", 48.99f,new ImageIcon(getClass().getResource("nacho.jpg")));
         inventario[7]=new Dulceria( "Nachos", "Nachos Grandes con extra queso", 55.50f,new ImageIcon(getClass().getResource("nacho.jpg")));
         inventario[8]=new Dulceria( "Nachos", "Nachos chicos", 28.10f,new ImageIcon(getClass().getResource("nacho.jpg")));
         inventario[9]=new Dulceria( "Dulces", "Gomitas", 18.00f,new ImageIcon(getClass().getResource("gomas.jpg")));
         inventario[10]=new Dulceria( "Dulces", "Helado", 25.90f,new ImageIcon(getClass().getResource("helado.jpg")));
         inventario[11]=new Dulceria( "Dulces", "Chocolates", 14.50f,new ImageIcon(getClass().getResource("kiss.jpg")));
         
         
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        imagen2 = new javax.swing.JButton();
        imagen3 = new javax.swing.JButton();
        imagen1 = new javax.swing.JButton();
        des1 = new javax.swing.JLabel();
        des2 = new javax.swing.JLabel();
        des3 = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        comprar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("busqueda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        imagen2.setText("jButton2");
        imagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen2MouseClicked(evt);
            }
        });
        imagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen2ActionPerformed(evt);
            }
        });

        imagen3.setText("jButton2");
        imagen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen3MouseClicked(evt);
            }
        });

        imagen1.setText("jButton2");
        imagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen1MouseClicked(evt);
            }
        });

        des1.setText("jLabel2");

        des2.setText("jLabel3");

        des3.setText("jLabel4");

        precio1.setText("jLabel2");

        precio2.setText("jLabel3");

        precio3.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(des3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precio3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(des2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precio2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(des1)
                        .addGap(81, 81, 81)
                        .addComponent(precio1)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(des1)
                    .addComponent(precio1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(des2)
                    .addComponent(precio2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(des3)
                            .addComponent(precio3))
                        .addGap(64, 64, 64))))
        );

        comprar.setText("comprar");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String busqueda;
        busqueda = jTextField1.getText();
        System.out.println(busqueda);
        boolean bandera=false;
        int con=0;
        
        for (int i = 0; i < inventario.length; i++) {
            if(inventario[i].getNombre().equalsIgnoreCase(busqueda))
            { 
            bandera=true;
            con=i;
               jPanel1.setVisible(true);
               System.out.println("posisión: "+con);
               encontrado=true;
               posision=i;
            break;
            }
            
        }
        if (!bandera) {
            encontrado=false;
        }
        if(bandera)
        {
            
               imagen1.setIcon(new ImageIcon(inventario[con].getImagen().getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_DEFAULT)));
               des1.setText(inventario[con].getDescripcion());
               precio1.setText(""+inventario[con].getPrecio());
               con++;
               imagen2.setIcon(new ImageIcon(inventario[con].getImagen().getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_DEFAULT)));
               des2.setText(inventario[con].getDescripcion());
               precio2.setText(""+inventario[con].getPrecio());
               con++;
               imagen3.setIcon(new ImageIcon(inventario[con].getImagen().getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_DEFAULT)));
               des3.setText(inventario[con].getDescripcion());
               precio3.setText(""+inventario[con].getPrecio());
            }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imagen2ActionPerformed

    private void imagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MouseClicked
        // TODO add your handling code here:
        try{
        if (encontrado) {
            int cantidad=Integer.parseInt(JOptionPane.showInputDialog("digite cantidad")); 
            Object[] dato={inventario[posision].getDescripcion(),inventario[posision].getPrecio(),cantidad};
        modelo.addRow(dato);
        //jTable1.setModel(new DefaultTableModel());
        jTable1.setModel(modelo);
        }}catch(Exception e){JOptionPane.showMessageDialog(null,"error en cantidad");}  
    }//GEN-LAST:event_imagen1MouseClicked

    private void imagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen2MouseClicked
        // TODO add your handling code here:
        try{
        if (encontrado) {
            int cantidad=Integer.parseInt(JOptionPane.showInputDialog("digite cantidad")); 
            Object[] dato={inventario[posision+1].getDescripcion(),inventario[posision+1].getPrecio(),cantidad};
        modelo.addRow(dato);
        //jTable1.setModel(new DefaultTableModel());
        jTable1.setModel(modelo);
        }}catch(Exception e){JOptionPane.showMessageDialog(null,"error en cantidad");} 
    }//GEN-LAST:event_imagen2MouseClicked

    private void imagen3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen3MouseClicked
        // TODO add your handling code here:
        try{
        if (encontrado) {
            int cantidad=Integer.parseInt(JOptionPane.showInputDialog("digite cantidad")); 
            Object[] dato={inventario[posision+2].getDescripcion(),inventario[posision+2].getPrecio(),cantidad};
        modelo.addRow(dato);
        //jTable1.setModel(new DefaultTableModel());
        jTable1.setModel(modelo);
        }}catch(Exception e){JOptionPane.showMessageDialog(null,"error en cantidad");}  
    }//GEN-LAST:event_imagen3MouseClicked

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        double total=0;
        String ticket="";
        try{
               for (int i = 0; i < modelo.getRowCount(); i++) {
                   for (int j = 0; j < modelo.getColumnCount(); j++) {
                       ticket+=modelo.getValueAt(i, j)+"    ";System.out.print(modelo.getValueAt(i, j)+"    ");  
                   }System.out.println("");
                   String precio=modelo.getValueAt(i, 2).toString();System.out.println(precio);
                   String cantidad=modelo.getValueAt(i, 1).toString();System.out.println(cantidad);
                   total+=Double.parseDouble(precio)*Double.parseDouble(cantidad);
                   //System.out.println(modelo.getValueAt(i, 1)+"  "+modelo.getValueAt(i, 2));//System.out.println(Integer.parseInt((String) modelo.getValueAt(i, 2))*Integer.parseInt((String) modelo.getValueAt(i, 3)));
                   ticket+="\n";
            }
               total=Math.round(total*100)/100;
               ticket+="total: "+total;
        }catch(Exception e){ System.out.println("error");}
        finally{
            JOptionPane.showMessageDialog(null, ticket);
            this.setVisible(false);
        }
    }//GEN-LAST:event_comprarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDulceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDulceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDulceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDulceria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDulceria().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprar;
    private javax.swing.JLabel des1;
    private javax.swing.JLabel des2;
    private javax.swing.JLabel des3;
    private javax.swing.JButton imagen1;
    private javax.swing.JButton imagen2;
    private javax.swing.JButton imagen3;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    // End of variables declaration//GEN-END:variables
}
