import java.util.*;

public class EstadisticasLecturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada: cantidad de lecturas
        System.out.print("Ingrese la cantidad de lecturas (N): ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("No hay lecturas para procesar.");
            sc.close();
            return;
        }

        List<Double> lecturas = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            System.out.printf("Ingrese el valor #%d: ", i);
            lecturas.add(sc.nextDouble());
        }

        // Estadísticas
        double suma = 0, min = lecturas.get(0), max = lecturas.get(0);
        for (double valor : lecturas) {
            suma += valor;
            if (valor < min)
                min = valor;
            if (valor > max)
                max = valor;
        }
        double promedio = suma / N;

        // Salida
        System.out.println("\n--- Resumen de lecturas ---");
        int idx = 1;
        for (double valor : lecturas) {
            System.out.printf("%d. %.2f\n", idx++, valor);
        }
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.printf("Mínimo: %.2f\n", min);
        System.out.printf("Máximo: %.2f\n", max);

        sc.close();
    }
}
