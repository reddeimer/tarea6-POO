import java.util.Scanner;
import ec.gob.subsidio.modelo.SolicitanteSubsidio;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SolicitanteSubsidio.mostrarReglasSubsidio();

        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese su ingresos 'mensuales': ");
        double ingresos = sc.nextDouble();

        System.out.print("Ingrese la cantidad de vehículos: ");
        int vehiculos = sc.nextInt();

        System.out.print("¿Vive en Ecuador? (true/false): ");
        boolean vive = sc.nextBoolean();

        SolicitanteSubsidio s = new SolicitanteSubsidio(
                nombre, cedula, ingresos, vehiculos, vive
        );

        System.out.println("\n-------DATOS DEL SOLICITANTE-------");
        System.out.println(s);

        s.generarResultado();

        System.out.println("---Calculo consumo mensual-----");
        System.out.println("\nConsumo normal: " + s.calcularConsumoMensual() + " galones");
        System.out.println("Consumo con extra: " + s.calcularConsumoMensual(200) + " galones");

    }
}