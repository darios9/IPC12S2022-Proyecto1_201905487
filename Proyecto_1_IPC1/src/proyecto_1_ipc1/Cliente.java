package proyecto_1_ipc1;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import javax.swing.JOptionPane;

public class Cliente {

    private int CUI;
    private String Nombre;
    private String Apellido;
    public cuentaCliente lista[] = {new cuentaCliente(), new cuentaCliente(), new cuentaCliente(), new cuentaCliente(), new cuentaCliente()};
    private int id = 120;
    int contador = 0;

    public Cliente() {
    }

    public Cliente(int CUI, String Nombre, String Apellido) {
        this.CUI = CUI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;

    }
// metodo para crear id

    public int generarId() {
        int a;
        a = id++;
        return a;
    }

    public void crearCuenta() {

        if (contador < 5) {
            lista[contador].setID(generarId());
            lista[contador].setSaldo(0);
            lista[contador].setDisponible(false);
            JOptionPane.showMessageDialog(null, "la cuenta fue creada");
            contador++;
        } else {
            if (contador > 4) {
                JOptionPane.showMessageDialog(null, "No es posible crear mas cuentas ",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }

       
    }

    public int getCUI() {
        return CUI;
    }

    public void setCUI(int CUI) {
        this.CUI = CUI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "cui: " + CUI + "^\n" + "Nombre: " + Nombre + "\n" + "";
    }

}
