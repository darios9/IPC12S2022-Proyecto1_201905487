package proyecto_1_ipc1;

import javax.swing.JOptionPane;

public class Controladores {

    public Cliente cliente[] = {new Cliente(), new Cliente(), new Cliente(), new Cliente(), new Cliente()};
    private int contador = 0;

//metodo para buscar el cui que no se repita
    public boolean buscarCUI(int cui) {
        boolean existe = true;
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i].getCUI() == cui) {
                existe = false;
            } else {
                if (cliente[i].getCUI() == 0) {

                }
            }

        }

        return existe;
    }
// metodo que me llena el  vector

    public void crearCliente(int cui, String nombre, String apellido) {

        cliente[contador] = new Cliente(cui, nombre, apellido);
        contador++;
    }

//metodo para crear clientes y verificar 
// y que me llame los mensajes de advertencia 
    public void crearCliente2(int cui, String nombre, String apellido) {

        if (buscarCUI(cui) == true) {
            if (contador < 5) {

                crearCliente(cui, nombre, apellido);
                JOptionPane.showMessageDialog(null, "el cliente se a creado con exito");
            }
        } else {
            if (buscarCUI(cui) == false) {
                JOptionPane.showMessageDialog(null, "no se puede crear cliente con CUi \n duplicado, el CUI ya \n ya existe en el sistema",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            if (contador > 5) {
                JOptionPane.showMessageDialog(null, "no es posible crear mas clientes",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

//metodo para crear y verificar cuenta 
    public void verificarCuenta(int cui) {
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i].getCUI() == cui) {
                cliente[i].crearCuenta();
            } else {

            }
        }
    }

//metodo para buscar cui y me devuelve la posicion  donde se encuentra 
//prara recorre la lista de cuentas
    public int buscarIndice(int cui) {
        int indic = 5;
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i].getCUI() == cui) {
                indic = i;
            } else {
                if (cliente[i].getCUI() == 0) {

                }
            }

        }
        return indic;
    }
//metodo para depositar en la cuenta del cliente

    public void depositarCuenta(int cui, double monto, int Nocuenta) {
        int a = buscarIndice(cui);

        if (a < 5) {

            for (int i = 0; i < cliente[a].lista.length; i++) {
                if (cliente[a].lista[i].getID() == Nocuenta) {
                    System.out.println(cliente[a].lista[i].getID());
                    double b = (cliente[a].lista[i].getSaldo() + monto);
                    cliente[a].lista[i].setSaldo(b);
                    JOptionPane.showMessageDialog(null, "deposito realizado exitosamente");

                }
            }
        } else {
            if (a > 4) {
                JOptionPane.showMessageDialog(null, "la cuenta no existe",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

// imprimir matriz de objetos
    public void imprimir() {
        for (int i = 0; i < cliente.length; i++) {
            System.out.println(cliente[i]);
        }

    }

}
