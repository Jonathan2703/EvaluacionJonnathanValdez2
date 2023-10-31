package org.example;

public class TableroAjedrez {
    private int filas;
    private int columnas;

    public TableroAjedrez(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public boolean esMovimientoAlfilValido(int filaInicio, int columnaInicio, int filaFinal, int columnaFinal) {
        // Calcular la diferencia en filas y columnas.
        int diferenciaFila = Math.abs(filaInicio - filaFinal);
        int diferenciaColumna = Math.abs(columnaInicio - columnaFinal);

        // Verificar si el alfil se mueve en una diagonal y la diferencia en filas y columnas es la misma.
        boolean esDiagonal = diferenciaFila == diferenciaColumna;

        // Verificar si el movimiento no es en el mismo lugar y es una diagonal.
        if (esDiagonal && diferenciaFila > 0) {
            // El movimiento es válido.
            return true;
        }

        // Si no cumple las condiciones anteriores, el movimiento no es válido.
        return false;
    }

    public void mostrarTablero(int filaInicio, int columnaInicio, int filaFinal, int columnaFinal) {
        for (int fila = 1; fila <= filas; fila++) {
            for (int columna = 1; columna <= columnas; columna++) {
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
