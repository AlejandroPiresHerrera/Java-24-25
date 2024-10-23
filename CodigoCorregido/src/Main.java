// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int filas = 10;
        int columnas = 9;
        int tablero[][] = new int[filas][columnas];
        Random random = new Random();

        // Llenar el tablero con números aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numAleatorio = random.nextInt(10) + 10 * (j + 1); // Generar número entre 10*(j+1) y (10*(j+1) + 9)
                tablero[i][j] = numAleatorio;
            }
        }

        // Ordenar cada columna del tablero
        for (int columna = 0; columna < columnas; columna++) {
            for (int i = 0; i < filas - 1; i++) {
                for (int j = i + 1; j < filas; j++) { // Corrección aquí: j = i + 1
                    if (tablero[i][columna] > tablero[j][columna]) {
                        int aux = tablero[i][columna];
                        tablero[i][columna] = tablero[j][columna];
                        tablero[j][columna] = aux;
                    }
                }
            }
        }

        // Imprimir el tablero
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}