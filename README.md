# EvaluacionJonnathanValdez2
Supongamos que en un tablero de ajedrez (matriz de 8x8), existe una pieza que es  el alfil. En una sola jugada el alfil se puede mover en diagonal a cualquier punto del  tablero tomando como base el punto de partida. Determine si un movimiento es  correcto, se ingresa como datos la posición de partida y posición final. 

# Requisitos
* IntelliJ IDEA (u otro editor de Java de su elección)
* Java 19 (asegúrese de configurar su proyecto para utilizar Java 19)

# Ejecutar en Desarrollo
1. Clonar el proyecto en la bash de su sistema operativo con el siguiente comando ```
   git clone https://github.com/Jonathan2703/EvaluacionJonnathanValdez2.git ```
3. Abrir IntelliJ IDEA o el editor de Java de su elección.
4. Asegúrese de que su configuración de proyecto esté usando Java 19.
5. Ejecute la clase principal `Main` en IntelliJ IDEA.
6. Sigue las instrucciones en la consola para ingresar las coordenadas de partida y destino del alfil.
7. El programa verificará si el movimiento es válido y mostrará el tablero con el movimiento destacado.

# Estructura del Código
* `Main.java` : El punto de entrada del programa que interactúa con el usuario.
* `Validador.java` : Una clase que maneja la validación de entradas numéricas.
* `TableroAjedrez.java` : Una clase que representa el tablero de ajedrez y contiene métodos para validar movimientos de alfil y mostrar el tablero.

# Pruebas del Funcionamiento del Algoritmo
Ejemplo 1 movimiento valido:

![Captura de pantalla 2023-10-30 190355](https://github.com/Jonathan2703/EvaluacionJonnathanValdez2/assets/52688416/1716fedd-d358-4472-95a0-054424d79c2f)

Ejemplo 2 movimiento valido:

![Captura de pantalla 2023-10-30 190509](https://github.com/Jonathan2703/EvaluacionJonnathanValdez2/assets/52688416/f3ce39e2-a9d3-439d-aaf2-25f2ac96c21a)

Ejemplo 3 movimiento no valido:

![Captura de pantalla 2023-10-30 191014](https://github.com/Jonathan2703/EvaluacionJonnathanValdez2/assets/52688416/3eaaa2e2-2072-4a38-b67f-736f3bc67248)

Ejemplo 4 movimiento no valido:

![Captura de pantalla 2023-10-30 195348](https://github.com/Jonathan2703/EvaluacionJonnathanValdez2/assets/52688416/24556d70-d8c6-4095-963a-df8ccca55718)
