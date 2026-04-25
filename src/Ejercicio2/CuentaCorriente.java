package Ejercicio2;

public class CuentaCorriente extends CuentaBancaria {

    private String tipoCuenta = "Cuenta corriente";

    public CuentaCorriente(String titular, String numeroCuenta, double saldo) {
        super(titular, numeroCuenta, saldo);
    }

    @Override
    public void retiro(double retiro) {
        if (retiro > 0) {
            if ((getSaldo() - retiro) >= -500) {
                setSaldo((getSaldo() - retiro));
                System.out.println("Retiro exitoso.");
            } else {
                System.out.println("Retiro excede del sobregiro máximo permitido (500).");
            }
        }
    }

    @Override
    protected double calcularInteresMensual() {
        return 0;
    }

    public void mostrarInfo() {
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        super.mostrarInfo();
    }
}
