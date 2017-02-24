
package uno;

/**
 *
 * @author jonathan
 */
public class Cartelera {
 private String horarios[][]={
                       {"1:15","2:50","3:20","1:50"},
                       {"2:30","6:10","4:30","3:20"},
                       {"4:40","7:50","5:10","8:10"},
                       {"10:30","9:30","7:10","9:00"}}; 
  
 private int salas []= {1,2,3,4};
 private String peliculas[]= {"1", "2", "3", "4"};
 private String pelicula="",horario;
 private int sala=0;

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
}
