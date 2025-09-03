package aguasimple;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Usuario que hereda de Persona
 * Demuestra: Herencia, super, this, sobrecarga de constructores, composición
 */
public class Usuario extends Persona {

    // Atributos específicos de Usuario
    private TipoUsuario tipo;
    private boolean activo;
    private List<ConsumoMes> consumos; // Composición - Usuario TIENE consumos

    /**
     * Constructor principal
     * Demuestra: super, this, composición
     */
    public Usuario(String nombre, String direccion, TipoUsuario tipo) {
        super(nombre, direccion); // Llamar constructor del padre
        this.tipo = tipo;
        this.activo = true;
        this.consumos = new ArrayList<>(); // Inicializar lista de consumos
    }

    /**
     * Constructor sobrecargado - tipo residencial por defecto
     * Demuestra: sobrecarga de constructores, this
     */
    public Usuario(String nombre, String direccion) {
        this(nombre, direccion, TipoUsuario.CASA); // Llamar al otro constructor
    }

    // Getters y setters (encapsulamiento)
    public TipoUsuario getTipoUsuario() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * Obtiene copia de los consumos (encapsulamiento defensivo)
     */
    public List<ConsumoMes> getConsumos() {
        return new ArrayList<>(consumos);
    }

    /**
     * Agrega un nuevo consumo
     * Demuestra: encapsulamiento, validación
     */
    public void agregarConsumo(ConsumoMes consumo) {
        if (consumo == null) {
            throw new IllegalArgumentException("El consumo no puede ser nulo");
        }
        consumos.add(consumo);
    }

    /**
     * Calcula el consumo total de todos los meses
     */
    public double getConsumoTotal() {
        return consumos.stream()
                .mapToDouble(ConsumoMes::getLitros)
                .sum();
    }

    /**
     * Calcula el costo total de todos los meses
     */
    public double getCostoTotal() {
        return consumos.stream()
                .mapToDouble(ConsumoMes::calcularCosto)
                .sum();
    }

    /**
     * Obtiene el último consumo registrado
     */
    public ConsumoMes getUltimoConsumo() {
        if (consumos.isEmpty()) {
            return null;
        }
        return consumos.get(consumos.size() - 1);
    }

    // Implementación del método abstracto (polimorfismo)
    @Override
    public String getTipo() {
        return "Usuario";
    }

    // toString sobrescrito (polimorfismo)
    @Override
    public String toString() {
        return String.format("Usuario{id=P-%d, nombre='%s', tipo=%s, activo=%s, consumos=%d}",
                getId(), getNombre(), tipo.getDescripcion(), activo, consumos.size());
    }
}
