
package uno;

/**
 *
 * @author jonathan
 */
public class Empleados {
    private int empleadoIDs[] = {1, 2, 3, 5};
    private String empleadoNombres[] = {"Fidel Castro", "Adolf Hitler", "Kim-Jong", "Mark Henry"};
    private int empleadoClaves[] = {1234, 4567, 7891, 4321};
    private int empleadoID = 0, empleadoClave = 0;
    private String empleadoNombre= "";

    public int[] getEmpleadoIDs() {
        return empleadoIDs;
    }

    public String[] getEmpleadoNombres() {
        return empleadoNombres;
    }

    public int[] getEmpleadoClaves() {
        return empleadoClaves;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public int getEmpleadoClave() {
        return empleadoClave;
    }

    public String getEmpleadoNombre() {
        return empleadoNombre;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public void setEmpleadoClave(int empleadoClave) {
        this.empleadoClave = empleadoClave;
    }

    public void setEmpleadoNombre(String empleadoNombre) {
        this.empleadoNombre = empleadoNombre;
    }
}
