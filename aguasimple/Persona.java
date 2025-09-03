package aguasimple;

/**
 * Clase abstracta que representa una persona en el sistema
 * Demuestra: Abstracción, encapsulamiento, static, constructores
 */
public abstract class Persona {

    // Contador estático (static) - compartido por todas las personas
    private static int totalPersonas = 0;

    // Constante (static final)
    protected static final String PREFIJO_ID = "P-";

    // Atributos de instancia (encapsulamiento)
    private final int id; // final - no cambia después de crear el objeto
    private String nombre;
    private String direccion;

    /**
     * Constructor protegido - solo subclases pueden usarlo
     * Demuestra: super, this, encapsulamiento
     */
    protected Persona(String nombre, String direccion) {
        this.id = ++totalPersonas; // Incrementar contador estático
        this.setNombre(nombre); // Usar setter para validación
        this.setDireccion(direccion);
    }

    // Getters (encapsulamiento)
    public final int getId() { // final - no puede ser sobrescrito
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    // Setters con validación (encapsulamiento + invariantes)
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre.trim();
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía");
        }
        this.direccion = direccion.trim();
    }

    // Método estático (static)
    public static int getTotalPersonas() {
        return totalPersonas;
    }

    // Método abstracto - las subclases DEBEN implementarlo
    public abstract String getTipo();

    // toString sobrescrito (polimorfismo)
    @Override
    public String toString() {
        return String.format("%s{id=%s%d, nombre='%s', direccion='%s'}",
                getTipo(), PREFIJO_ID, id, nombre, direccion);
    }

    // equals y hashCode sobrescritos (importantes para colecciones)
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Persona persona = (Persona) obj;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
