package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la posición de partida (fila y columna):");
        int filaInicio = scanner.nextInt();
        int columnaInicio = scanner.nextInt();

        System.out.println("Ingrese la posición final (fila y columna):");
        int filaFinal = scanner.nextInt();
        int columnaFinal = scanner.nextInt();

        boolean movimientoValido = esMovimientoAlfilValido(filaInicio, columnaInicio, filaFinal, columnaFinal);

        if (movimientoValido) {
            mostrarTablero(filaInicio, columnaInicio, filaFinal, columnaFinal);
            System.out.println("El movimiento del alfil es válido.");
        } else {
            System.out.println("El movimiento del alfil no es válido.");
        }
    }

    public static boolean esMovimientoAlfilValido(int filaInicio, int columnaInicio, int filaFinal, int columnaFinal) {
        // Verificar que ambas posiciones estén dentro del tablero de ajedrez (8x8)
        if (filaInicio < 0 || filaInicio >= 8 || columnaInicio < 0 || columnaInicio >= 8 ||
                filaFinal < 0 || filaFinal >= 8 || columnaFinal < 0 || columnaFinal >= 8) {
            return false;
        }

        // Calcular la diferencia entre las filas y las columnas
        int diferenciaFila = Math.abs(filaInicio - filaFinal);
        int diferenciaColumna = Math.abs(columnaInicio - columnaFinal);

        // Un movimiento de alfil es válido si la diferencia en filas es igual a la diferencia en columnas
        return diferenciaFila == diferenciaColumna;
    }

    public static void mostrarTablero(int filaInicio, int columnaInicio, int filaFinal, int columnaFinal) {
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
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