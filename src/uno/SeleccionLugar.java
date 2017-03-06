/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jonathan
 */
public class SeleccionLugar extends javax.swing.JFrame {
    int filas=5,columnas=7;
    Boton[][] botones;
    Boton[][] regresaboton;
    Cartelera c=new Cartelera ();
    String h;
    String p;
    
    MenuPrincipal mp=new MenuPrincipal();
    
    
    //Boton[][] botones=new Boton[5][7];
    public SeleccionLugar(Boton [][] botones) {
       
        this.h=mp.getHorario();
        this.p=mp.getPelicula();
        initComponents();
        this.botones=botones;
        if (botones[1][1]!=null) {
        agregar_despues();    
        }else
        agrega_primera();
        
        
    }
       public void generarTicket (int c,int f){
      String seccion= seccion(f);
      int asiento=(c%7)+1;
      taTicket.append("Cine-Tics \n"
              +"\nSala: "
              +"\n"+h
              +"\n"+p
              +seccion+asiento
              +"\nPrecio: $35.00"+"\n--------\n");
    }
    
    public String seccion (int s){
    String seccion="";
        if (s == 0) {
            seccion = "A";
        }
        if (s == 1) {
            seccion = "B";
        }
        if (s == 2) {
            seccion = "C";
        }
        if (s == 3) {
            seccion = "D";
        }
        if (s == 4) {
            seccion = "E";
        }
    return seccion;
    }
    public void agrega_primera(){
        for (int fila = 0;fila <filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                if(fila<(filas/2))
                botones[fila][columna]=new Boton((125*columna+50),(100*fila+50),100,100);
                else
                botones[fila][columna]=new Boton((125*columna+50),(100*fila+100),100,100);
                botones[fila][columna].cambiar_nombre(fila, columna);
                
                botones[fila][columna].imagen_libre();
                jPanel1.add(botones[fila][columna]);
            }
        }
    }
    public void agregar_despues(){
        for (int fila = 0;fila <filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                jPanel1.add(botones[fila][columna]);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        acepta = new javax.swing.JButton();
        cancala = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTicket = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("1");

        jLabel2.setText("2");

        jLabel3.setText("3");

        jLabel4.setText("4");

        jLabel5.setText("5");

        jLabel6.setText("6");

        jLabel7.setText("7");

        jLabel8.setText("A");

        jLabel9.setText("B");

        jLabel10.setText("C");

        jLabel11.setText("D");

        jLabel12.setText("E");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel8))
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel3)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel4)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel5))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel7)
                        .addGap(141, 141, 141))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGap(81, 81, 81)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(89, 89, 89)
                .addComponent(jLabel11)
                .addGap(75, 75, 75)
                .addComponent(jLabel12)
                .addGap(118, 118, 118))
        );

        acepta.setBackground(new java.awt.Color(102, 255, 102));
        acepta.setText("aceptar");
        acepta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptaMouseClicked(evt);
            }
        });
        acepta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptaActionPerformed(evt);
            }
        });

        cancala.setBackground(new java.awt.Color(255, 153, 153));
        cancala.setText("cancelar");
        cancala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancala, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acepta, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cancala, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(acepta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        taTicket.setColumns(20);
        taTicket.setRows(5);
        jScrollPane1.setViewportView(taTicket);

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Total:");

        jlTotal.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlTotal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jlTotal))
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancalaActionPerformed
        for (Boton[] botone : botones) {
            for (Boton botone1 : botone) {
                System.out.print(botone1.getText());
                if(botone1.getText().equals("s"))
                botone1.imagen_libre();
            }
            System.out.println();
        }
        this.setVisible(false);
    }//GEN-LAST:event_cancalaActionPerformed
    public Boton[][] regresa_ticket(){
        try {
            return regresaboton;
        } catch (Exception e) {
            System.out.println("error, no hay compra");
        return null; 
        }
    }
    private void aceptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptaActionPerformed
    public Boton[][] regresa(){
        return botones;
    }
    public String[][] regresaSeleccionado ()
    {
        String[][] seleccionado=new String[5][7];
        try{
        for (int i = 0; i < botones.length; i++) 
        {
            for (int j = 0; j < botones[i].length; j++) 
            {
                seleccionado[i][j]=botones[i][j].getText();
            }
        }
        return seleccionado;
        }
        catch(Exception e)
        {
            return seleccionado;
        }
        
    }
    private void aceptaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptaMouseClicked
        //JOptionPane.showConfirmDialog(acepta, evt);
        regresaboton=botones;
        //
        int total=0;
       int fila=-1;
       int columna=-1;
        for (Boton[] botone : botones) {
          fila++;
            for (Boton botone1 : botone) {
            columna++;
                System.out.print(botone1.getText());
                if(botone1.getText().equals("s")){
                generarTicket(columna,fila);
                 total+=35;
                botone1.imagen_ocupado();
                }
            }
            System.out.println();
        }
        jlTotal.setText("$"+total+".00");
        System.out.println("\n");
        //JOptionPane.showMessageDialog(acepta, "asientos reservados");
        //this.setVisible(false);
    }//GEN-LAST:event_aceptaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(SeleccionLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionLugar().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acepta;
    private javax.swing.JButton cancala;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JTextArea taTicket;
    // End of variables declaration//GEN-END:variables
}
