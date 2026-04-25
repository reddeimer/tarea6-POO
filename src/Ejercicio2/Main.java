package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    void main() {
        List<CuentaBancaria> cuentas = new ArrayList<>();

        cuentas.add(new CuentaAhorros("Ana Pérez", "001", 1200));
        cuentas.add(new CuentaCorriente("Luis Gómez", "002", 800));
        cuentas.add(new CuentaInversion("María López", "003", 7000));

        double totalIntereses = 0;

        for (CuentaBancaria cuenta : cuentas) {

            double interes = cuenta.calcularInteresMensual();
            totalIntereses += interes;

            cuenta.mostrarInfo();
            System.out.println("--------------------------");
        }

        System.out.println("Total intereses del banco: " + totalIntereses);
    }
}
