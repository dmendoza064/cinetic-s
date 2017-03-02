
package uno;

import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.Spring.width;

/**
 *
 * @author jonathan
 */
public class Boton extends JButton implements ActionListener {
    
    public Boton(int posx,int posy,int ancho,int alto){
    super.setBounds(posx,posy,ancho,alto);
    }

    @Override
    public void actionPerformed(ActionEvent e) {  
        if(getText().equals("o"))
            JOptionPane.showMessageDialog(this, "ocupado");
        else{
        if(getText().equals("s"))
        imagen_libre();
        else
        imagen_seleccionado();
            }    
    }
    
    
    public void cambiar_nombre(int x,int y){
            setText("");
        }
    public void imagen_libre(){
        setBackground(Color.black);
        addActionListener(this);  
        setText("l");
        ImageIcon icono=new ImageIcon(getClass().getResource("asiento_libre.png"));
        int ancho = 100; 
        int alto = 100; 
        ImageIcon iconoEscala = new ImageIcon(icono.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
        setIcon(iconoEscala);
    }
    public void imagen_seleccionado(){
        setText("s");
        ImageIcon icono=new ImageIcon(getClass().getResource("asiento_seleccionado.png"));
        int ancho = 100; //
        int alto = 100; 
        ImageIcon iconoEscala = new ImageIcon(icono.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
        setIcon(iconoEscala);
    }
    public void imagen_ocupado(){
        setText("o");
        ImageIcon icono=new ImageIcon(getClass().getResource("asiento_ocupado.png"));
        int ancho = 100; 
        int alto = 100;
        ImageIcon iconoEscala = new ImageIcon(icono.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
        setIcon(iconoEscala);
    }
}