package Ejercicio2;

public class CuentaAhorros extends CuentaBancaria {

    private double tasaAnual = 0.03;
    private String tipoCuenta = "Cuenta de ahorros";

    public CuentaAhorros(String titular, String numeroCuenta, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    protected double calcularInteresMensual() {
        return (getSaldo() * tasaAnual) / 12;
    }

    public void mostrarInfo() {
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        super.mostrarInfo();
    }
}
