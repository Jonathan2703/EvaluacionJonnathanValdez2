package org.example;
import java.util.Scanner;

public class Validador {
    public int obtenerEnteroValido(Scanner scanner, String mensaje, int min, int max) {
        int valor;
        do {
            System.out.println(mensaje);
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número válido.");
                scanner.next(); // Limpiar la entrada no válida
            }
            valor = scanner.nextInt();
        } while (valor < min || valor > max);
        return valor;
    }
}
