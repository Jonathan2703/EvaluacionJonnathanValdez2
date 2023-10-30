package org.example;

public class TableroAjedrez {
    private int filas;
    private int columnas;

    public TableroAjedrez(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public boolean esMovimientoAlfilValido(int filaInicio, int columnaInicio, int filaFinal, int columnaFinal) {
        int diferenciaFila = Math.abs(filaInicio - filaFinal); // Obtener la diferencia entre las filas
        int diferenciaColumna = Math.abs(columnaInicio - columnaFinal); // Obtener la diferencia entre las filas y las columnas
        return diferenciaFila == diferenciaColumna; // Si la diferencia de filas es igual a la diferencia de columnas, el movimiento es válido
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
