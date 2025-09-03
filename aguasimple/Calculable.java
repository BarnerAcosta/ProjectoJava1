package aguasimple;

/**
 * Interface simple para objetos que pueden calcular costos
 * Demuestra: Interfaces, métodos default
 */
public interface Calculable {

    // Método abstracto que debe implementar cada clase
    double calcularCosto();

    // Método default 
    default String mostrarCosto() {
        return String.format("Costo: $%.2f", calcularCosto());
    }
}
