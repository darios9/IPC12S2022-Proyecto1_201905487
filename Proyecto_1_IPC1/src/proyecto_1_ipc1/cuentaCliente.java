package proyecto_1_ipc1;

import ventanas.CrearCuenta;

public class cuentaCliente {

    private int ID;
    private boolean disponible = true;
    private double Saldo;

    public cuentaCliente() {
    }

    public cuentaCliente(int ID, double saldo) {
        this.ID = ID;
        this.Saldo = Saldo;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

}
