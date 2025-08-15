import java.util.Scanner;

public class IvaPorCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entradas
        System.out.print("Ingrese la categoría: ");
        String categoria = sc.nextLine().toLowerCase();

        System.out.print("Ingrese el precio base: ");
        double precioBase = sc.nextDouble();

        double porcentajeIva;
        switch (categoria) {
            case "alimentos":
                porcentajeIva = 0.08;
                break;
            case "tecnologia":
                porcentajeIva = 0.19;
                break;
            case "vestuario":
                porcentajeIva = 0.12;
                break;
            default:
                porcentajeIva = -1;
                break;
        }

        if (porcentajeIva == -1) {
            System.out.println("Categoría no válida. Intente con: alimentos, tecnologia o vestuario.");
        } else {
            double iva = precioBase * porcentajeIva;
            double total = precioBase + iva;
            System.out.println("Subtotal: $" + precioBase);
            System.out.println("IVA (" + (porcentajeIva * 100) + "%): $" + iva);
            System.out.println("Total: $" + total);
        }

        sc.close();
    }
}