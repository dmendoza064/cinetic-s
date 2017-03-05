/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class ControlTicket {
    MenuPrincipal mp=new MenuPrincipal();
    private ArrayList <String> tickets=new ArrayList<String>();
    int indice=0;
    public void generarTicket (String s,int n){
      
    tickets.add(indice, "Cine-Tics\n"
                       +"Sala ");
    
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
}
