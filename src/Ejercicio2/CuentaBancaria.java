package Ejercicio2;

abstract class CuentaBancaria {
    private String titular;
    private double saldo;
    private String numeroCuenta;

    // Creo la cuenta bancaria
    public CuentaBancaria (String titular, String numeroCuenta, double saldoInicial){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    protected String getNumeroCuenta() {
        return numeroCuenta;
    }

    protected String getTitular() {
        return titular;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Deposito en las cuentas
    public void depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
            System.out.println("Deposito exitoso.");
        } else {
            System.out.println("Deposito inválido.");
        }
    }

    // Retiro en las cuentas
    public void retiro(double retiro) {
        if (retiro > 0 && retiro <= saldo) {
            saldo -= retiro;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Retiro inválido.");
        }
    }

    protected abstract double calcularInteresMensual();

    public void mostrarInfo() {
        System.out.println("Numero de cuenta: " + getNumeroCuenta());
        System.out.println("Titular de cuenta: " + getTitular());
        System.out.println("Sáldo de cuenta: " + getSaldo());
        System.out.println("Interés Mensual generado: " + calcularInteresMensual());
    }
}
