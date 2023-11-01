package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filaInicio, filaFinal;
        char columnaInicio, columnaFinal;

        // Utilizar la clase Validador para validar las entradas
        Validador validador = new Validador();

        // Pedir la posición de partida (fila y columna) y validarla
        columnaInicio = validador.obtenerLetraValida(scanner, "Ingrese la columna de partida (A-H):", "ABCDEFGH");
        filaInicio = validador.obtenerEnteroValido(scanner, "Ingrese la fila de partida (1-8):", 1, 8);

        // Pedir la posición final (fila y columna) y validarla
        columnaFinal = validador.obtenerLetraValida(scanner, "Ingrese la columna de destino (A-H):", "ABCDEFGH");
        filaFinal = validador.obtenerEnteroValido(scanner, "Ingrese la fila de destino (1-8):", 1, 8);

        TableroAjedrez tablero = new TableroAjedrez(8, 8);
        // Mapear letra a número (A=1, B=2, ..., H=8)
        int columnaInicioNumero = columnaInicio - 'A' + 1;
        int columnaFinalNumero = columnaFinal - 'A' + 1;

        boolean movimientoValido = tablero.esMovimientoAlfilValido(filaInicio, columnaInicioNumero, filaFinal, columnaFinalNumero);

        if (movimientoValido) {
            tablero.mostrarTablero(filaInicio, columnaInicioNumero, filaFinal, columnaFinalNumero);
            System.out.println("El movimiento del alfil es válido.");
        } else {
            tablero.mostrarTablero(filaInicio, columnaInicioNumero, filaFinal, columnaFinalNumero);
            System.out.println("El movimiento del alfil no es válido.");
        }
    }
}