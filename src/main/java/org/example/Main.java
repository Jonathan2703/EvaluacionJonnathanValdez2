package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filaInicio, columnaInicio, filaFinal, columnaFinal;

        // Pedir la posición de partida (fila y columna) y validarla
        do {
            System.out.println("Ingrese la fila de partida (1-8):");
            filaInicio = obtenerEnteroValido(scanner);
        } while (filaInicio < 1 || filaInicio > 8);

        do {
            System.out.println("Ingrese la columna de partida (1-8):");
            columnaInicio = obtenerEnteroValido(scanner);
        } while (columnaInicio < 1 || columnaInicio > 8);

        // Pedir la posición final (fila y columna) y validarla
        do {
            System.out.println("Ingrese la fila de destino (1-8):");
            filaFinal = obtenerEnteroValido(scanner);
        } while (filaFinal < 1 || filaFinal > 8);

        do {
            System.out.println("Ingrese la columna de destino (1-8):");
            columnaFinal = obtenerEnteroValido(scanner);
        } while (columnaFinal < 1 || columnaFinal > 8);

        boolean movimientoValido = esMovimientoAlfilValido(filaInicio, columnaInicio, filaFinal, columnaFinal);

        if (movimientoValido) {
            mostrarTablero(filaInicio, columnaInicio, filaFinal, columnaFinal);
            System.out.println("El movimiento del alfil es válido.");
        } else {
            System.out.println("El movimiento del alfil no es válido.");
        }
    }

    public static int obtenerEnteroValido(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un número válido.");
            scanner.next(); // Limpiar la entrada no válida
        }
        return scanner.nextInt();
    }

    public static boolean esMovimientoAlfilValido(int filaInicio, int columnaInicio, int filaFinal, int columnaFinal) {
        // Calcular la diferencia entre las filas y las columnas
        int diferenciaFila = Math.abs(filaInicio - filaFinal);
        int diferenciaColumna = Math.abs(columnaInicio - columnaFinal);

        // Un movimiento de alfil es válido si la diferencia en filas es igual a la diferencia en columnas
        return diferenciaFila == diferenciaColumna;
    }

    public static void mostrarTablero(int filaInicio, int columnaInicio, int filaFinal, int columnaFinal) {
        for (int fila = 1; fila <= 8; fila++) {
            for (int columna = 1; columna <= 8; columna++) {
                if ((fila == filaInicio && columna == columnaInicio) || (fila == filaFinal && columna == columnaFinal)) {
                    System.out.print("A "); // Representa la posición inicial y final del alfil
                } else {
                    System.out.print(". "); // Representa las casillas vacías
                }
            }
            System.out.println(); // Nueva fila del tablero
        }
    }
}