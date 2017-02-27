
package uno;

/**
 *
 * @author jonathan
 */
public class ControlAsiento {
      private Boton[][] asientos_sala;
      private int sala;
      private String horario;

    public ControlAsiento(Boton[][] asientos_sala, int sala, String horario) {
        this.asientos_sala = asientos_sala;
        this.sala = sala;
        this.horario = horario;
    }
    

    public Boton[][] getAsientos_sala() {
        return asientos_sala;
    }

    public int getSala() {
        return sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setAsientos_sala(Boton[][] asientos_sala) {
        this.asientos_sala = asientos_sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
      
}
