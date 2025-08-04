import java.util.Scanner;

public class Almacenwc {
    public static void main(String[] args) {

        // PASO 1: Definir los precios iniciales
        double zapatos = 350000;
        double tenis = 280000;
        double camisetas = 175000;
        double jeans = 200000;

        // PASO 2: Mostrar el almacén y precios iniciales
        System.out.println("=== ALMACEN WC ===");
        System.out.println();
        System.out.println("ARTICULOS Y PRECIOS ACTUALES:");
        System.out.println("Zapatos: $" + zapatos);
        System.out.println("Tenis: $" + tenis);
        System.out.println("Camisetas: $" + camisetas);
        System.out.println("Jeans: $" + jeans);

        // PASO 3: Calcular el costo total
        double total = zapatos + tenis + camisetas + jeans;
        System.out.println();
        System.out.println("Costo total de los cuatro articulos: $" + total);

        // PASO 4: Calcular el promedio
        double promedio = total / 4;
        System.out.println("Promedio de precios: $" + promedio);

        // PASO 5: Subir el precio de los Jeans un 6.2%
        jeans = jeans + (jeans * 0.062);
        System.out.println();
        System.out.println("Subir el precio de los Jeans un 6.2%");
        System.out.println("Nuevo precio Jeans: $" + jeans);

        // PASO 6: Disminuir el precio de los Zapatos un 0.8%
        zapatos = zapatos - (zapatos * 0.008);
        System.out.println();
        System.out.println("Disminuir el precio de los Zapatos un 0.8%");
        System.out.println("Nuevo precio Zapatos: $" + zapatos);

        // PASO 7: Mostrar todos los precios finales
        System.out.println();
        System.out.println("=== PRECIOS FINALES ===");
        System.out.println("Precio de los Zapatos: $" + zapatos);
        System.out.println("Precio de los Tenis: $" + tenis);
        System.out.println("Precio de las Camisetas: $" + camisetas);
        System.out.println("Precio de los Jeans: $" + jeans);

        // PASO 8: Calcular el nuevo total y promedio
        double nuevoTotal = zapatos + tenis + camisetas + jeans;
        double nuevoPromedio = nuevoTotal / 4;

        System.out.println();
        System.out.println("Total: $" + nuevoTotal);
        System.out.println("Promedio de Precios: $" + nuevoPromedio);
    }
}
