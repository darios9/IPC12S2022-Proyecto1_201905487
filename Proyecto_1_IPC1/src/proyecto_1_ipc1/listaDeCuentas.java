package proyecto_1_ipc1;

import javax.swing.JOptionPane;

public class listaDeCuentas {

    public cuentaCliente lista[] = {new cuentaCliente(),new cuentaCliente(),new cuentaCliente(),new cuentaCliente(),new cuentaCliente()};
    private int ID;
    int contador = 0;

   /* public void llenarLista(int ID, String cliente, int saldo) {
        lista[contador] = new cuentaCliente(ID, cliente, saldo);
        contador++;
    }*/

    public int generarID() {
        int a;
        a = ID++;
        return a;
    }

   /* public void crearCuenta(String cliente, int saldo) {
        if (contador < 5) {
            
            llenarLista(generarID(), cliente, saldo);
            JOptionPane.showMessageDialog(null, "la cuenta fue creada");
        } else {
            if (contador > 4) {
                JOptionPane.showMessageDialog(null, "No es posible cerar mas cuentas ",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }

    }*/
public void iprimirCuenta(){
    for (int i = 0; i < lista.length; i++) {
        System.out.println(lista[i]);
    }

}
}
