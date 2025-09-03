package aguasimple;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Sistema principal simple de agua
 * Demuestra: Composición vs herencia, polimorfismo, uso de todos los conceptos
 */
public class SistemaAguaSimple {

    // Atributos usando composición (no herencia)
    private List<Usuario> usuarios;
    private Scanner scanner;
    private String nombreEmpresa;

    /**
     * Constructor
     * Demuestra: composición, inicialización
     */
    public SistemaAguaSimple(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.usuarios = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Método principal
     */
    public static void main(String[] args) {
        System.out.println("=== SISTEMA SIMPLE DE AGUA ===");
        System.out.println("Demostrando todos los conceptos de POO de forma sencilla\n");

        // Crear sistema
        SistemaAguaSimple sistema = new SistemaAguaSimple("Agua Limpia S.A.");

        // Cargar datos de ejemplo
        sistema.cargarDatosEjemplo();

        // Mostrar menú
        sistema.mostrarMenu();
    }

    /**
     * Carga datos de ejemplo para demostrar el sistema
     * Demuestra: Polimorfismo, factory methods, diferentes constructores
     */
    private void cargarDatosEjemplo() {
        System.out.println("Cargando datos de ejemplo...");

        // Crear usuarios usando diferentes constructores (sobrecarga)
        Usuario casa1 = new Usuario("Juan Pérez", "Calle 123"); // Constructor por defecto (CASA)
        Usuario negocio1 = new Usuario("Tienda El Sol", "Avenida 45", TipoUsuario.NEGOCIO);
        Usuario fabrica1 = new Usuario("Fábrica ABC", "Zona Industrial", TipoUsuario.FABRICA);

        // Agregar consumos usando factory method
        casa1.agregarConsumo(ConsumoMes.crear("Enero", 1000, 1150, TipoUsuario.CASA));
        casa1.agregarConsumo(ConsumoMes.crear("Febrero", 1150, 1280, TipoUsuario.CASA));

        negocio1.agregarConsumo(ConsumoMes.crear("Enero", 2000, 2300, TipoUsuario.NEGOCIO));

        fabrica1.agregarConsumo(ConsumoMes.crear("Enero", 5000, 7500, TipoUsuario.FABRICA));

        // Agregar usuarios al sistema
        usuarios.add(casa1);
        usuarios.add(negocio1);
        usuarios.add(fabrica1);

        System.out.println("Datos cargados. Total de personas en el sistema: " + Persona.getTotalPersonas());
        System.out.println();
    }

    /**
     * Muestra el menú principal
     */
    private void mostrarMenu() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Ver todos los usuarios");
            System.out.println("2. Agregar nuevo usuario");
            System.out.println("3. Registrar consumo");
            System.out.println("4. Ver reporte de usuario");
            System.out.println("5. Ver estadísticas generales");
            System.out.println("6. Demostrar conceptos POO");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        verTodosLosUsuarios();
                        break;
                    case 2:
                        agregarNuevoUsuario();
                        break;
                    case 3:
                        registrarConsumo();
                        break;
                    case 4:
                        verReporteUsuario();
                        break;
                    case 5:
                        verEstadisticas();
                        break;
                    case 6:
                        demostrarConceptosPOO();
                        break;
                    case 0:
                        continuar = false;
                        System.out.println("¡Gracias por usar " + nombreEmpresa + "!");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
                System.out.println();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println();
            }
        }
    }

    /**
     * Muestra todos los usuarios (polimorfismo - toString)
     */
    private void verTodosLosUsuarios() {
        System.out.println("\n=== TODOS LOS USUARIOS ===");
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados");
            return;
        }

        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            System.out.printf("%d. %s\n", i + 1, usuario.toString()); // Polimorfismo
        }
    }

    /**
     * Agrega un nuevo usuario
     * Demuestra: constructores, enums, validación
     */
    private void agregarNuevoUsuario() {
        System.out.println("\n=== AGREGAR USUARIO ===");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.println("\nTipos de usuario:");
        TipoUsuario[] tipos = TipoUsuario.values(); // Uso de enum
        for (int i = 0; i < tipos.length; i++) {
            System.out.printf("%d. %s\n", i + 1, tipos[i]);
        }

        System.out.print("Seleccione tipo (1-" + tipos.length + "): ");
        int tipoIndex = Integer.parseInt(scanner.nextLine()) - 1;

        if (tipoIndex >= 0 && tipoIndex < tipos.length) {
            Usuario nuevo = new Usuario(nombre, direccion, tipos[tipoIndex]);
            usuarios.add(nuevo);
            System.out.println("Usuario creado: " + nuevo);
        } else {
            System.out.println("Tipo inválido");
        }
    }

    /**
     * Registra un nuevo consumo
     * Demuestra: búsqueda, validación, factory methods
     */
    private void registrarConsumo() {
        System.out.println("\n=== REGISTRAR CONSUMO ===");

        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios. Agregue usuarios primero.");
            return;
        }

        verTodosLosUsuarios();
        System.out.print("Seleccione usuario (1-" + usuarios.size() + "): ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < usuarios.size()) {
            Usuario usuario = usuarios.get(index);

            System.out.print("Mes: ");
            String mes = scanner.nextLine();

            System.out.print("Lectura anterior: ");
            double anterior = Double.parseDouble(scanner.nextLine());

            System.out.print("Lectura actual: ");
            double actual = Double.parseDouble(scanner.nextLine());

            // Usar factory method
            ConsumoMes consumo = ConsumoMes.crear(mes, anterior, actual, usuario.getTipoUsuario());
            usuario.agregarConsumo(consumo);

            System.out.println("Consumo registrado: " + consumo);
            System.out.println("Costo calculado: " + consumo.mostrarCosto()); // Método default de interface
        } else {
            System.out.println("Usuario inválido");
        }
    }

    /**
     * Muestra reporte detallado de un usuario
     * Demuestra: polimorfismo, composición
     */
    private void verReporteUsuario() {
        System.out.println("\n=== REPORTE DE USUARIO ===");

        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados");
            return;
        }

        verTodosLosUsuarios();
        System.out.print("Seleccione usuario (1-" + usuarios.size() + "): ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < usuarios.size()) {
            Usuario usuario = usuarios.get(index);

            System.out.println("\n--- INFORMACIÓN DETALLADA ---");
            System.out.println("Usuario: " + usuario.toString());
            System.out.println("Tipo de servicio: " + usuario.getTipoUsuario());
            System.out.println("Total de consumos: " + usuario.getConsumos().size());
            System.out.printf("Consumo total: %.1f litros\n", usuario.getConsumoTotal());
            System.out.printf("Costo total: $%.2f\n", usuario.getCostoTotal());

            System.out.println("\n--- HISTORIAL DE CONSUMOS ---");
            List<ConsumoMes> consumos = usuario.getConsumos();
            for (ConsumoMes consumo : consumos) {
                System.out.println("• " + consumo.toString()); // Polimorfismo
            }
        } else {
            System.out.println("Usuario inválido");
        }
    }

    /**
     * Muestra estadísticas generales del sistema
     * Demuestra: static, streams, agregación
     */
    private void verEstadisticas() {
        System.out.println("\n=== ESTADÍSTICAS GENERALES ===");
        System.out.println("Empresa: " + nombreEmpresa);
        System.out.println("Total de personas creadas: " + Persona.getTotalPersonas()); // Método static
        System.out.println("Usuarios activos: " + usuarios.size());

        // Calcular totales usando streams
        double consumoTotal = usuarios.stream()
                .mapToDouble(Usuario::getConsumoTotal)
                .sum();

        double ingresoTotal = usuarios.stream()
                .mapToDouble(Usuario::getCostoTotal)
                .sum();

        System.out.printf("Consumo total del sistema: %.1f litros\n", consumoTotal);
        System.out.printf("Ingresos totales: $%.2f\n", ingresoTotal);

        // Contar por tipo usando enum
        System.out.println("\n--- Por tipo de usuario ---");
        for (TipoUsuario tipo : TipoUsuario.values()) {
            long cantidad = usuarios.stream()
                    .filter(u -> u.getTipoUsuario() == tipo)
                    .count();
            System.out.printf("%s: %d usuarios\n", tipo.getDescripcion(), cantidad);
        }
    }

    /**
     * Demuestra específicamente los conceptos POO
     */
    private void demostrarConceptosPOO() {
        System.out.println("\n=== CONCEPTOS POO IMPLEMENTADOS ===");

        System.out.println("✓ 1. CLASES Y OBJETOS:");
        System.out.println("   - Persona, Usuario, ConsumoMes son clases");
        System.out.println("   - Cada usuario es un objeto de la clase Usuario");

        System.out.println("\n✓ 2. ENCAPSULAMIENTO:");
        System.out.println("   - Atributos privados con getters/setters");
        System.out.println("   - Validación en setters (ejemplo: nombre no vacío)");
        System.out.println("   - Encapsulamiento defensivo en listas");

        System.out.println("\n✓ 3. HERENCIA Y SUPER:");
        System.out.println("   - Usuario extends Persona");
        System.out.println("   - super() en constructores");

        System.out.println("\n✓ 4. POLIMORFISMO:");
        System.out.println("   - Interface Calculable implementada por ConsumoMes");
        System.out.println("   - toString() sobrescrito en todas las clases");
        System.out.println("   - Método getTipo() abstracto implementado");

        System.out.println("\n✓ 5. ABSTRACCIÓN:");
        System.out.println("   - Persona es clase abstracta");
        System.out.println("   - Calculable es interface con método default");

        System.out.println("\n✓ 6. STATIC Y FINAL:");
        System.out.println("   - Contador static: " + Persona.getTotalPersonas());
        System.out.println("   - Atributos final (id no cambia)");
        System.out.println("   - Factory methods estáticos");

        System.out.println("\n✓ 7. ENUMS:");
        System.out.println("   - TipoUsuario con constructor y métodos");

        System.out.println("\n✓ 8. COMPOSICIÓN VS HERENCIA:");
        System.out.println("   - Usuario TIENE ConsumoMes (composición)");
        System.out.println("   - Sistema usa composición, no herencia");

        System.out.println("\n✓ 9. CONSTRUCTORES Y SOBRECARGA:");
        System.out.println("   - Múltiples constructores en Usuario");
        System.out.println("   - this() para llamar otros constructores");

        System.out.println("\n✓ 10. EQUALS Y HASHCODE:");
        System.out.println("    - Sobrescritos en todas las clases");
        System.out.println("    - Importantes para usar en colecciones");

        System.out.println("\n¡TODOS LOS CONCEPTOS FUNCIONANDO! 🎉");
    }
}
