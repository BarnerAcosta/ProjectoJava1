package ejercicio3;

public class OperacionesArimetricas {
    // Atributos
    public int num1;
    public int num2;

    // Metodos
    public void sumar() {
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }

    public void restar() {
        int resta = num1 - num2;
        System.out.println("La resta es: " + resta);
    }

    public void multiplicar() {
        int producto = num1 * num2;
        System.out.println("La multiplicación es: " + producto);
    }

    public void dividir() {
        if (num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println("La división es: " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }

}
