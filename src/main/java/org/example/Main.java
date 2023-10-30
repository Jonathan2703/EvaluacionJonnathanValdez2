package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filaInicio, columnaInicio, filaFinal, columnaFinal;

        // Utilizar la clase Validador para validar las entradas
        Validador validador = new Validador();

        // Pedir la posición de partida (fila y columna) y validarla
        filaInicio = validador.obtenerEnteroValido(scanner, "Ingrese la fila de partida (1-8):", 1, 8);
        columnaInicio = validador.obtenerEnteroValido(scanner, "Ingrese la columna de partida (1-8):", 1, 8);

        // Pedir la posición final (fila y columna) y validarla
        filaFinal = validador.obtenerEnteroValido(scanner, "Ingrese la fila de destino (1-8):", 1, 8);
        columnaFinal = validador.obtenerEnteroValido(scanner, "Ingrese la columna de destino (1-8):", 1, 8);

        TableroAjedrez tablero = new TableroAjedrez(8, 8);
        boolean movimientoValido = tablero.esMovimientoAlfilValido(filaInicio, columnaInicio, filaFinal, columnaFinal);

        if (movimientoValido) {
            tablero.mostrarTablero(filaInicio, columnaInicio, filaFinal, columnaFinal);
            System.out.println("El movimiento del alfil es válido.");
        } else {
            System.out.println("El movimiento del alfil no es válido.");
        }
    }
}