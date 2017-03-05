
package uno;

/**
 *
 * @author jonathan
 */
public class Cartelera {
 private String horarios[][]={
                       {"01:15 PM","02:50 PM","03:20 PM","01:50 PM"},//horarios
                       {"02:30 PM","06:10 PM","04:30 PM","03:20 PM"},
                       {"04:40 PM","07:50 PM","05:10 PM","08:10 PM"},
                       {"10:30 PM","09:30 PM","07:10 PM","09:00 PM"}}; 
  
 private int salas []= {1,2,3,4};
 private String peliculas[]= {"CINCUENTA SOMBRAS DE GREY", "DOCTOR STRANGE", "ESCUADRÓN SUICIDIA", "MAZE RUNNER"};
 private String pelicula="",horario;
 private int sala=0;
   private Cartelera []carteleras;
   private  int indice;
  
 
 

    public String[][] getHorarios() {
        return horarios;
    }

    public String getHorario() {
        return horario;
    }
    

    public int[] getSalas() {
        return salas;
    }

    public String[] getPeliculas() {
        return peliculas;
    }

    public String getPelicula() {
        return pelicula;
    }


    public int getSala() {
        return sala;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
     
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
    
    private void setNuevo (String horario,String pelicula,int sala){
    carteleras[indice].setHorario(horario);
    carteleras[indice].setPelicula(pelicula);
    carteleras[indice].setSala(sala);
    
    }
 
    
   
   
  /* private void elemento_mas (Cartelera[]actual){
   n_elementos=actual.length;
   carteleras=new Cartelera[n_elementos+1];
   for (int i=0;i<n_elementos;i++){
   carteleras[i]=actual[i];
   }
   n_elementos++;
   }
   private void elemento_menos (Cartelera[]actual){
   if (actual.length==0)return;
   int k=0;
   n_elementos=actual.length;
   carteleras=new Cartelera[n_elementos-1];
    for (int i=0;i<n_elementos;i++){
    if (actual[i]!=null){
    carteleras[k++]=actual[i];
    }
     }
}   */
}
