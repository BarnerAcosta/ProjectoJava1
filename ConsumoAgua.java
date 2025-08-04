import java.util.Scanner;
import java.text.DecimalFormat;

public class ConsumoAgua {
    public static void main(String[] args) {
        
        // Crear Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);
        
        // Crear formateador para números
        DecimalFormat formato = new DecimalFormat("###,###.##");
        
        // Tarifa por litro
        double tarifaPorLitro = 0.15;
        
        System.out.println("=== CALCULADORA DE CONSUMO DE AGUA ===");
        System.out.println();
        
        // 1. Capturar nombre del usuario
        System.out.print("Ingrese el nombre del usuario o vivienda: ");
        String nombre = sc.nextLine();
        
        // 2. Capturar lectura inicial del medidor (en litros)
        System.out.print("Ingrese la lectura inicial del mes (en litros): ");
        double lecturaInicial = sc.nextDouble();
        
        // 3. Capturar lectura final del medidor (en litros)
        System.out.print("Ingrese la lectura final del mes (en litros): ");
        double lecturaFinal = sc.nextDouble();
        
        // 4. Calcular el consumo total en litros
        double consumoTotal = lecturaFinal - lecturaInicial;
        
        // 5. Calcular el costo total (consumo × tarifa por litro)
        double costoTotal = consumoTotal * tarifaPorLitro;
        
        // 6. Mostrar resumen del consumo y costo
        System.out.println();
        System.out.println("--- Resumen del consumo ---");
        System.out.println("Usuario: " + nombre);
        System.out.println("Consumo: " + formato.format(consumoTotal) + " litros");
        System.out.println("Costo total: $" + formato.format(costoTotal));
        
        // Información adicional
        System.out.println();
        System.out.println("Detalles del cálculo:");
        System.out.println("Lectura inicial: " + formato.format(lecturaInicial) + " litros");
        System.out.println("Lectura final: " + formato.format(lecturaFinal) + " litros");
        System.out.println("Tarifa por litro: $" + tarifaPorLitro);
        
        sc.close();
    }
}
