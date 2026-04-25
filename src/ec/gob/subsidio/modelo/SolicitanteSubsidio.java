package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {

    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales,
                               int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        setIngresosMensuales(ingresosMensuales); // usamos setter para validar
        setCantidadVehiculos(cantidadVehiculos); // usamos setter para validar
        this.viveEnEcuador = viveEnEcuador;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470) {
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("Ingreso inválido. Se asigna 470 por defecto.");
            this.ingresosMensuales = 470;
        }
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos >= 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("Cantidad inválida. Se asigna 0.");
            this.cantidadVehiculos = 0;
        }
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    public boolean subsidioAprobado() {
        return ingresosMensuales <= 1200 &&
                cantidadVehiculos <= 1 &&
                viveEnEcuador;
    }

    public void generarResultado() {
        System.out.println("\n-----Resultado de la evaluacion------");
        if (subsidioAprobado()) {
            System.out.println("Subsidio APROBADO: Cumple con los requisitos");
        } else {
            System.out.println("Subsidio RECHAZADO");

            if (ingresosMensuales > 1200) {
                System.out.println("- Supera el límite de ingresos.");
            }
            if (cantidadVehiculos > 1) {
                System.out.println("- Tiene más de un vehículo.");
            }
            if (!viveEnEcuador) {
                System.out.println("- No reside en Ecuador.");
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto +
                "\nCédula: " + cedula +
                "\nIngresos: " + ingresosMensuales +
                "\nVehículos: " + cantidadVehiculos +
                "\nReside en Ecuador: " + viveEnEcuador;
    }

    public static void mostrarReglasSubsidio() {
        System.out.println("========REGLAS DEL SUBSIDIO========");
        System.out.println("1. Ingresos <= 1200");
        System.out.println("2. Máximo 1 vehículo");
        System.out.println("3. Residir en Ecuador");
        System.out.println("===================================");
    }

    public double calcularConsumoMensual() {
        double km = 1000; // ejemplo base
        return km / 40;
    }

    public double calcularConsumoMensual(double kmExtra) {
        double km = 1000 + kmExtra;
        return km / 40;
    }
}