// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;

public class Main {
    private static int[][] crearTablero(int filas, int columnas) {
        int[][] tablero = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numAleatorio = random.nextInt(10 * (j + 1), (10 * (j + 1) + 10));
                tablero[i][j] = numAleatorio;
            }
        }
        return tablero;
    }

    private static void ordenarPorColumnas(int[][] tablero, int filas, int columnas) {
        for (int columna = 0; columna < columnas; columna++) {
            for (int i = 0; i < filas - 1; i++) {
                for (int j = i + 1; j < filas; j++) {
                    if (tablero[i][columna] > tablero[j][columna]) {
                        int aux = tablero[i][columna];
                        tablero[i][columna] = tablero[j][columna];
                        tablero[j][columna] = aux;
                    }
                }
            }
        }
    }

    private static void imprimirTablero(int[][] tablero, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int filas = 10;
        int columnas = 9;
        int[][] tablero = crearTablero(filas, columnas);
        ordenarPorColumnas(tablero, filas, columnas);
        imprimirTablero(tablero, filas, columnas);
    }

}