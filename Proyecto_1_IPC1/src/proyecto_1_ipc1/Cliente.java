package proyecto_1_ipc1;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import javax.swing.JOptionPane;

public class Cliente {
    
    private int CUI;
    private String Nombre;
    private String Apellido;
    public cuentaCliente lista[] = {new cuentaCliente(),new cuentaCliente(),new cuentaCliente(),new cuentaCliente(),new cuentaCliente()};
    private int id = 1;
    int ind = 0;
    
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
        
        if (ind < 5) {
            lista[ind].setID(generarId());
            lista[ind].setSaldo(0.0);
           
           lista[ind].setDisponible(false);
            JOptionPane.showMessageDialog(null, "la cuenta fue creada");
            ind++;
        } else {
            if (ind > 4) {
                JOptionPane.showMessageDialog(null, "No es posible crear mas cuentas ",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }
    
    public void diposito(int id, double monto) {
        int a = id-1;
           if (ind < 5) {
           double nuevo = lista[a].getSaldo() + monto;
            lista[a].setSaldo(nuevo);
           
           lista[a].setDisponible(false);
            
            
        } else {
            if (ind > 4) {
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
