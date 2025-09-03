package aguasimple;

/**
 * Enum que define tipos de usuario con tarifas
 * Demuestra: Enums, constructores en enum, métodos en enum
 */
public enum TipoUsuario {
    CASA("Residencial", 0.15),
    NEGOCIO("Comercial", 0.25),
    FABRICA("Industrial", 0.35);

    // Atributos del enum (final implícito)
    private final String descripcion;
    private final double tarifa;

    // Constructor del enum
    TipoUsuario(String descripcion, double tarifa) {
        this.descripcion = descripcion;
        this.tarifa = tarifa;
    }

    // Getters
    public String getDescripcion() {
        return descripcion;
    }

    public double getTarifa() {
        return tarifa;
    }

    // Método que calcula costo basado en litros
    public double calcular(double litros) {
        return litros * tarifa;
    }

    @Override
    public String toString() {
        return descripcion + " ($" + tarifa + " por litro)";
    }
}
