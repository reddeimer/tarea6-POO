package Ejercicio2;

public class CuentaInversion extends CuentaBancaria {

    private String tipoCuenta = "Cuenta de inversión";

    public CuentaInversion(String titular, String numeroCuenta, double saldo) {
        super(titular, numeroCuenta, saldo);
    }

    @Override
    protected double calcularInteresMensual() {
        if (getSaldo() < 1000) {
            return (getSaldo() * 0.04) /12;
        } else if (getSaldo() <= 5000) {
            return (getSaldo() * 0.05) /12;
        } else {
            return (getSaldo() * 0.06) /12;
        }
    }

    public void mostrarInfo() {
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        super.mostrarInfo();
    }
}
