package aguasimple;

/**
 * Clase que representa el consumo de agua de un mes
 * Demuestra: Implementación de interfaces, encapsulamiento, inmutabilidad
 */
public class ConsumoMes implements Calculable {

    // Atributos (inmutables después de creación)
    private final String mes;
    private final int año;
    private final double lecturaAnterior;
    private final double lecturaActual;
    private final double litros;
    private final TipoUsuario tipoUsuario;

    /**
     * Constructor
     * Demuestra: validación, this, inmutabilidad
     */
    public ConsumoMes(String mes, int año, double lecturaAnterior,
            double lecturaActual, TipoUsuario tipoUsuario) {

        // Validaciones (invariantes)
        if (mes == null || mes.trim().isEmpty()) {
            throw new IllegalArgumentException("El mes no puede estar vacío");
        }
        if (año < 2000 || año > 2030) {
            throw new IllegalArgumentException("Año inválido");
        }
        if (lecturaAnterior < 0 || lecturaActual < 0) {
            throw new IllegalArgumentException("Las lecturas no pueden ser negativas");
        }
        if (lecturaActual < lecturaAnterior) {
            throw new IllegalArgumentException("La lectura actual debe ser mayor o igual a la anterior");
        }

        this.mes = mes.trim();
        this.año = año;
        this.lecturaAnterior = lecturaAnterior;
        this.lecturaActual = lecturaActual;
        this.litros = lecturaActual - lecturaAnterior;
        this.tipoUsuario = tipoUsuario;
    }

    // Getters (solo lectura - encapsulamiento)
    public String getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public double getLecturaAnterior() {
        return lecturaAnterior;
    }

    public double getLecturaActual() {
        return lecturaActual;
    }

    public double getLitros() {
        return litros;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    // Implementación de la interfaz Calculable (polimorfismo)
    @Override
    public double calcularCosto() {
        return tipoUsuario.calcular(litros);
    }

    /**
     * Método factory estático para crear consumo con lecturas simples
     * Demuestra: Factory methods, static
     */
    public static ConsumoMes crear(String mes, double lecturaAnterior,
            double lecturaActual, TipoUsuario tipo) {
        return new ConsumoMes(mes, 2025, lecturaAnterior, lecturaActual, tipo);
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return String.format("ConsumoMes{%s %d: %.1f litros, %s}",
                mes, año, litros, mostrarCosto());
    }

    // equals y hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ConsumoMes that = (ConsumoMes) obj;
        return año == that.año &&
                Double.compare(that.lecturaAnterior, lecturaAnterior) == 0 &&
                Double.compare(that.lecturaActual, lecturaActual) == 0 &&
                mes.equals(that.mes);
    }

    @Override
    public int hashCode() {
        return mes.hashCode() + año + (int) (lecturaAnterior + lecturaActual);
    }
}
