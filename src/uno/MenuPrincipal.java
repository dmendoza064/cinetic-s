/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.Calendar;
/**
 *
 * @author jonathan
 */
public class MenuPrincipal extends  javax.swing.JFrame {
    Cartelera car=new Cartelera(); 
    Cartelera carteleras[]=new Cartelera[20]; 
    Empleados empleados[]=new Empleados[20];
    Empleados emp=new Empleados();
    ImageIcon imagen[]= new ImageIcon[12];
    String horarios[][]=car.getHorarios();
    String[] peliculas=car.getPeliculas();
    LogIn l;
    int con=1;
    int indice=0;
    Icon icono[];
    LinkedList<ControlAsiento> datos_asiento =new LinkedList<ControlAsiento>();
    boolean venta=false;
    SeleccionLugar sl;
    String[][] arreglo_ticket;
    boolean existe_ticket=false;
    int filas=5,columnas=7;
    String pelicula;
    String horario;
    int sala; 
    boolean activar=true;
    float boleto;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
     initComponents(); 
          //ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
            //jLabe2.setIcon(icono);
        listarImagenes();
        listarHorarios();
        getHoraActual();
        jlSala.setText("Sala: " + con);
        jlPelicula.setText(peliculas[indice]);
        jpTicket.setVisible(false);
        jlTotal.setText(emp.getEmpleadoNombre());
        precioBoleto();
       // this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    public float precioBoleto(){
    Calendar c = Calendar.getInstance();
    int dia = c.get(Calendar.DAY_OF_WEEK);
    
