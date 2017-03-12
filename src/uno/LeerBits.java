/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uno;

import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class LeerBits 
{
    //lee el archivo
    private InputStream fis1;
    private FileInputStream entrada;
    private DataInputStream lee;
    //escribe a documento
    private OutputStream fis;
    private FileOutputStream salida;
    private DataOutputStream escribe;
    //archivo
    private File archivo1;
     private float cantidad[];
     List<Dulceria> listInventario;

    public LeerBits(File archivo) throws IOException
    {
        
     archivo1=archivo;
     
     
        
    }
    
    public List<Dulceria> lee() throws IOException {
         listInventario = new ArrayList<>();
          //  entrada = new FileInputStream(archivo1);
            lee=new DataInputStream(new FileInputStream(archivo1));
        try {
            System.out.println("entero////");
            while (true) {
                String name = lee.readUTF();
                String des= lee.readUTF();
                float pre = lee.readFloat();
                int can = lee.readInt();
                
                System.out.println(name);
                Dulceria dulce = new Dulceria(name, des, pre, can);
                System.out.println(dulce.toString());
                listInventario.add(dulce);
                
            }
            
           
        } catch (IOException ex) {
            // reach end of file
        }
            
        lee.close();
        System.out.println(" "+listInventario.size());
        return listInventario;
    }
    
    
    
    public  void Escribe( Dulceria dulce) throws IOException
    {
        salida = new FileOutputStream(archivo1);
            escribe = new DataOutputStream(salida);
        try {
            
            
            //System.out.println("entro***");
            escribe.writeUTF(dulce.getNombre());
            escribe.writeUTF(dulce.getDescripcion());
            escribe.writeFloat(dulce.getPrecio());
            escribe.writeInt(dulce.getCantidad());
            
            
            
            
        } catch (Exception e) {
        }
         escribe.close();
         
         //System.out.println(dulce.toString()+"///**a");
    }
    
}
