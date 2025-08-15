import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /*System.out.print("Otro, Mundo!");
        System.out.println("Programación en Java");
        System.out.print("¡Hola, Java!"); */

        //Manejo de Variables
        // int edad = 10;
        // System.out.println("La edad es: "+ edad);
        
        // double precio = 19.99;
        // char letra = 'A';
        // boolean esVerdadero = true;
        // String mensaje = "¡Hola, Java!";

        // int numero1 = 5;
        // int numero2 = 10;

        // int resultadoSuma = numero1 + numero2;
        // System.out.println("El resultado de la suma es: " + resultadoSuma);


        //Uso de scanner para entrada de datos desde consola
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Nombre: " + nombre);

        //Capturar un numero entero
        System.out.print("Ingrese su edad: ");
        String edad = sc.nextLine();
        System.out.println("Edad: " + edad);

        //Capturar un numero decimal
        System.out.print("Ingrese su altura: ");
        double altura = sc.nextDouble();
        System.out.println("Altura: " + altura);

        //Capturar un caracter
        System.out.print("Ingrese su inicial: ");
        char inicial = sc.next().charAt(0);
        System.out.println("Inicial: " + inicial);

        //Capturar un booleano
        System.out.print("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = sc.nextBoolean();
        System.out.println("Eres estudiante: " + esEstudiante);

        //Mostrar datos capturados
        System.out.println("\n=== Datos capturados ===:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);


        //Capturar un string
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        System.out.println("Frase: " + frase);

        //Capturar un numero entero
        System.out.print("Ingrese un numero entero: ");
        int numeroEntero = sc.nextInt();
        System.out.println("Numero entero: " + numeroEntero);


        sc.close(); // Cerrar el scanner para evitar fugas de recursos




    }
}