    if (dia==Calendar.FRIDAY)
        boleto=19.00f;
    else
        boleto=28.00f;
        System.out.println(dia);
    return boleto;
    }
   
    public void activar_desactivar(boolean sn){
        cbHorarios.setVisible(sn);
        jButton2.setVisible(sn);
        jButton3.setVisible(sn);
        jButton1.setVisible(sn);
        siguiente.setVisible(sn);
    }
    public void setPelicula (String p){
    pelicula=p;
    }
    public void setHorario (String h){
    horario=h;
    }
    public void setSala (int s){
    sala=s;
    }
    public String getPelicula (){
    return pelicula;
    }
    public String getHorario (){
    return horario;
    }
    public int getSala (){
    return sala;
    }
    public LinkedList<ControlAsiento> regresaDatos()
    {
        return  datos_asiento;
    }
    public void listarImagenes(){
     for (int i = 1; i <= 4; i++) {
            imagen[i] = new ImageIcon(getClass().getResource((i)+".jpg"));
            System.out.println("paso");
        }
        
        jLabel2.setIcon(new ImageIcon(imagen[1].getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT)));
    }
     public void listarHorarios () {
        cbHorarios.removeAllItems();
        SimpleDateFormat formato = new SimpleDateFormat("hh:mm aa");
        Date horario;
        String h;
        try {
            for (int i = 0; i < horarios.length; i++) {
                horario = formato.parse(horarios[i][con-1]);
                h = formato.format(horario);
                if (horario.after(formato.parse(getHoraActual()))) {
                    cbHorarios.addItem(h);
                }
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
  public String getHoraActual (){
SimpleDateFormat format = new SimpleDateFormat("hh:mm aa");
      Date horaActual = new Date();
      String horaConFormato = format.format(horaActual);
      return horaConFormato;
    }
       public void generarTicket (int c,int f){
      String seccion= seccion(f);
      int asiento=(c%7)+1;
      taTicket.append("Cine-Tics \n"
              +"\nSala: "+con
              +"\nAsiento: "+seccion+"-"+asiento
              +"\n"+cbHorarios.getSelectedItem().toString()
              +"\n"+jlPelicula.getText()
              +"\nPrecio: $"+boleto+"0"+"\n--------------------------------------------------\n");
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbHorarios = new javax.swing.JComboBox();
        jlSala = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jlPelicula = new javax.swing.JLabel();
        jpTicket = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTicket = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        ticket = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jlSubtotal = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jlTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlIVA = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlCantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SELECCION"));

        cbHorarios.setBorder(javax.swing.BorderFactory.createTitledBorder("HORARIOS"));
        cbHorarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbHorariosItemStateChanged(evt);
            }
        });

        jlSala.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlSala.setText("...");

        jButton2.setText("seleccionar lugar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbHorarios, 0, 285, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlSala)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlSala)
                .addGap(142, 142, 142)
                .addComponent(cbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });

        siguiente.setText(">>");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlPelicula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlPelicula.setText("...");

        jpTicket.setBackground(new java.awt.Color(255, 255, 255));

        taTicket.setColumns(20);
        taTicket.setRows(5);
        jScrollPane1.setViewportView(taTicket);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Ticket");

        ticket.setText("ticket");
        ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketActionPerformed(evt);
            }
        });

        jLabel3.setText("Subtotal:");

        jlSubtotal.setText("...");

        jButton4.setText("Nuevo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jlTotal.setText("...");

        jLabel4.setText("IVA:");

        jlIVA.setText("...");

        jLabel6.setText("Total:");

        jLabel5.setText("Cantidad:");

        jlCantidad.setText("...");

        javax.swing.GroupLayout jpTicketLayout = new javax.swing.GroupLayout(jpTicket);
        jpTicket.setLayout(jpTicketLayout);
        jpTicketLayout.setHorizontalGroup(
            jpTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTicketLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTicketLayout.createSequentialGroup()
                        .addComponent(ticket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(jpTicketLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jpTicketLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jpTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTicketLayout.createSequentialGroup()
                        .addComponent(jlTotal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpTicketLayout.createSequentialGroup()
                        .addGroup(jpTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIVA)
                            .addGroup(jpTicketLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(jpTicketLayout.createSequentialGroup()
                                .addComponent(jlSubtotal)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCantidad)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpTicketLayout.setVerticalGroup(
            jpTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlSubtotal)
                    .addComponent(jLabel5)
                    .addComponent(jlCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlIVA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jlTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jlPelicula))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jButton1)
                                .addGap(45, 45, 45)
                                .addComponent(siguiente)))
                        .addGap(18, 18, 18)
                        .addComponent(jpTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlPelicula)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(siguiente)))
                    .addComponent(jpTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbHorariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbHorariosItemStateChanged
     // carteleras[indice].setHorario(cbHorarios.getSelectedItem().toString());
    }//GEN-LAST:event_cbHorariosItemStateChanged

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
     
        cbHorarios.removeAllItems();
        
        if(con==4)
        {
            con=0;
            indice=-1;
        }
       
        con++;
         jlPelicula.setText(peliculas[con-1]);
          jlSala.setText("Sala: "+con);
        
      
        jLabel2.setIcon(new ImageIcon(imagen[con].getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT)));
       // String [][] horarios=car.getHorarios();
      listarHorarios();
        
    }//GEN-LAST:event_siguienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        cbHorarios.removeAllItems();
        
        if(con==1)
        {
            con=5;
            indice=4;
        }
        //String  cinpeli[]=car.getPeliculas();
        con--;
         jlSala.setText("Sala: "+con);
           jlPelicula.setText(peliculas[(con-1)]);
        
        jLabel2.setIcon(new ImageIcon(imagen[con].getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT)));
         listarHorarios();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
      
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
       
    }//GEN-LAST:event_jLabel2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // davo <------------------------crea un objeto para cada sala
        //<------------------------------un arreglo tambien es donde se guardan los botones
        /*      sl=new SeleccionLugar(botones);
                sl.setVisible(true);   */
     jlSubtotal.setText("");
      jlIVA.setText("");
      jlTotal.setText("");
      jlCantidad.setText("");
      jpTicket.setVisible(true);
      taTicket.setText(null);
        taTicket.setEditable(false);
        System.out.println(cbHorarios.getSelectedItem().toString());
        System.out.println(con);
        System.out.println(jlPelicula.getText());
        setHorario(cbHorarios.getSelectedItem().toString());
        setPelicula(jlPelicula.getText());
        setSala(con);
        boolean bandera=false;
        try{
            Boton[][] botones =new Boton[5][7];
            for (ControlAsiento datos :datos_asiento ) {
                if ((con-1)==datos.getSala()&&cbHorarios.getSelectedItem().equals(datos.getHorario())) {
                    //
                Boton[][] boto=datos.getAsientos_sala();
                for (int fila = 0;fila <filas; fila++) {// segunda o despues compra
                        for (int columna = 0; columna < columnas; columna++) {
                            if (boto[fila][columna].getText().equals("o")) {
                                arreglo_ticket[fila][columna]="o"; //arreglo_ticket[fila][columna]=("s");
                            }
                            else{
                                arreglo_ticket[fila][columna]="l";//arreglo_ticket[fila][columna]=("l");
                            }
                        }   
                    }
                    //
                sl=new SeleccionLugar(datos.getAsientos_sala());
                sl.setVisible(true);   
                datos.setAsientos_sala(sl.regresa());
                bandera=true;
                venta=true;
                break;
                }
            }
            if (!bandera) {
                sl=new SeleccionLugar(botones);
                sl.setVisible(true); 
                datos_asiento.add(new ControlAsiento(sl.regresa(),(con-1),(String)(cbHorarios.getSelectedItem())));
                venta=true;
                arreglo_ticket=new String[5][7];
                arreglo_ticket[0][0]=null;
            }
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(this, "error");
        }
        existe_ticket=true;
        activar_desactivar(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketActionPerformed
        Boton[][] botones;
        int f=-1;
        float subtotal=0.00f;
        float total;
        float iva;
        int cant=0;
     
      try { 
//"arreglo_ticket" anterior  y  arreglo ticket presente
        if (existe_ticket) {
        for (ControlAsiento datos :datos_asiento ) {
                if ((con-1)==datos.getSala()&&cbHorarios.getSelectedItem().equals(datos.getHorario())) {
                    botones=datos.getAsientos_sala();
                    
                    System.err.println("----------------------------------------");
                    
                    if (arreglo_ticket[0][0]!=null) {
                    for (int fila = 0;fila <filas; fila++) {
                             // segunda o despues compra
                        for (int columna = 0; columna < columnas; columna++) {
                           
                         if (botones[fila][columna].getText().equals(arreglo_ticket[fila][columna])) {
                                System.out.print("l");
                            }
                            else{
                               //generarTicket(columna,fila); 
                                System.out.print("s");
                                generarTicket(columna,fila);
                                subtotal+=precioBoleto();
                                cant++;
                            }
                    } System.out.println("");      
                    }
                    }
                    else{//primera compra
                        for (int fila = 0;fila <filas; fila++) {
                            for (int columna = 0; columna < columnas; columna++) {
                                if(botones[fila][columna].getText().equals("o")){
                                    System.out.print(botones[fila][columna].getText()+"     --------"); 
                                  generarTicket(columna,fila);
                                subtotal+=precioBoleto(); 
                                cant++;
                                }else{
                                  
                                }
                    } System.out.println("primera");      
                    }
                    }
                }
            }
        }
        } catch (Exception e) {
            System.out.println("error, metodo ticker");
                }
        finally {
        existe_ticket=false;
        jlSubtotal.setText("$"+subtotal+"0");
        iva=(subtotal*0.16f);
        jlIVA.setText("$"+iva);
        total=subtotal+iva;
        jlTotal.setText("$"+total);
        jlCantidad.setText(""+cant);
        
          activar_desactivar(true);
    }
    }//GEN-LAST:event_ticketActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         taTicket.setText(null);
        jlSubtotal.setText(null);
        jpTicket.setVisible(false);
        activar_desactivar(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbHorarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JLabel jlIVA;
    private javax.swing.JLabel jlPelicula;
    private javax.swing.JLabel jlSala;
    private javax.swing.JLabel jlSubtotal;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JPanel jpTicket;
    private javax.swing.JButton siguiente;
    private javax.swing.JTextArea taTicket;
    private javax.swing.JButton ticket;
    // End of variables declaration//GEN-END:variables
}
