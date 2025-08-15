import java.util.*;

public class InventarioSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> inventario = new HashMap<>();

        System.out.print("Ingrese el número de productos (M): ");
        int M = sc.nextInt();
        sc.nextLine(); // Limpiar salto de línea

        if (M <= 0) {
            System.out.println("No hay productos para procesar.");
            sc.close();
            return;
        }

        for (int i = 1; i <= M; i++) {
            System.out.printf("Producto #%d - Nombre: ", i);
            String nombre = sc.nextLine().trim();
            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacío. Intente de nuevo.");
                i--; // Repetir este ciclo
                continue;
            }
            System.out.printf("Producto #%d - Stock: ", i);
            int stock = sc.nextInt();
            sc.nextLine(); // Limpiar salto de línea
            inventario.put(nombre, stock);
        }

        // Mostrar inventario
        System.out.println("\n--- Inventario ---");
        int totalUnidades = 0;
        String productoMax = null;
        int maxStock = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.printf("%s: %d unidades\n", entry.getKey(), entry.getValue());
            totalUnidades += entry.getValue();
            if (entry.getValue() > maxStock) {
                maxStock = entry.getValue();
                productoMax = entry.getKey();
            }
        }
        System.out.printf("Total de unidades: %d\n", totalUnidades);
        if (productoMax != null) {
            System.out.printf("Producto con mayor stock: %s (%d unidades)\n", productoMax, maxStock);
        }
        sc.close();
    }
}
